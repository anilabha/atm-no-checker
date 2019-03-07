import java.util.Scanner;
public class atm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an atm card no : ");
        String number = input.next();
        validateatmCardNumber(number);

    }

    private static void validateatmCardNumber(String str) {

        int[] ints = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ints[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        if (sum % 10 == 0) {
            System.out.println(str + " is a valid atm card number");
        } else {
            System.out.println(str + " is an invalid atm card number");
        }

    }

}
