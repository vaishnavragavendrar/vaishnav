class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

public class CustomException {
    static void checkAmount(int amount) throws InvalidAmountException {
        if (amount < 1000) {
            throw new InvalidAmountException("Amount must be at least 1000");
        } else {
            System.out.println("Valid Amount");
        }
    }

    public static void main(String[] args) {
        try {
            checkAmount(500);
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
