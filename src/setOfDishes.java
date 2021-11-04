import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class setOfDishes {

    private Set<String> dishes = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public void addDish() {

        System.out.println("Podaj propozycję potrawy na przyjęcie");        //Dodawanie elementów HashSetu z klawiatury
        String dish = sc.nextLine();

        dishes.add(dish);
    }

    public void getDishes() {

        for (String dish : dishes) {                        //Wyświetlanie dodanych przez użytkownika elementów
            System.out.println(dish);
        }
    }

        public void hashSetToTreeSet(){

            Set<String> dishes2 = new TreeSet<>();

            dishes2.addAll(dishes);                         //Konwersja HashSetu na TreeSet w celu pokazania różnicy

            for(String dish2: dishes2)
            {
                System.out.println(dish2);
            }
    }



}
