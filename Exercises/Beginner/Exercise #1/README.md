# The sum of digits of a number (Exercise #1)

###### Application Type: Console Application

## Information

The program should allow you to input numbers in the console and calculate the sum of the digits.

## Testing
##### Test 1
- Type 12345 in the console.
- The program should respond with 15.

## Tips
1. You should use the Scanner class to read the data from the console.
2. Use the % and / operators.

## Working code samples
<details>
  <summary>Solution #1</summary>
  
  ```java
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt())
        {
            int number = scanner.nextInt();
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }

            System.out.println("Sum = " + sum);
        }
  ```
  
</details>