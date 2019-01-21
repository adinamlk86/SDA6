package prime;


public class Prime {


    public boolean isItPrime(int number) {
        int m = number / 2;
        boolean isItPrime = true;

        if (number == 0 || number == 1) {
            isItPrime = false;
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % m == 0) {
                    isItPrime = false;
                }
            }
        }
        return isItPrime;
    }


    public int[] removeNotPrimeNumbers(int[] listOfNumbers) {
        int j = 0;
        int[] listOfPrimeNumbers = new int[listOfNumbers.length];
        for (int i = 0; i < listOfNumbers.length; i++) {
            if (isItPrime(listOfNumbers[i])) {
                listOfPrimeNumbers[j] = listOfNumbers[i];
                j++;
            }
        }

        return listOfPrimeNumbers;

    }
}
