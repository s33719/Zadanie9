import java.util.Scanner;

public class NegativeNumberHandler {
    private static int[] numbers = new int[10];


    public static int readNumber() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int num = sc.nextInt();

        if (num < 0) {
            throw new NegativeNumberException("Nie można podać liczby ujemnej!");
        }
        return num;
    }
//

    public static void fillArray() {
        for (int i = 0; i < numbers.length; i++) {
            try {
                numbers[i] = readNumber();

            } catch (NegativeNumberException e) {
                numbers[i] = 0;
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Zawartość tabliy: ");
        for(int number : numbers) {
            System.out.println(number);

    }
        System.out.println();

}
    }