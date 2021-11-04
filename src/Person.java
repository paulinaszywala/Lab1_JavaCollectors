import java.util.*;

public class Person implements Comparable<Person> {

    private String firstName;
    private String lastName;
    private int age;
    private int phoneNumber;

    Scanner sc = new Scanner(System.in);

    public Person(String firstName, String lastName, int age, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void getPersonInfo(){

        System.out.println("Imię " + firstName);
        System.out.println("Nazwisko " + lastName);
        System.out.println("Wiek " + age);
        System.out.println("Numer telefonu " + phoneNumber);
        System.out.println();

    }


    @Override
    public int compareTo(Person o) {
        int result = this.firstName.compareTo(o.firstName);
        if(result == 0)
        {
            result = this.lastName.compareTo(o.lastName);
            if (result == 0)
            {
                return this.age - o.age;
            }
            return result;
        }
        return result;
    }
}
