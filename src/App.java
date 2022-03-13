public class App {
    //iterating through method
    static void iterative(int numbers) {

        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        long startTime = System.nanoTime();

        while (counter < numbers) {

            System.out.print(num1 + " ");
            // changing the order of the values to match the next pair
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println(endTime - startTime + " seconds to finish");
    }

    // to print each number returned by the recusrive call
    static void recursiveStart(int numbers) {

        long startTime = System.nanoTime();
        for (int i = 0; i < numbers; i++) {// Recursive method

            System.out.print(recursiveWork(i) + " ");
        }
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println(endTime - startTime + " seconds to finish");
    }

    static int recursiveWork(int n) {
        // in case the number is simply one
        if (n <= 1)
            return n;

        // continues to call itself until it is <= 1
        return recursiveWork(n - 1)
                + recursiveWork(n - 2);
    }

    public static void main(String[] args) throws Exception {
        int numbers = 30;// febonacci function up to
        iterative(numbers);// non recursive method
        recursiveStart(numbers);// recursive start
    }

}
