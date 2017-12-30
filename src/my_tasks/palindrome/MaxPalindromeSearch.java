package my_tasks.palindrome;

/**
 * @author Volodymyr Burtsev at 29.12.2017 13:59
 */
public class MaxPalindromeSearch {

    private static final int MIN_NUMBER = 10_000;
    private static final int MAX_NUMBER = 99_999;
    private static int[] allPrimeNumbers = new int[MAX_NUMBER / 2];
    private static int countPrimeNumbers = 0;

    public static void main(String[] args) {

        System.out.println("Searching prime numbers in range 2.." + MAX_NUMBER);
        System.out.print("Used: ");
        getAllPrimeNumbers();
        int[] primeNumbersInRange = selectedRange();

//        benchmark();
        System.out.println("\nTotal " + allPrimeNumbers.length + " prime numbers found.");

        System.out.println("\n--------\nDONE");
    }

    private static int[] selectedRange() {
        int startIndex = 0;
        int[] result = null;
        for (int i = 0; i < allPrimeNumbers.length; i++) {
            if (allPrimeNumbers[i] >= MIN_NUMBER) {
                result = new int[allPrimeNumbers.length - i];
                System.arraycopy(allPrimeNumbers, i, result, 0, allPrimeNumbers.length - i);
                break;
            }
        }
        return result;
    }

    private static void benchmark() {
        long minTime = 0;
        long maxTime = 0;
        long avgTime = 0;
        int times = 100;

        System.out.println("\n--> Benchmark started");
        System.out.println("Iterations duration for " + times + " times:");

        for (int i = 0; ; i++) {
            long timerStart = System.currentTimeMillis();
            getAllPrimeNumbers();
            long timeUsed = System.currentTimeMillis() - timerStart;
            if (minTime > timeUsed || minTime == 0) minTime = timeUsed;
            if (maxTime == 0 || maxTime < timeUsed) maxTime = timeUsed;
            avgTime += timeUsed;
            if (i < times) {
                allPrimeNumbers = new int[MAX_NUMBER / 2];
                countPrimeNumbers = 0;
            } else {
                break;
            }
        }

        System.out.println("\nMinimum: " + minTime + "ms\nMaximum: " + maxTime + "ms\nAverage: " + avgTime / times + "ms");
        System.out.println("--> Benchmark finished");
    }

    private static void getAllPrimeNumbers() {
        long timerStart = System.currentTimeMillis();
        if (countPrimeNumbers == 0) {
            allPrimeNumbers[0] = 2;
            countPrimeNumbers++;
        }
        for (int i = 3; i <= MAX_NUMBER; i = i + 2) {
            boolean isPrime = true;
            int limit = (int) Math.sqrt(i);
            for (int j = 0; j < limit; j++) {
                if (i % allPrimeNumbers[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                allPrimeNumbers[countPrimeNumbers++] = i;
            }
        }
        int[] result = new int[countPrimeNumbers];
        System.arraycopy(allPrimeNumbers, 0, result, 0, countPrimeNumbers);
        allPrimeNumbers = result;
        long timeUsed = System.currentTimeMillis() - timerStart;
        System.out.print(timeUsed + "ms ");
    }
}