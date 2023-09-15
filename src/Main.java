public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 7, 6, 8, 1, 3, 10};
        int max_num = 10;
        int missing = MissingNumber.findMissingNumber(numbers, max_num);

        // Print Missing Number
        System.out.println("Missing Number: " + missing);
    }
}