# Counting Occurrences (Exercise #2)

###### Application Type: Console Application

## Information

The program should allow you to input a string in the console. After you hit enter, the program should require another string: the search one. After typing the string and hitting enter, the program should respond with the number of times the search string has been found in the first string.

## Data Flow

- [ Start ] 
- Program: ``Main String:``
- \*user inputs a string and hits enter\*
- Program: ``Search String:``
- \*user inputs another string and hits enter\*
- Program: ``The occurrence count is x times.``
- [ End ]

## Example

``Main String:`` I like Java very very much.

``Search String:`` very

``Response:`` The occurrence count is 2 times.

## Testing
##### Test 1
- Type ``I like Java very very much.`` in the console and hit enter.
- Type ``very`` in the console and hit enter.
- The program should respond with ``2`` or any alternative message like the example above (to be clear: it's not required that the program answers just with ``2``; you can have any response you want as long as it shows the number of times the string has been found).
##### Test 2
- Type ``10 11 12 13 14 15`` (on the same line) in the console and hit enter.
- Type ``1`` in the console and hit enter.
- The program should respond with ``7`` or any alternative message like the example above (to be clear: it's not required that the program answers just with ``7``; you can have any response you want as long as it shows the number of times the string has been found).

## Tips
1. You should use the Scanner class to read the data from the console.

## Working code samples
[Solution #1](https://github.com/DavidHancu/JavaChallenges/blob/main/Exercises/Beginner/Exercise%20%232/SOLUTION.MD)
