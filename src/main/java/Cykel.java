public class Cykel {
    private String mærke;
    private String farve;
    private int pris;

    public Cykel(String mærke, String farve, int pris){
        this.farve = farve;
        this.mærke = mærke;
        this.pris = pris;
    }
    public int getPris(){
        return pris;
    }

    public String toString(){
        return "Mærke: " + mærke + ", farve: " + farve + ", pris: " + pris + ",-";
    }
}
