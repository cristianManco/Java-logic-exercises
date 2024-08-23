
---

# Java Programming Logic Exercises

This repository contains a collection of programming logic exercises implemented in Java. The exercises range from basic to advanced levels, making it a useful resource for practicing and improving your problem-solving skills in Java.

## About Java

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a versatile language used for building a variety of applications, from mobile apps to large-scale enterprise systems. Java is known for its portability across platforms, thanks to the Java Virtual Machine (JVM).

### Key Features of Java:
- **Object-Oriented**: Everything in Java is an object, which allows for modular programs and reusable code.
- **Platform-Independent**: Java code is compiled into bytecode, which can be run on any system that has a JVM.
- **Robust**: Java has strong memory management, exception handling, and a rich API for dealing with complex tasks.
- **Secure**: Java provides a secure environment for developing applications, with built-in security features.

## Examples of Exercises

Below are some of the exercises included in this repository, along with their solutions:

### 1. Calculate the Area of a Triangle
**Difficulty Level**: Easy

```java
public class TriangleArea {
    public static void main(String[] args) {
        double base = 5.0;
        double height = 3.0;
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
    }
}
```

### 2. Calculate the Body Mass Index (BMI)
**Difficulty Level**: Medium

```java
public class BMICalculator {
    public static void main(String[] args) {
        double weight = 70.0; // in kilograms
        double height = 1.75; // in meters
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
    }
}
```

### 3. Determine the Tuition Fee Based on Academic Performance
**Difficulty Level**: Medium

```java
public class TuitionFee {
    public static void main(String[] args) {
        int subjects = 5;
        double costPerSubject = 200.0;
        double averageGrade = 4.2;

        double tuitionFee = subjects * costPerSubject;
        if (averageGrade >= 4) {
            tuitionFee *= 0.7; // 30% discount
        } else {
            tuitionFee *= 1.19; // Adding 19% VAT
        }

        System.out.println("The tuition fee to pay is: " + tuitionFee);
    }
}
```

### 4. Real Estate Company Payment Plan
**Difficulty Level**: Hard

```java
public class RealEstatePayment {
    public static void main(String[] args) {
        double houseCost = 1500000.0;
        double buyerIncome = 3500000.0;
        double initialPayment;
        double monthlyPayment;

        if (buyerIncome > 3000000.0) {
            initialPayment = houseCost * 0.3;
        } else {
            initialPayment = houseCost * 0.2;
        }

        monthlyPayment = (houseCost - initialPayment) / (15 * 12); // 15 years payment plan

        System.out.println("Initial payment: " + initialPayment);
        System.out.println("Monthly payment: " + monthlyPayment);
    }
}
```

## Further Practice

For more exercises and to continue improving your programming skills, you can visit the following link:

[Practice More Java Algorithms](https://rojastobias.blogspot.com/p/algoritmos-i_20.html)

## How to Use This Repository

1. **Clone the repository**: 
    ```
    git clone https://github.com/yourusername/java-logic-exercises.git
    ```
2. **Explore the exercises**: Browse through the `src` directory to find different exercises categorized by difficulty level.
3. **Run the exercises**: Use any Java IDE or the command line to compile and run the exercises.
    ```
    javac FileName.java
    java FileName
    ```

## Contributing

Feel free to contribute by adding new exercises or improving the existing ones. Please follow the contribution guidelines outlined in the repository.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

