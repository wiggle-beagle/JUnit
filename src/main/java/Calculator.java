public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }


    public int minus(int a, int b) {

        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        if (b == 0) throw new RuntimeException();
        else
            return a / b;
    }

    public int exponentiation(int a, int b) {
        int c = a;
        for (int i = 1; i < b; i++) {
            a = a * c;
        }
        return a;
    }

}
