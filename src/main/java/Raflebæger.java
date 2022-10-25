import java.util.Arrays;
import java.util.Random;

public class Raflebæger {
    private int terningeØjneTotal;

    public int ryst(int antalTerninger){
        int terninger[] = new int[antalTerninger];
        Random rand = new Random();
        for(int i=0; i < terninger.length; i++){
            terninger[i] = rand.nextInt(1,6 + 1);
            terningeØjneTotal = terningeØjneTotal + terninger[i];
        }
        System.out.println("Alle terningekast: " + Arrays.toString(terninger));
        return terningeØjneTotal;
    }

    public int se(){
        System.out.println("Totalt antal øjne: " + terningeØjneTotal);
        return terningeØjneTotal;
    }
}
