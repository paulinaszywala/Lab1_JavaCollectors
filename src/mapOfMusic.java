import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapOfMusic {

    private Map<String, String> playlist = new HashMap<>();

    public void fillThePlaylist(){

        playlist.put("Whitney Houston","I Wanna Dance With Somebody");
        playlist.put("Madonna","Like a Prayer");
        playlist.put("Michael Jackson", "Rock with You");
        playlist.put("Bruno Mars","Uptown Funk");                             //HashMapa domyślnie uzupełniona celowo, aby dwie ostatnie pozycje były duplikatami dwóch pierwszych
        playlist.put("Lady Gaga", "Just Dance");
        playlist.put("Shakira", "Hips Don’t Lie");
        playlist.put("Whitney Houston","I Wanna Dance With Somebody");  //duplikat pierwszego elemetntu
        playlist.put("Madonna","Like a Prayer"); //duplikat drugiego elemetntu

    }

    public void displayPlaylist(){

        playlist.forEach((key,value) -> System.out.println(key + " - " + value));       //Wyświetlanie HashMapy przy użyciu metody forEach

    }

    public void hashMapToTreeMap(){

        Map<String, String> playlist2 = new TreeMap<>();

        playlist2.putAll(playlist);

        playlist2.forEach((key,value) -> System.out.println(key + " by " + value));      //Konwersja HashMapy na TreeMapę, aby pokazać różnicę między nimi

    }

}
