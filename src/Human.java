public class Human {
    private String surname;
    private String name;
    private String patronymicName;
    private String birthday;
    private String phoneNumber;
    private String gender;

    public Human(String surname, String name, String patronymicName, String birthday, String phoneNumber, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymicName = patronymicName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymicName + " " + birthday + " " + phoneNumber + " " + gender;
    }

    public String getSurname() {
        return surname;
    }
}
