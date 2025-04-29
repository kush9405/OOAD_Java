**Creator Pattern**
```bash
javac Main1.java OrderService.java 
java Main1

```
**Expected Output**
```bash
Order saved for customer: John Doe with products: /[Laptop, Mouse]
```

**Information expert**

```bash
javac Item.java ShoppingCart.java 

java ShoppingCart

```
**Expected Output**
```bash
Item: Laptop, Price: 999.99
Item: Mouse, Price: 25.5
Total Price: 1025.49
```


**demonstrating loose coupling**
```bash
javac Traveler.java Vehicle.java & java Traveler
```

**creating a simple system using GRASP**
GRASP Principles Applied

- Information Expert → Book and User classes manage their own data.

- Creator → Library class creates Book and User objects.

- Controller → LibraryController handles user interactions.

- Low Coupling & High Cohesion → Separate classes with clear responsibilities.

- Polymorphism → Different types of users (e.g., Student, Professor).


```bash
javac -d . Main.java librarysystem/*.java
java Main
```
**Expected Output**
```bash
Alice (User ID: 1)
Kushagra (User ID: 2)
1984 by George Orwell (Available)
To Kill a Mockingbird by Harper Lee (Available)
Book borrowed successfully!
1984 by George Orwell (Borrowed)
To Kill a Mockingbird by Harper Lee (Available)
```

**Single  Responsiblity Principle**
```bash
javac BookManagement.java
java BookManagement
```
**Expected Output**
```bash
Book found! ID: 10
Book doesn't exist
```

**Open Closed Principle**

```bash
javac LibrarySystem.java
java LibrarySystem
```

**Expected Output**
```bash
Book ID: 10
Book ID: 100
Book ID: 55
```

**Liskov Substitution Principle**

```bash
javac LSP.java
java LSP
```

**Expected Output**
```bash
This bird is eating.
The duck is flying.
This bird is eating.
The penguin is swimming.
```

**Interface Segregation Principle**

```bash
javac Isp.java
java Isp
```

**Expected Output**
```bash
Sparrow is flying.
Sparrow is walking.
Penguin is walking.
Penguin is swimming.
```
**Data Inversion Principle**

```bash
javac Dip.java
java Dip
```

**Expected Output**
```bash
Turning on the TV.
Watching movie.

Turning on the Projector.
Watching movie.
```

**Singleton Pattern**
```bash
javac Printer.java Employee.java
java Employee
```

**Expected Output**
```bash
Employee: John Doe
Role: Software Engineer
Assignment: Project A

Pages printed today 1
---------
Employee: Jessica
Role: Software Engineer
Assignment: Project B

Pages printed today 2
---------
```


**Chain Of responsiblity**
```bash
javac ChainOfResponsibility.java 
java ChainOfResponsibility
```

**Expected Output**
```bash
Invalid Amount. Amount should not exceed 25Lacs!
Transaction for amount 50000.0 approved by Manager
Transaction for amount 120000.0 approved by Vice President
Transaction for amount 1500000.0 approved by CEO
Invalid Amount. Amount should be › 0
```


**Command Pattern**
```bash
javac -d . Stocks/*.java
java Stocks/CommandPatternDemo
```

**Expected Output**
```bash
Stock /[ Name: ABC,  Quantity: 10 ] bought
Stock /[ Name: ABC,  Quantity: 10 ] sold
```

**Interpreter Pattern**
```bash
javac -d . Interpreter/*.java
java Interpreter/InterpreterPatternExample
```

**Expected Output**
```bash
4
```

**Iterator Pattern**
```bash
javac -d . Iterator/*.java         
java Iterator/IteratorRealWorldExample
```

**Expected Output**
```bash
Iterating over collection:
Item 4
Item 8
```

