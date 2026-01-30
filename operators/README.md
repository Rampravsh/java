# Java Operators

In Java, operators are special symbols that perform specific operations on one, two, or three operands, and then return a result. The operators in Java are categorized based on the functionality they provide.

## 1. Arithmetic Operators

These operators are used to perform arithmetic calculations.

| Operator | Description        | Example     |
| :------- | :----------------- | :---------- |
| `+`      | Addition           | `a + b`     |
| `-`      | Subtraction        | `a - b`     |
| `*`      | Multiplication     | `a * b`     |
| `/`      | Division           | `a / b`     |
| `%`      | Modulus (Remainder)| `a % b`     |

## 2. Unary Operators

Unary operators need only one operand. They are used to increment, decrement, or negate a value.

| Operator | Description                               | Example     |
| :------- | :---------------------------------------- | :---------- |
| `++`     | Increment operator (pre and post)         | `a++` or `++a`|
| `--`     | Decrement operator (pre and post)         | `a--` or `--a`|
| `-`      | Unary minus (inverts the sign of an expression) | `-a`        |
| `!`      | Logical NOT operator (inverts a boolean value) | `!a`        |

## 3. Assignment Operators

These operators are used to assign values to a variable.

| Operator | Description                           | Example       |
| :------- | :------------------------------------ | :------------ |
| `=`      | Simple assignment                     | `a = b`       |
| `+=`     | Add and assign                        | `a += b` (a = a + b) |
| `-=`     | Subtract and assign                   | `a -= b` (a = a - b) |
| `*=`     | Multiply and assign                   | `a *= b` (a = a * b) |
| `/=`     | Divide and assign                     | `a /= b` (a = a / b) |
| `%=`     | Modulus and assign                    | `a %= b` (a = a % b) |

## 4. Relational Operators

These operators are used to check the relationship between two operands. They return a boolean value (`true` or `false`).

| Operator | Description              | Example     |
| :------- | :----------------------- | :---------- |
| `==`     | Equal to                 | `a == b`    |
| `!=`     | Not equal to             | `a != b`    |
| `>`      | Greater than             | `a > b`     |
| `<`      | Less than                | `a < b`     |
| `>=`     | Greater than or equal to | `a >= b`    |
| `<=`     | Less than or equal to    | `a <= b`    |

## 5. Logical Operators

These operators are used to perform "logical AND", "logical OR" and "logical NOT" operations. They are typically used with boolean values.

| Operator | Description | Example         |
| :------- | :---------- | :-------------- |
| `&&`     | Logical AND | `exp1 && exp2`  |
| `||`     | Logical OR  | `exp1 || exp2`  |
| `!`      | Logical NOT | `!exp`          |


## Operator Precedence and Associativity

Operator precedence determines the grouping of terms in an expression and decides how an expression is evaluated. Associativity determines the direction in which an expression is evaluated when two operators of the same precedence appear in the expression.

| Precedence | Operator                                | Associativity      |
| :--------- | :-------------------------------------- | :----------------- |
| 1          | `()` `[]` `.`                           | Left to Right      |
| 2          | `++` `--` `!` `~` `+` `-` `(type)`       | Right to Left      |
| 3          | `*` `/` `%`                             | Left to Right      |
| 4          | `+` `-`                                 | Left to Right      |
| 5          | `<<` `>>` `>>>`                         | Left to Right      |
| 6          | `<` `<=` `>` `>=` `instanceof`          | Left to Right      |
| 7          | `==` `!=`                               | Left to Right      |
| 8          | `&` (Bitwise AND)                       | Left to Right      |
| 9          | `^` (Bitwise XOR)                       | Left to Right      |
| 10         | `|` (Bitwise OR)                        | Left to Right      |
| 11         | `&&` (Logical AND)                      | Left to Right      |
| 12         | `||` (Logical OR)                       | Left to Right      |
| 13         | `?:` (Ternary)                          | Right to Left      |
| 14         | `=` `+=` `-=` `*=` `/=` `%=` `&=` `^=` `|=` `<<=` `>>=` `>>>=`  Right to Left      |
