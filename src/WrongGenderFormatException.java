public class WrongGenderFormatException extends RuntimeException{
    public WrongGenderFormatException() {
        super("Пол должен быть введен символом 'f' или 'm'");
    }
}
