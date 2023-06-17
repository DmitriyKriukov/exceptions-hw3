public class WrongBirthdayFormatException extends RuntimeException{
    public WrongBirthdayFormatException() {
        super("Дата рождения должна быть в формате dd.mm.yyyy");
    }
}
