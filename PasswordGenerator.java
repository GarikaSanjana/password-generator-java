import java.util.*;

public class PasswordGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🔐 Welcome to the Password Generator!");
        System.out.print("Enter the desired password length: ");
        int length = sc.nextInt();

        if (length < 4) {
            System.out.println("Password length should be at least 4 characters.");
            return;
        }

        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_=+<>?/";

        String all = upper + lower + numbers + symbols;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(all.length());
            password.append(all.charAt(index));
        }

        System.out.println("\n✅ Your Strong Password is: " + password.toString());
        sc.close();
    }
}