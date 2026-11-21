# Object-Oriented Programming (OOP) Assignment - Java

This repository was created to fulfill the assignment requirements for the **Object-Oriented Programming (OOP)** course. This project implements fundamental to intermediate OOP concepts using the **Java** programming language.

##  Author

* **Name:** Lalu Helmi Firdaus
* **NIM:** F1D02510119
* **Class:** A

##  Core Concepts Covered

### 1. Array & ArrayList

#### Array
An **Array** is a fundamental data structure in Java used to store multiple values of the same type in a single variable. It has a **fixed size** that must be defined at the time of creation and cannot be changed during execution.

#### ArrayList
An **ArrayList** is part of the `java.util` package and represents a **dynamic array** in Java. Unlike standard arrays, an ArrayList can automatically resize itself (grow or shrink) as elements are added or removed.

### 2. Inheritance & Polymorphism

#### Inheritance
**Inheritance** is an OOP mechanism that allows a class (subclass/child class) to inherit attributes and methods from another class (superclass/parent class). It promotes **code reusability** and establishes a hierarchical relationship between classes using the `extends` keyword.

#### Polymorphism
**Polymorphism** means "many forms". It allows objects of different classes to be treated as objects of a common superclass. In Java, polymorphism enables a single interface or method call to behave differently depending on the underlying object instance.

### 3. Graphical User Interface (GUI)

**GUI (Graphical User Interface)**

A GUI allows users to interact with a Java application visually through graphical components—such as windows, buttons, labels, and text areas—rather than relying solely on a text-based console. In Java, GUIs are commonly built using the `javax.swing` and `java.awt` packages.

**Swing Component Hierarchy**

* **Top-Level Container:** The foundational window that holds all other visual elements (e.g., `JFrame`).
* **Intermediate Container:** Panels and scroll panes used to group and organize components inside the main window (e.g., `JPanel`, `JScrollPane`).
* **Atomic Component:** Individual interactive or display elements that users directly view or manipulate (e.g., `JButton`, `JLabel`, `JTextArea`).

**Layout Managers**

Layout managers control the positioning and sizing of components inside a container automatically (e.g., `BorderLayout` for arranging elements into five regions, and `FlowLayout` for placing components sequentially in a row).

**Event-Driven Programming (Event Listeners)**

Java GUIs respond to user interactions—such as button clicks—using **Event Listeners** (e.g., implementing `ActionListener` or overriding `actionPerformed()` via lambda expressions) to execute specific logic when an event occurs.
