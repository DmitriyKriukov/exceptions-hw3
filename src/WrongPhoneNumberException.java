public class WrongPhoneNumberException extends RuntimeException{
    public WrongPhoneNumberException() {
        super("Номер телефона должен состоять только из цифр");
    }
}
