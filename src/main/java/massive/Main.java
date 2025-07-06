package massive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //ввод числа, которое необходимо отобразить
        Massive massive = new Massive(number); // создание массива, в котором будет искомое число
        massive.numberDivisionMethod();//Метод, который разбивает число на символы
        massive.methodForImplementingPartitioningAndOutput();
        massive.print();
    }
}
