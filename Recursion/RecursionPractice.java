public class RecursionPractice {

    public static int factorial(int n) {
        // Base case: 0! is defined as 1, so recursion stops here.
        if (n == 0) {
            return 1;
        }

        // Recursive case: multiply n by factorial of the next smaller number.
        // This moves toward the base case by reducing n each call.
        return n * factorial(n - 1);
    }

    public static int sumArray(int[] arr, int index) {
        // Base case: when index reaches the array length, there is nothing left to add.
        if (index == arr.length) {
            return 0;
        }

        // Recursive case: add current element to the sum of the rest of the array.
        // This moves toward the base case by increasing index each call.
        return arr[index] + sumArray(arr, index + 1);
    }

    public static int fibonacci(int n) {
        // Base cases: the 0th Fibonacci number is 0, and the 1st is 1.
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // Recursive case: each value is the sum of the two previous values.
        // This moves toward the base case by reducing n each call.
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("factorial(5): " + factorial(5));

        int[] numbers = {2, 4, 6, 8};
        System.out.println("sumArray({2, 4, 6, 8}, 0): " + sumArray(numbers, 0));

        System.out.println("fibonacci(7): " + fibonacci(7));
    }
}
