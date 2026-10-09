## ℹ️ Information About My Code

The application models a shape hierarchy system that calculates geometric properties (such as surface area and volume) for different 2D and 3D shapes. It showcases key Object-Oriented Programming (OOP) principles—**Encapsulation**, **Inheritance**, and **Polymorphism**—to create a flexible and reusable codebase.

1. **`Shape.java`**: The base class (superclass) that defines common properties like `colour` and generic methods like `printInfo()`.
2. **`Circle.java`**: Derived class extending `Shape`, adding a `radius` attribute and specific area calculation logic.
3. **`Rectangle.java`**: Derived class extending `Shape`, adding a `side` attribute and square/rectangle area calculation logic.
4. **`Cylinder.java`**: Derived class extending `Circle` (multilevel inheritance), adding a `height` attribute and volume calculation logic using inherited circle area methods.
5. **`Main.java`**: The entry point of the program that demonstrates polymorphic behavior using a superclass array to store and execute methods on various shape objects.

---

## 💡 Implementation of OOP Concepts

### Explanation

* **Encapsulation**: Fields like `radius`, `side`, and `height` are declared `private` to restrict direct external access. They are safely accessed and modified through public **getter** and **setter** methods (e.g., `getRadius()`, `setRadius()`).

* **Inheritance**: Subclasses inherit state and behavior from superclasses using the `extends` keyword. `Circle` and `Rectangle` inherit from `Shape`, while `Cylinder` inherits from `Circle` using `super()` to reuse constructor initialization logic.

* **Polymorphism**: The `Main` class stores different shape instances (`Shape`, `Rectangle`, `Circle`, `Cylinder`) inside a single `Shape[]` array. During execution, calling `printInfo()` dynamically executes the overridden `@Override` method corresponding to each actual object type at runtime.

---

### Usage in Code

```java
// 1. Polymorphism: Storing child objects in a parent reference array
Shape[] genshape = new Shape[4];
genshape[0] = new Shape("Cyan");
genshape[1] = new Rectangle(6.0, "Gold");      // Inheritance & Polymorphism
genshape[2] = new Circle(14.0, "Scarlett");     // Inheritance & Polymorphism
genshape[3] = new Cylinder(8.0, 7.0, "Violett"); // Multilevel Inheritance

// 2. Encapsulation & Polymorphic Execution
for (Shape shape : genshape) {
    shape.printInfo(); // Executes overridden printInfo() based on actual object type
}
```

---

### Example Output

```text
=== Shape ===
The Shape colored is Cyan

=== Rectangle ===
Rectangle colored is Gold, Surface area is = 36.0

=== Circle ===
Circle colored is Scarlett Surface area is = 615.7521601035994

== Cylinder ===
Cylinder colored is Violett, Volume is = 1231.5043202071988
```