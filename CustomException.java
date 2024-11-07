import java.util.Scanner;

class LessThanTenException extends Exception {
    public LessThanTenException() {
        super("Your input is wrong");
    }
}

public class CustomException {
    public static void checkVar(int var) throws LessThanTenException {
        if (var < 10) {
            throw new LessThanTenException();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int var = scanner.nextInt();
            checkVar(var);
            System.out.println("Your input is valid.");
        } catch (LessThanTenException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
