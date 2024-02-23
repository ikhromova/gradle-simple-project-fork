package holly;

public class EnhancedForDouble {
    public static void badr() {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumListEnhancedd(list);
        System.out.println("Sum of elements in list: " + sum);

        System.out.println("Original List");
        printList(list);
        System.out.println("Calling addOne");
        addOned(list);
        System.out.println("List after call to addOne");
        printList(list);
        System.out.println("Calling addOneError");
        addOneErrord(list);
        System.out.println("List after call to addOneError. Note elements of list did not change.");
        printList(list);
    }

    public static void bardsd() {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumListEnhancedd(list);
        System.out.println("Sum of elements in list: " + sum);

        System.out.println("Original List");
        printList(list);
        System.out.println("Calling addOne");
        addOned(list);
        System.out.println("List after call to addOne");
        printList(list);
        System.out.println("Calling addOneError");
        addOneErrord(list);
        System.out.println("List after call to addOneError. Note elements of list did not change.");
        printList(list);
    }

    // pre: list != null
    // post: return sum of elements
    // uses enhanced for loop
    public static int sumListEnhancedd(int[] list) {
        int total = 0;
        for (int val : list) {
            total += val;
        }
        return total;
    }

    // pre: list != null
    // post: return sum of elements
    // use traditional for loop
    public static int sumListOldd(int[] list) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
            System.out.println(list[i]);
        }
        return total;
    }

    // pre: list != null
    // post: none.
    // The code appears to add one to every element in the list, but does not
    public static void addOneErrord(int[] list) {
        for (int val : list) {
            val = val + 1;
        }
    }

    // pre: list != null
    // post: adds one to every element of list
    public static void addOned(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i]++;
        }
    }

    public static void printList(int[] list) {
        System.out.println("index, value");
        for (int i = 0; i < list.length; i++) {
            System.out.println(i + ", " + list[i]);
        }
    }


}