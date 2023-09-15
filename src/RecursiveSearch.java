public class RecursiveSearch {
    public static int recursiveSearch(String item, String[] arr, int index) {
        // Base case: If the index goes beyond the array length, the item is not found.
        if (index >= arr.length) {
            return -1;
        }

        // Check if the current element is equal to the sought item.
        if (arr[index].equals(item)) {
            return index;
        }

        // Recursively search the rest of the array.
        int result = recursiveSearch(item, arr, index + 1);

        return result;
    }

    public static void main(String[] args) {
        String[] items = { "hey", "there", "you" };
        String soughtItem1 = "hey";
        String soughtItem2 = "porcupine";

        int index1 = recursiveSearch(soughtItem1, items, 0);
        int index2 = recursiveSearch(soughtItem2, items, 0);

        System.out.println("Index of '" + soughtItem1 + "': " + index1); // Output: 0
        System.out.println("Index of '" + soughtItem2 + "': " + index2); // Output: -1
    }
}
