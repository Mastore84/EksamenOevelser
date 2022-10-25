public class Tal2 {
    int talListe[] = {5, 66, 12, 87, 66, 56, 89, 66};

    public int tælTal(int tal){
        int forekomster = 0;
        for (int i : talListe){
            if(i == tal){
                forekomster++;
            }
        }
        return forekomster;
    }

    public int gennemsnit(){
        int total = 0;
        int gennemsnit = 0;
        for (int i : talListe){
            total = total + i;
        }
        gennemsnit = total / (talListe.length + 1);
        return gennemsnit;
    }
}
