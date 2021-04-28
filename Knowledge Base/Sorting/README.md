# Sorting an ArrayList

There are more ways of sorting a Collection in ascending order. Most of them require complicated algorithms like Bubble Sorting, but there are easy ways as well. In this Knowledge Base article, I will talk about the native methods the Java programming language provides for sorting lists. I will show you how to sort them both ways: ascending and descending.

## Shared Data
All of these examples will use the following ``List``:
```java
List<Integer> numbers = List.of(107, 90, 403, 25);
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

# Note
**BE AWARE:** Trying to sort readonly lists will throw an ``UnsupportedOperationException``. However, there are ways to bypass it. One of them is creating a new collection like this:
```java
numbers = new ArrayList<>(numbers);
```
This piece of code creates a copy of the readonly list. So now, when the code uses the ``numbers`` variable, it will point to the list that allows editing.

# Something else to point out
The ``Comparator`` class has a pretty neat method called ``reversed()``. You can also get a Comparator for descending order by using:
```java
Comparator.naturalOrder().reversed();
```
You can replace ``Collections.reverseOrder()`` with this if you wish.

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

### Method 2 (Uses the ``List`` class)
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
