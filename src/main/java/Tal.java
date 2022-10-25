import java.util.Arrays;
import java.util.Random;

public class Tal {
    int[] tilfældigeTal = new int[10];
    Random random = new Random();

    public void lavMangeTal(){
        for(int i=0; i < tilfældigeTal.length; i++){
            tilfældigeTal[i] = random.nextInt(1, 6 + 1);
        }
    }

    public String getTilfældigeTal(){
        return Arrays.toString(tilfældigeTal);
    }
}
