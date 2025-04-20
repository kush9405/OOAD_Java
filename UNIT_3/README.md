**this is for information expert**

```bash
javac Item.java ShoppingCart.java ShoppingCartTest.java

java ShoppingCartTest

```

**demonstrating loose coupling**
```bash
javac Traveler.java Vehicle.java

java Traveler
```

**creating a simple system using GRASP**
GRASP Principles Applied

**Information Expert** → Book and User classes manage their own data.
**Creator** → Library class creates Book and User objects.
**Controller** → LibraryController handles user interactions.
**Low Coupling & High Cohesion** → Separate classes with clear responsibilities.
**Polymorphism** → Different types of users (e.g., Student, Professor).

```bash
javac *.java
java Main
```
