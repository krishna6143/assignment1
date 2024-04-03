class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

public class ValidationHelper {
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number cannot be negative");
        }
    }

    public static void main(String[] args) {
        try {
            int number = -5; 
            validateNumber(number);
            System.out.println("Number is valid: " + number);
        } catch (CustomValidationException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
