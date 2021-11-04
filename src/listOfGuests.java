import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listOfGuests {

    private List<Person> birthdayGuests = new ArrayList<>();   //Użyjemy Arraylisty, ponieważ lista gości wprowadzona przez użytkownika może być długa
    Scanner sc = new Scanner(System.in);

    public void addGuest() {

        System.out.println("Podaj imię gościa");
        String firstName = sc.nextLine();

        System.out.println("Podaj nazwisko gościa");
        String lastName = sc.nextLine();

        System.out.println("Podaj wiek gościa");                //Dodawanie elementów do listy z klawiatury
        int age = Integer.valueOf(sc.nextLine());

        System.out.println("Podaj numer telefonu gościa");
        int phoneNumber = Integer.valueOf(sc.nextLine());

        Person person = new Person(firstName, lastName, age, phoneNumber);

        birthdayGuests.add(person);

    }

    public void getGuests()
    {
        for (Person person : birthdayGuests)      //Wyświetlanie gości dodanych wcześniej do listy
        {
            person.getPersonInfo();
        }
    }


}
