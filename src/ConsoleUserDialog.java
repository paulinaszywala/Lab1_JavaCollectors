import java.util.Scanner;

public class ConsoleUserDialog {

    public void run(){
        listOfGuests listOfGuests = new listOfGuests();
        setOfDishes setOfDishes = new setOfDishes();
        mapOfMusic playlist = new mapOfMusic();
        listOfPartyOrganisators partyOrganisators = new listOfPartyOrganisators();
        EqualsHashcode equalsAndHashcode = new EqualsHashcode();

        while (true) {

            System.out.println();
            System.out.println("Wybierz opcję:");
            System.out.println("1 - Dodaj gościa do listy"); //ArrayList - dodawanie do listy  -> Klasa Person i listOfGuests
            System.out.println("2 - Wyświetl listę gości");  //ArrayList - wyświetlanie listy  -> Klasa Person i listOfGuests
            System.out.println("3 - Dodaj propozycję dnia do listy"); //HashSet - dodawanie   -> Klasa setOfDishes
            System.out.println("4 - Wyświetl wszystkie propozycje dań"); //HashSet oraz Hashset -> TreeSet - wyswietlanie   -> Klasa setOfDishes
            System.out.println("5 - Wyświetl imprezową playlistę"); //HashMap i HashMap -> TreeMap - wyświetlanie, dodawanie jest już domyślnie w kodzie   -> Klasa mapOfMusic
            System.out.println("6 - Zobacz działanie metody equals oraz hashcode"); //Metoda equals() i Hashcode() - przykład działania przy użyciu klas Movie i Movie2, całość w klasie EqualsHashcode
            System.out.println("7 - Sortowanie listy organizatorów imprezy za pomocą interfejsu Comparable oraz Comparator"); // Comparable (w klasie Person) vs Compartor w klasie PersonComparator
            // klasa listOfPartyOrganisators oraz klasa PersonComparator
            System.out.println("8 - Zakończ");
            System.out.println();



            Scanner sc = new Scanner(System.in);

            int choice = sc.nextInt();

                System.out.println();

                switch (choice) {
                    case 1: {
                        listOfGuests.addGuest();
                        break;
                    }
                    case 2: {
                        listOfGuests.getGuests();
                        break;
                    }
                    case 3: {
                        setOfDishes.addDish();
                        break;
                    }
                    case 4: {
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("W kolejności losowej (1) czy alfabetycznie (2)? Podaj wybrany numer.");
                        int choice2 = sc2.nextInt();

                        switch (choice2) {
                            case 1: {
                                setOfDishes.getDishes();
                                break;
                            }
                            case 2: {
                                setOfDishes.hashSetToTreeSet();
                                break;
                            }
                            default:{
                                System.out.println("Niestety nie mamy takiej pozycji z menu. Wybierz liczbę 1 lub 2.");
                                System.out.println();
                            }
                        }
                        break;
                    }
                    case 5: {
                        playlist.fillThePlaylist();

                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("W kolejności losowej (1) czy alfabetycznie (2)? Podaj wybrany numer.");

                        int choice3 = sc.nextInt();

                        switch (choice3) {
                            case 1: {
                                playlist.displayPlaylist();
                                break;
                            }
                            case 2: {
                                playlist.hashMapToTreeMap();
                                break;
                            }
                            default:
                            {
                                System.out.println("Niestety nie mamy takiej pozycji z menu. Wybierz liczbę 1 lub 2.");
                                System.out.println();
                            }
                        }

                        break;
                    }
                    case 6: {
                        equalsAndHashcode.tellMeTheDifference();
                        break;
                    }
                    case 7: {
                        partyOrganisators.sortPartyOrganisators();
                        break;
                    }

                    case 8: {

                        System.exit(0);

                    }
                    default: {
                        System.out.println("Niestety nie mamy takiej pozycji z menu. Wybierz liczbę 1-8.");
                        System.out.println();
                    }

                }
            }
        }
    }


