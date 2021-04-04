# Simple Modular Quiz (Challenge #1)

###### Application Type: Console Application
###### Time: 2 hours
###### Max points: 100
###### Example Count: 1

## Information
Following this challenge you will learn:
- Basic file reading
- How to make a console application
- How to write modular systems

The project must contain the following features:
- An easy way to add multiple questions (using files)
- A way to stop the program by sending a specific String (the string should be "stop" with the quotes)
- A way of letting the user know how many questions they answered (this can be indicated by a small number at the end of the question, something like (5/7)).

**Note:** In order to mark this challenge as completed you shouldn't use any external help sources. If you are stuck, please go to the "Tips" section below.

## Points
If you would like to award yourself a score, here is a table to follow:
| **Requirement**                                                                                       | **Points** |
|-------------------------------------------------------------------------------------------------------|------------|
| The system can be stopped using the keyword "stop".                                                   | 15         |
| There is an easy way of adding new questions.                                                         | 25         |
| The program shows the user how many questions they answered and how many they have left.                                                         | 10         |
| You took less than 2 hours to write this program.                                                     | 10         |
| The program doesn't have any errors.                                                                  | 15         |
| You tested the program with the values specified in the "Testing" section and it responded correctly. | 15         |
| You took less than 10 attempts.                                                                       | 10         |

**Note:** The maximum points you can get is **100**. There are some requirements that can deduct points. You can't deduct more points than the requirement is offering. For instance you can only offer a penalty of up to 10 points for taking more than 2 hours.
- For each attempt after 10 you can deduct 5 points.
- For each 15 minutes after 2 hours you can deduct 5 points.
- For each test that failed you can deduct the number of points specified.

## Testing
##### Test 1 (15 points)
- Create a question called "Do you like apples?".
- Create a question called "Do you like oranges?" right after the "Do you like apples?" one.
- Start the program and answer to the apples question, then check if the program asks you the "Do you like oranges?" one.

## Tips
1. You should have a class that represents a question.
2. You should use the Scanner class to read the data from the console.
3. You should use a special character to divide the questions.