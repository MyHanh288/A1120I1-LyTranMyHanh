package _b8_clean_code_refactoring.thuc_hanh.doi_ten_bien_tach_hang;

public class Caculator {

    public static final char Addition = '+';
    public static final char Subtraction = '-';
    public static final char Mutilplication = '*';
    public static final char Division = '/';

    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case Addition:
                return firstOperand + secondOperand;
            case Subtraction:
                return firstOperand - secondOperand;
            case Mutilplication:
                return firstOperand * secondOperand;
            case Division:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
