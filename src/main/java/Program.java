import exceptions.DivisionByZeroException;

import java.util.Scanner;

public class Program {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Введите первое число");
        double firstParam = getDoubleFromConsole();
        System.out.println("Введите второе число");
        double secondParam = getDoubleFromConsole();

        System.out.println("Выберите операцию :");
        System.out.println("+ - Сложение");
        System.out.println("- - Вычитание");
        System.out.println("* - Умножение");
        System.out.println("/ - Деление");
        String operationNumber = getTextFromConsole();

        try{
            Calculator calc = new Calculator();
            calc.setFirstParam(firstParam);
            calc.setSecondParam(secondParam);
            calc.doOperation(operationNumber);
            System.out.println("Результат : " + calc.getResult());
        }catch (DivisionByZeroException e){
            System.out.println("Ошибка : " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }

    public static double getDoubleFromConsole() {
        double result = 0.0;
        do {
            String value = scanner.next();
            if (value.matches("\\d+(.\\d+)?")) {
                result = Double.parseDouble(value);
                break;
            } else {
                System.out.println("Введенное значение не является числом. Повторите ввод.");
            }
        } while (true);
        return result;
    }

    public static String getTextFromConsole() {
        return scanner.next();
    }

}
