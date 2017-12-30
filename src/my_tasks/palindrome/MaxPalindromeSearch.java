package my_tasks.palindrome;

/**
 * @author Volodymyr Burtsev at 29.12.2017 13:59
 */
public class MaxPalindromeSearch {

    private static final int MIN_NUMBER = 10_000;
    private static final int MAX_NUMBER = 99_999;
    private static int[] allPrimeNumbers;
    private static int countPrimeNumbers = 0;

    private static final boolean showDetails = true;
    private static final boolean useBenchmark = false;

    public static void main(String[] args) {

        System.out.println("\nSearching prime numbers in range 2.." + MAX_NUMBER);
        System.out.print("Time used to search all prime numbers: ");
        getAllPrimeNumbers();
        System.out.println("\nTotal " + allPrimeNumbers.length + " prime numbers found.\n--------");

        int[] primeNumbersInRange = selectedRange();
//        showSelected(primeNumbersInRange);

        if (useBenchmark) benchmark();

        findBiggestPalindromeByMultiplying(primeNumbersInRange);

    }

    private static void findBiggestPalindromeByMultiplying(int[] primeNumbersInRange) {
        long palindrome = 0;
        long number1 = 0, number2 = 0;
        int palindromesCount = 0;
        long timerStart = System.currentTimeMillis();
        System.out.println("\nPalindromes found:");
        for (int i = primeNumbersInRange.length - 1; i >= 0; i--) {
            boolean palindromeFound;
            for (int j = i; j >= 0; j--) {
                long n1 = primeNumbersInRange[i];
                long n2 = primeNumbersInRange[j];
                long numberToCheck = n1 * n2;
                palindromeFound = isPalindrome(numberToCheck);
                if (palindromeFound) {
                    palindromesCount++;
                    if (showDetails) System.out.println("  " + palindromesCount + ") \t" + n1 + " x " + n2
                            + " = " + numberToCheck);
                    if (numberToCheck > palindrome) {
                        palindrome = numberToCheck;
                        number1 = primeNumbersInRange[i];
                        number2 = primeNumbersInRange[j];
                    }
                    break;
                }
            }
        }
        System.out.println("\nTime used for searching palindromes: " + (System.currentTimeMillis() - timerStart) + "ms");
        if (showDetails) System.out.println("Total palindromes found: " + palindromesCount);
        System.out.println("--------\n\n\nSolution: " + number1 + " x " + number2 + " = " + palindrome + "\n\n");
    }

    private static boolean isPalindrome(long numberToCheck) {
        String number = String.valueOf(numberToCheck);
        boolean isPalindrome = true;
        for (int i = 0; i < number.length() / 2; i++) {
            isPalindrome = number.charAt(i) == number.charAt(number.length() - i - 1);
            if (!isPalindrome) break;
        }
        return isPalindrome;
    }

    private static void showSelected(int[] primeNumbersInRange) {
        if (!showDetails) return;
        System.out.println("\n\nSelected prime numbers in range " + MIN_NUMBER + ".." + MAX_NUMBER + " :");
        int q = 0;
        for (int i : primeNumbersInRange) {
            if ((q %= 20) == 0) {
                System.out.println();
            }
            System.out.print(i + "\t");
            q++;
        }
        System.out.println("\n\nTotal " + primeNumbersInRange.length + " prime numbers in selected range\n--------\n");
    }

    private static int[] selectedRange() {
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
        int iterationsCount = 100;

        System.out.println("\n--> Benchmark started");
        if (showDetails) System.out.println("Iterations duration for " + iterationsCount + " times:");

        int q = 0;
        for (int i = 1; ; i++) {
            if ((q %= 20) == 0) {
                if (showDetails) System.out.println();
            }
            long timerStart = System.currentTimeMillis();
            getAllPrimeNumbers();
            long timeUsed = System.currentTimeMillis() - timerStart;
            if (minTime > timeUsed || minTime == 0) minTime = timeUsed;
            if (maxTime == 0 || maxTime < timeUsed) maxTime = timeUsed;
            avgTime += timeUsed;
            if (i < iterationsCount) {
                allPrimeNumbers = new int[MAX_NUMBER];
                countPrimeNumbers = 0;
            } else {
                break;
            }
            q++;
        }

        if (showDetails) System.out.println("\n\nMinimum: " + minTime + "ms\nMaximum: " + maxTime
                + "ms\nAverage: " + avgTime / iterationsCount + "ms");
        System.out.println("\n--> Benchmark finished");
    }

    private static void getAllPrimeNumbers() {
        if (allPrimeNumbers != null) {
            countPrimeNumbers = 0;
        }
        allPrimeNumbers = new int[MAX_NUMBER];
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
        System.out.print(timeUsed + "ms \t");
    }
}