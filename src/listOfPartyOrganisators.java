import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class listOfPartyOrganisators {

    private List<Person> partyOrganisators = new LinkedList<>();  //Organizatorów mamy tylko czterech, więc iterowanie po czterech elementach po kolei nie zabierze zbyt dużo czasu

    public void sortPartyOrganisators(){

        Person person1 = new Person("Zbyszek", "Pierwszy", 23, 123456789);
        Person person2 = new Person("Zbyszek", "Drugi", 25, 213465798);
        Person person3 = new Person("Zbyszek", "Pierwszy", 28, 765345789);
        Person person4 = new Person("Zbyszek", "Pierwszy", 28, 898667555);

        partyOrganisators.add(person1);
        partyOrganisators.add(person2);
        partyOrganisators.add(person3);
        partyOrganisators.add(person4);

        System.out.println("Użycie interfejsu Comparable, aby posortować organizatorów imprezy za pomocą metody CompareTo().");
        System.out.println("Najpierw brane pod uwagę będzie imię, później nazwisko, a na końcu wiek. Numeru telefonu nie bierzemy pod uwagę, ponieważ to tylko informacja użytkowników i nie wymaga sortowania.");
        System.out.println("Oto posortowane dane organizatorów imprezy.");
        System.out.println();

        Collections.sort(partyOrganisators);

        for(Person organisator: partyOrganisators)
        {
            organisator.getPersonInfo();
        }

        System.out.println();
        System.out.println("A teraz posortujemy organizatorów imprezy przy użyciu interfejsu Comparator i użyjemy oferowanej przez niego metody reversed.");
        System.out.println();
        Collections.sort(partyOrganisators, new PersonComparator().reversed());

        for(Person organisator: partyOrganisators)
        {
            organisator.getPersonInfo();
        }

    }


}
