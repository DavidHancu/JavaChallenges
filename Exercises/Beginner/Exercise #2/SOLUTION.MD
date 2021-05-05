  ```java
        Scanner scanner = new Scanner(System.in);

        System.out.print("Main String: ");
        String mainString = scanner.nextLine();

        System.out.print("Search String: ");
        String searchString = scanner.nextLine();

        int count = mainString.split(searchString, -1).length - 1;
        System.out.println("The occurrence count is " + count + " time" + (count == 1 ? "" : "s") + ".");
  ```
