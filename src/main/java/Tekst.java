import java.util.ArrayList;
import java.util.Scanner;

public class Tekst {

    private ArrayList<String> tekstLinjer = new ArrayList<>();
    private ArrayList<String> unikke = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int antalUnikke;

    public void tilføj(){
        System.out.println("Skriv en tekst, der skal tilføjes:");
        String tekst = sc.nextLine();
        tekstLinjer.add(tekst);
    }

    public int findAntalUnikke(){
        for (String tekst: tekstLinjer) {
            if(!unikke.contains(tekst)){
                unikke.add(tekst);
                antalUnikke++;
            }
        }
        return antalUnikke;
    }
}
