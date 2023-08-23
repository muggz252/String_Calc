import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            choice = Input.nextInt("""
                    1.Арабские цифры
                    2.Римские цифры
                    3.Выход
                    """);
            if (choice == 1) {
                System.out.println(arabCalc(Input.next("Введите выражение: ")));
                System.out.println();
            } else if (choice == 2) {
                System.out.println(romeCalc(Input.next("Введите выражение: ")));
                System.out.println();
            } else {
                System.out.println("Некорректный ввод!");
                System.out.println();
            }
        } while (choice != 3);


    }

    public static String arabCalc(String input) {
        return input;
    }

    public static String romeCalc(String input) {
        return input;
    }

    public static int fromRoman(String input) {
        int result = 0;
        for (int i = 0; i < RomeNumbers.values().length; i++) {
            String romanNumberToCheck = String.valueOf(RomeNumbers.values()[i]);
            int decimalNumber = RomeNumbers.values()[i].getValue();
            while (input.startsWith(romanNumberToCheck)) {
                result += decimalNumber;
                input = input.substring(1);
            }
        }
        if (result == 0) {
            throw new RuntimeException("Неверный формат римского числа");
        } else if (result > 10) {
            throw new RuntimeException("Число не должно быть больше X");
        } else return result;
    }

    public static String toRoman(int input) {
        StringBuilder result = new StringBuilder();
        int remaining = input;
        for (int i = 0; i < RomeNumbers.values().length; i++) {
            int decimalNumber = RomeNumbers.values()[i].getValue();
            String romanNumber = String.valueOf(RomeNumbers.values()[i]);
            while (remaining >= decimalNumber) {
                result.append(romanNumber);
                remaining -= decimalNumber;
            }
        }
        return result.toString();
    }
}