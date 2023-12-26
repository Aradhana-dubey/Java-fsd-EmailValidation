package emailValidation;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);
        boolean isValid = matcher.matches();

        if (isValid) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }

        scanner.close();
    }

}
