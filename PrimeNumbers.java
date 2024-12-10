// PrimeNumbers.java
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");

        for (int num = 2; num <= 100; num++) { // Start from 2 as 1 is not a prime number
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Check divisors up to sqrt(number)
            if (number % i == 0) {
                return false; // If divisible, not a prime
            }
        }
        return true;
        // If no divisors, it's a prime 
        //prime
    }
}
