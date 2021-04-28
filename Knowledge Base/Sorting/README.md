# Sorting an ArrayList

There are more ways of sorting a Collection in ascending order. Most of them require complicated algorithms like Bubble Sorting, but there are easy ways as well. In this Knowledge Base article, I will talk about the native methods the Java programming language provides for sorting lists. I will only cover 2 of them, and I will also show you how to sort them in descending order.

## Shared Data
All of these examples will use the following ``List``:
```java
List<Integer> numbers = Arrays.asList(107, 90, 403, 25);
```
After all of the methods are executed, I will use the following line to print out the results:
```java
System.out.println(numbers);
```
All of the methods shown below returned the following output:
##### Ascending Output:
```
[25, 90, 107, 403]
```
##### Descending Output:
```
[403, 107, 90, 25]
```

### Method 1 (Uses the ``Collections`` class)
##### Ascending Order
This method will **not** return a value; it will instead mutate (modify) the ``List``.
```java
Collections.sort(numbers);
```
##### Descending Order
This method will **not** return a value; it will instead mutate (modify) the ``List``.
```java
Collections.sort(numbers, Collections.reverseOrder());
```

### Method 1 (Uses the ``List`` class)
##### Ascending Order
This method will **not** return a value; it will instead mutate (modify) the ``List``.
```java
numbers.sort(Comparator.naturalOrder());
```
##### Descending Order
This method will **not** return a value; it will instead mutate (modify) the ``List``.
```java
numbers.sort(Collections.reverseOrder());
```