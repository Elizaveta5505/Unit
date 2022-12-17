package HW1;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculatingDiscount(1000, 50));
        //System.out.println(calculation(7,10,'_'));
    }

    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;
        switch (operator) {
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '+':
                result = firstOperand + secondOperand;
                break;
            case ',':
            case '.':
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '/':
                if (secondOperand == 0) {
                    throw new ArithmeticException("Division by zero is not possible");
                }

                result = firstOperand / secondOperand;
        }

        return result;
    }

    public static double squareRootExtraction(double number) {
        double squareRoot = number / 2.0;

        double t;
        do {
            t = squareRoot;
            squareRoot = (squareRoot + number / squareRoot) / 2.0;
        } while(t - squareRoot != 0.0);

        return squareRoot;
    }

    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        double result;

        if (purchaseAmount > 0){
            if (discountAmount > 0 && discountAmount <=100) {
                result = purchaseAmount * (100 - discountAmount)/100;
            }
            else {
                throw new ArithmeticException("Скидка должна быть в диапозоне от 0 до 100 процентов");
            }
        }
        else {
            throw new ArithmeticException("Сумма покупки должна быть больше 0");
        }
        return result;
    }
}
