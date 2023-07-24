import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 22));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println("--------");
        System.out.println(hasTeen(12, 56, 36));
        System.out.println(hasTeen(15, 26, 36));
        System.out.println(hasTeen(18, 5, 36));
        System.out.println("--------");
        System.out.println(isCatPlaying(true, 42));
        System.out.println(isCatPlaying(false, 42));
        System.out.println(isCatPlaying(false, 28));
        System.out.println(isCatPlaying(true, 20));
        System.out.println("--------");
        System.out.println(area(25.12, 4));
        System.out.println(area(-1, 4));
        System.out.println(area(5.3, 4.2));
        System.out.println("--------");
        System.out.println(area2(5));
        System.out.println(area2(-5));
        System.out.println(area2(4.2));
        System.out.println("--------");
        Scanner scanner = new Scanner(System.in);

        boolean isValid = true;
        while (isValid) {
            try {
                System.out.println("ilk sayıyı girin");
                double x = scanner.nextDouble();
                System.out.println("ikinci sayıyı girin");
                double y = scanner.nextDouble();
                System.out.println("alan :" + area(x, y));

            } catch (Exception ex) {
                isValid = false;
                System.out.println("Invalid input");
            }
        }

    }
    public static boolean shouldWakeUp(boolean isBarking, int time) {
        if (time < 0 || time > 23) {
            return false;
        }

        if (isBarking && (time < 8 || time >= 20)) {
            return true;
        }

        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19));

        }


    public static boolean isCatPlaying(boolean summer, int num) {
        if (num < 25 || num > 45) {
            return false;
        }
        if (summer && (num >= 25 && num <= 45)) {
            return true;
        }
        if (!summer && (num >= 25 && num <= 35)) {
            return true;
        }
        return false;
    }

    public static double area(double first, double second) {
        if (first < 0 || second < 0) {
            return -1;
        } else {
            return first * second;
        }
    }

    public static double area2(double num) {
        if (num < 0) {
            return -1;
        } else {
            return num * num * Math.PI;
        }
    }
}
