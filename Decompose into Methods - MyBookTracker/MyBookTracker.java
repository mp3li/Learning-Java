public class MyBookTracker {

    // This class is a little tool for looking at reading stats
    // Each number in the array = how many books were finished in a week
    // 0 means "I didn’t finish anything that week"

    // NOTE:
    // I changed the objective slightly by filtering in sumOfEvens using "currentWeek > 0"
    // because that made the idea of filtering data actually click for my brain.
    // Instead of doing even numbers, I'm doing
    // "only count weeks where I actually finished a book."
    // The method name stays the same to match the assignment shape.

    // ----------------------------
    // sumOfEvens
    // ----------------------------
    // In normal-person terms:
    // Add up all the books from weeks where I finished at least one book
    public static int sumOfEvens(int[] weeklyCompletedBooks) {

        // If there's no data, there's nothing to add
        if (weeklyCompletedBooks == null) {
            return 0;
        }

        int total = 0; // This keeps track of how many books I’ve counted so far

        // Go through the weeks one by one
        for (int i = 0; i < weeklyCompletedBooks.length; i++) {

            // How many books I finished this week
            int currentWeek = weeklyCompletedBooks[i];

            // Only count weeks where a book was completed
            if (currentWeek > 0) {
                total += currentWeek;
            }
        }

        // Final total of books finished
        return total;
    }

    // ----------------------------
    // countOccurrences
    // ----------------------------
    // This one answers questions like:
    // "How many weeks did I finish exactly 2 books?"
    public static int countOccurrences(int[] weeklyCompletedBooks, int target) {

        // No data = no matches
        if (weeklyCompletedBooks == null) {
            return 0;
        }

        int count = 0; // How many weeks matched what I’m looking for

        // Check each week
        for (int i = 0; i < weeklyCompletedBooks.length; i++) {

            // Books finished this week
            int currentWeek = weeklyCompletedBooks[i];

            // If this week matches the number I care about...
            if (currentWeek == target) {
                count++;
            }
        }

        // How many times that number showed up
        return count;
    }

    // ----------------------------
    // main
    // ----------------------------
    public static void main(String[] args) {

        // Fake data — just here so I can step through the loops and watch things change
        // Two years of weeks (104 total)
        // Mostly 0s, some 1s, fewer 2s, and minimal 3s

        int[] weeklyBooks = {
            // Year 1
            0, 0, 1, 0, 0, 2, 0, 1, 0, 0, 0, 1, 0,
            0, 2, 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 1,
            0, 0, 2, 0, 1, 0, 0, 0, 0, 1, 0, 0,
            2, 0, 0, 1, 0, 0, 0, 0, 3, 0, 1, 0,
            0, 0,

            // Year 2
            0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 3,
            0, 0, 1, 0, 0, 2, 0, 0, 0, 1, 0, 0,
            0, 0, 3, 0, 1, 0, 0, 2, 0, 0, 0, 0,
            1, 0, 0, 2, 0, 0, 0, 3, 0, 1, 0, 0,
            0, 0
        };

        // Extra test data for cases that aren’t the usual scenario
        int[] empty = {};          // no weeks at all
        int[] single = {1};       // just one week
        int[] negatives = {-1, 0, 2}; // mixed / bad data

        System.out.println("Total books finished: " + sumOfEvens(weeklyBooks));
        System.out.println("Weeks with exactly 1 book: " + countOccurrences(weeklyBooks, 1));
        System.out.println("Weeks with exactly 2 books: " + countOccurrences(weeklyBooks, 2));
        System.out.println("Weeks with exactly 3 books: " + countOccurrences(weeklyBooks, 3));

        System.out.println("Empty data total: " + sumOfEvens(empty));
        System.out.println("Null data total: " + sumOfEvens(null));
        System.out.println("Mixed data total: " + sumOfEvens(negatives));
    }
}
