import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] personalData = obtainingPersonalData();
        if (personalData.length < 6) {
            throw new WrongAmountOfDataException("Введено меньше данных, чем требуется");
        }
        if (personalData.length > 6) {
            throw new WrongAmountOfDataException("Введено больше данных, чем требуется");
        }
        if (!personalData[3].matches("\\d{2}.\\d{2}.\\d{4}")) {
            throw new WrongBirthdayFormatException();
        }
        if (!personalData[4].matches("\\d+")) {
            throw new WrongPhoneNumberException();
        }
        if (!(personalData[5].equals("f") || personalData[5].equals("m"))) {
            throw new WrongGenderFormatException();
        }
        writingToFile(personalData);
    }


    public static String[] obtainingPersonalData() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Введите данные,разделенные пробелом " +
                    "(Фамилия Имя Отчество датарождения номертелефона пол): ");
            String dataInput = scanner.nextLine();
            String[] personalData = dataInput.split(" ");
            return personalData;
        }
    }

    public static void writingToFile(String[] personalData) {
        Human human = new Human(personalData[0], personalData[1], personalData[2], personalData[3],
                personalData[4], personalData[5]);
        try (FileWriter writer = new FileWriter(new File(human.getSurname() + ".txt"), true)) {
            writer.write(human.toString() + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}