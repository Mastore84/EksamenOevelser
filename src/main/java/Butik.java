import java.util.ArrayList;

public class Butik {
    private int lagerBeholdningVærdi;
    ArrayList<Cykel> lagerBeholdning = new ArrayList<>();

    public void tilføj(Cykel cykel){
        lagerBeholdning.add(cykel);
    }

    public int samletLagerBeholdning(){
        for (Cykel i : lagerBeholdning){
            lagerBeholdningVærdi = lagerBeholdningVærdi + i.getPris();
        }
        return lagerBeholdningVærdi;
    }
}
