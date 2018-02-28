package pl.codecouple;

class Calculator {

    public int add(int number, int numberToAdd) {
        return number + numberToAdd;
    }

    public int substract(int number, int numberToSub) {
        return number - numberToSub;
    }

    public int dividing(int number, int denominator) throws DividingByZero {

        if (denominator == 0) {
            throw new DividingByZero("Dzielisz przez zero");
        }

        return number/denominator;

    }

    public int multiply(int number, int numberToMul) {
        return number * numberToMul;
    }

}
