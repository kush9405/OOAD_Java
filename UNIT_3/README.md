**Creator Pattern**
```bash
javac Main2.java
java Main2

```
**Expected Output**
```bash
Title: The Great Gatsby, Author: F. Scott Fitzgerald
Title: 1984, Author: George Orwell
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
javac Traveler.java Vehicle.java

java Traveler
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
