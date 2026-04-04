# BigDecimal Operations in Java

## Overview
This Java program demonstrates basic arithmetic operations using the `BigDecimal` class to handle precise decimal calculations. The program performs addition, multiplication, and subtraction on two BigDecimal numbers.

## Code Explanation
```java
import java.math.BigDecimal;

public class BigDecimalOperations {
    public static void main(String[] args) {
        // Initializing BigDecimal numbers
        BigDecimal bd1 = new BigDecimal("124567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.123456789");

        // Adding two BigDecimal numbers
        BigDecimal sum = bd1.add(bd2);
        System.out.println("Sum = " + sum);

        // Multiplying two BigDecimal numbers
        BigDecimal mul = bd1.multiply(bd2);
        System.out.println("Product = " + mul);

        // Subtracting one BigDecimal number from another
        BigDecimal sub = bd1.subtract(bd2);
        System.out.println("Difference = " + sub);
    }
}
```

## Instructions
1. **Compile the Program:**
   - Save the code in a file named `BigDecimalOperations.java`.
   - Open a terminal and navigate to the directory containing the file.
   - Compile the program using the command:
     ```
     javac BigDecimalOperations.java
     ```

2. **Run the Program:**
   - After compiling, run the program with the command:
     ```
     java BigDecimalOperations
     ```

3. **Output:**
   - The program will display the results of addition, multiplication, and subtraction of the two `BigDecimal` numbers.

## Notes
- `BigDecimal` is used for precise arithmetic operations, especially with decimal numbers where floating-point arithmetic may result in precision loss.
- Always initialize `BigDecimal` using the `String` constructor to avoid any rounding errors that may occur when using the `double` constructor.

Feel free to customize the program or incorporate it into your project as needed.