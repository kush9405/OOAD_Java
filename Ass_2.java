import java.util.*; // Import necessary classes

// Flyweight pattern implementation

// WordType class
class WordType {
    private final String type;
    
    public WordType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
}

// WordStyle class
class WordStyle {
    private final String style;
    
    public WordStyle(String style) {
        this.style = style;
    }
    
    public String getStyle() {
        return style;
    }
}

// WordTypeFactory - Flyweight factory
class WordTypeFactory {
    private static final WordTypeFactory instance = new WordTypeFactory();
    private final Map<String, WordType> typeMap = new HashMap<>();
    
    private WordTypeFactory() {}
    
    public static WordTypeFactory getInstance() {
        return instance;
    }
    
    public WordType getWordType(String type) {
        return typeMap.computeIfAbsent(type, WordType::new);
    }
}

// WordStyleFactory - Flyweight factory
class WordStyleFactory {
    private static final WordStyleFactory instance = new WordStyleFactory();
    private final Map<String, WordStyle> styleMap = new HashMap<>();
    
    private WordStyleFactory() {}
    
    public static WordStyleFactory getInstance() {
        return instance;
    }
    
    public WordStyle getWordStyle(String style) {
        return styleMap.computeIfAbsent(style, WordStyle::new);
    }
}

// Word class
class Word {
    private String text;
    private int position;
    private WordType type;
    private WordStyle style;
    
    public Word(String text, int position, WordType type, WordStyle style) {
        this.text = text;
        this.position = position;
        this.type = type;
        this.style = style;
    }
    
    public String getText() {
        return text;
    }
    
    public int getPosition() {
        return position;
    }
    
    public WordType getType() {
        return type;
    }
    
    public WordStyle getStyle() {
        return style;
    }
}

// Chain of Responsibility pattern implementation

// TextFormatter interface
interface TextFormatter {
    String format(Word word);
    void setNext(TextFormatter next);
}

// Abstract base class for formatters
abstract class BaseFormatter implements TextFormatter {
    protected TextFormatter nextFormatter;
    
    @Override
    public void setNext(TextFormatter next) {
        this.nextFormatter = next;
    }
    
    // Default implementation for passing to the next formatter
    protected String passToNext(Word word) {
        if (nextFormatter != null) {
            return nextFormatter.format(word);
        }
        return word.getText(); // If no formatter can handle it, return the original text
    }
}

// Concrete formatter implementations
class BoldFormatter extends BaseFormatter {
    @Override
    public String format(Word word) {
        if ("bold".equals(word.getStyle().getStyle())) {
            return "<b>" + word.getText() + "</b>";
        }
        return passToNext(word);
    }
}

class ItalicFormatter extends BaseFormatter {
    @Override
    public String format(Word word) {
        if ("italic".equals(word.getStyle().getStyle())) {
            return "<i>" + word.getText() + "</i>";
        }
        return passToNext(word);
    }
}

class UnderlineFormatter extends BaseFormatter {
    @Override
    public String format(Word word) {
        if ("underline".equals(word.getStyle().getStyle())) {
            return "<u>" + word.getText() + "</u>";
        }
        return passToNext(word);
    }
}

// Sentence class to handle words in order
class Sentence {
    private List<Word> wordList = new ArrayList<>();
    private TextFormatter formatterChain;
    
    public Sentence(TextFormatter formatterChain) {
        this.formatterChain = formatterChain;
    }
    
    public void addWord(Word word) {
        wordList.add(word);
    }
    
    public void display() {
        // Sort words by position
        wordList.sort(Comparator.comparing(Word::getPosition));
        
        StringBuilder result = new StringBuilder();
        for (Word word : wordList) {
            String formattedText = formatterChain.format(word);
            result.append(formattedText).append(" ");
        }
        
        System.out.println(result.toString().trim());
    }
}

// Word processor class
class WordProcessor {
    protected TextFormatter formatterChain;
    
    public WordProcessor() {
        // Initialize the Chain of Responsibility
        TextFormatter boldFormatter = new BoldFormatter();
        TextFormatter italicFormatter = new ItalicFormatter();
        TextFormatter underlineFormatter = new UnderlineFormatter();
        
        boldFormatter.setNext(italicFormatter);
        italicFormatter.setNext(underlineFormatter);
        
        this.formatterChain = boldFormatter;
    }
    
    public Sentence createSentence() {
        return new Sentence(formatterChain);
    }
    
    public Word createWord(String text, int position, String type, String style) {
        WordType wordType = WordTypeFactory.getInstance().getWordType(type);
        WordStyle wordStyle = WordStyleFactory.getInstance().getWordStyle(style);
        return new Word(text, position, wordType, wordStyle);
    }
}

// Main class to demonstrate the system
public class WordProcessingDemo {
    public static void main(String[] args) {
        WordProcessor processor = new WordProcessor();
        
        // Create a sentence
        Sentence sentence = processor.createSentence();
        
        // Create words with different types and styles
        Word word1 = processor.createWord("The", 1, "article", "normal");
        Word word2 = processor.createWord("quick", 2, "adjective", "italic");
        Word word3 = processor.createWord("brown", 3, "adjective", "bold");
        Word word4 = processor.createWord("fox", 4, "noun", "underline");
        Word word5 = processor.createWord("jumps", 5, "verb", "bold");
        Word word6 = processor.createWord("over", 6, "preposition", "italic");
        Word word7 = processor.createWord("the", 7, "article", "normal");
        Word word8 = processor.createWord("lazy", 8, "adjective", "underline");
        Word word9 = processor.createWord("dog", 9, "noun", "bold");
        
        // Add words to the sentence (intentionally out of order to demonstrate sorting)
        sentence.addWord(word3);
        sentence.addWord(word1);
        sentence.addWord(word9);
        sentence.addWord(word5);
        sentence.addWord(word2);
        sentence.addWord(word8);
        sentence.addWord(word6);
        sentence.addWord(word4);
        sentence.addWord(word7);
        
        // Display the sentence
        System.out.println("Formatted sentence:");
        sentence.display();
        
        // Demonstrate extensibility by adding a new formatter for a new style
        System.out.println("\nDemonstrating extensibility:");
        
        // Create a new formatter for a new style (uppercase)
        class UppercaseFormatter extends BaseFormatter {
            @Override
            public String format(Word word) {
                if ("uppercase".equals(word.getStyle().getStyle())) {
                    return word.getText().toUpperCase();
                }
                return passToNext(word);
            }
        }
        
        // Create a new word processor with the new formatter
        WordProcessor newProcessor = new WordProcessor() {
            {
                // Override the constructor to add our new formatter
                TextFormatter uppercaseFormatter = new UppercaseFormatter();
                TextFormatter boldFormatter = new BoldFormatter();
                TextFormatter italicFormatter = new ItalicFormatter();
                TextFormatter underlineFormatter = new UnderlineFormatter();
                
                uppercaseFormatter.setNext(boldFormatter);
                boldFormatter.setNext(italicFormatter);
                italicFormatter.setNext(underlineFormatter);
                
                this.formatterChain = uppercaseFormatter;
            }
            
            @Override
            public Sentence createSentence() {
                return new Sentence(formatterChain);
            }
        };
        
        // Create a new sentence with the new processor
        Sentence newSentence = newProcessor.createSentence();
        
        // Add some words with the new style
        Word word10 = newProcessor.createWord("This", 1, "pronoun", "uppercase");
        Word word11 = newProcessor.createWord("is", 2, "verb", "normal");
        Word word12 = newProcessor.createWord("an", 3, "article", "italic");
        Word word13 = newProcessor.createWord("extended", 4, "adjective", "bold");
        Word word14 = newProcessor.createWord("example", 5, "noun", "underline");
        
        newSentence.addWord(word10);
        newSentence.addWord(word11);
        newSentence.addWord(word12);
        newSentence.addWord(word13);
        newSentence.addWord(word14);
        
        // Display the new sentence
        newSentence.display();
    }
}