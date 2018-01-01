package my_tasks.palindrome;

/**
 * @author Volodymyr Burtsev at 29.12.2017 13:59
 */
public class MaxPalindromeSearch {

    private static final int MIN_NUMBER = 10_000;
    private static final int MAX_NUMBER = 99_999;
    private static int[] primeNumbers;
    private static int countPrimeNumbers = 0;

    private static int multiplier1;
    private static int multiplier2;
    private static long palindrome;
    private static int palindromesCount;

    private static final boolean showDetails = false;
    private static final boolean useBenchmark = false;
    private static long timer;

    public static void main(String[] args) {

        getPrimeNumbers();

        benchmark();

        findBiggestPalindromeByMultiplying(primeNumbers);

    }

    private static void timerStart() {
        timer = System.currentTimeMillis();
    }

    private static void timerStop() {
        System.out.println((System.currentTimeMillis() - timer) + "ms");
    }

    private static void getPrimeNumbers() {
        System.out.println("\nSearching all prime numbers in range " + MIN_NUMBER + ".." + MAX_NUMBER);
        System.out.print("Time used to search all prime numbers: ");
        if (primeNumbers != null) {
            countPrimeNumbers = 0;
        }
        primeNumbers = new int[MAX_NUMBER];
        timerStart();
        if (countPrimeNumbers == 0) {
            primeNumbers[0] = 2;
            countPrimeNumbers++;
        }
        for (int i = 3; i <= MAX_NUMBER; i = i + 2) {
            boolean isPrime = true;
            int limit = (int) Math.sqrt(i);
            for (int j = 0; j < limit; j++) {
                if (i % primeNumbers[j] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers[countPrimeNumbers++] = i;
            }
        }
        int[] result = new int[countPrimeNumbers];
        System.arraycopy(primeNumbers, 0, result, 0, countPrimeNumbers);
        primeNumbers = result;

        // select range using lower number
        result = null;
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i] >= MIN_NUMBER) {
                result = new int[primeNumbers.length - i];
                System.arraycopy(primeNumbers, i, result, 0, primeNumbers.length - i);
                break;
            }
        }
        primeNumbers = result;
        timerStop();
        System.out.println("\nTotal " + primeNumbers.length + " prime numbers found.\n--------");
        showSelected(result);
    }

    private static void findBiggestPalindromeByMultiplying(int[] primeNumbersInRange) {
        timerStart();
        palindrome = 0;
        palindromesCount = 0;
        multiplier1 = 0;
        multiplier2 = 0;
        System.out.println("\nSearching palindromes in range: " + MIN_NUMBER + ".." + MAX_NUMBER);
        if (showDetails) System.out.println("Palindromes found:");
        boolean palindromeFound;
        for (int i = primeNumbersInRange.length - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                long n1 = primeNumbersInRange[i];
                long n2 = primeNumbersInRange[j];
                long numberToCheck = n1 * n2;
                palindromeFound = isPalindrome_UsingString(numberToCheck);
//                palindromeFound = isPalindrome_UsingChar(numberToCheck);
//                palindromeFound = isPalindrome_UsingNumber(numberToCheck);
                if (palindromeFound) {
                    palindromesCount++;
                    if (showDetails) System.out.println("  " + palindromesCount + ") \t" + n1 + " x " + n2
                            + " = " + numberToCheck + "\t\t");
                    if (numberToCheck > palindrome) {
                        palindrome = numberToCheck;
                        multiplier1 = primeNumbersInRange[i];
                        multiplier2 = primeNumbersInRange[j];
                    }
//                    break;  // optimize to ignore other guaranteed smaller possible palindromes when array is sorted
                }
            }
        }
        System.out.print("Time used for searching all palindromes: ");
        timerStop();
        if (showDetails) System.out.println("Total palindromes found: " + palindromesCount);
        System.out.println("--------\n\n\nFinally biggest palindrom is:\n\t" + palindrome +
                "\nwhich taken by multiplying the prime numbers from range " + MIN_NUMBER + ".." + MAX_NUMBER + " :\n\t" +
                multiplier1 + " and " + multiplier2 + "\n");
    }

    private static boolean isPalindrome_UsingString(long numberToCheck) {
        String number = String.valueOf(numberToCheck);
        boolean isPalindrome = true;
        for (int i = 0; i < number.length() / 2; i++) {
            isPalindrome = number.charAt(i) == number.charAt(number.length() - i - 1);
            if (!isPalindrome) break;
        }
        return isPalindrome;
    }

    private static boolean isPalindrome_UsingChar(long numberToCheck) {
        boolean isPalindrome = true;
        char[] chars = String.valueOf(numberToCheck).toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

    private static boolean isPalindrome_UsingNumber(long numberToCheck) {
        boolean isPalindrome = true;
        int numbersCount = 0;
        for (long i = numberToCheck; i > 0; i /= 10) {
            numbersCount++;
        }
        long n1 = 0, n2 = 0;
        for (int i = 0; i < numbersCount / 2; i++) {
            n1 = (numberToCheck / pow10(numbersCount - i - 1) % 10);
            n2 = (numberToCheck / pow10(i) % 10);
            if (n1 != n2) {
                isPalindrome = false;
                break;
            }
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

    private static void benchmark() {
        if (!useBenchmark) return;
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
            getPrimeNumbers();
            long timeUsed = System.currentTimeMillis() - timerStart;
            if (minTime > timeUsed || minTime == 0) minTime = timeUsed;
            if (maxTime == 0 || maxTime < timeUsed) maxTime = timeUsed;
            avgTime += timeUsed;
            if (i < iterationsCount) {
                primeNumbers = new int[MAX_NUMBER];
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

    private static long pow10(int exponent) {
        long result = 0;
        switch (exponent) {
            case 0:
                result = 1L;
                break;
            case 1:
                result = 10L;
                break;
            case 2:
                result = 100L;
                break;
            case 3:
                result = 1000L;
                break;
            case 4:
                result = 10000L;
                break;
            case 5:
                result = 100000L;
                break;
            case 6:
                result = 1000000L;
                break;
            case 7:
                result = 10000000L;
                break;
            case 8:
                result = 100000000L;
                break;
            case 9:
                result = 1000000000L;
                break;
            case 10:
                result = 10000000000L;
                break;
        }
        return result;
    }
}