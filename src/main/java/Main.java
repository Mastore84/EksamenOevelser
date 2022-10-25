import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //øvelse 1
        Tekst tekst = new Tekst();
        tekst.tilføj();
        tekst.tilføj();
        tekst.tilføj();
        tekst.tilføj();
        System.out.println(tekst.findAntalUnikke());

        /*
        //øvelse 2
        Film film1 = new Film("Fear and Loathing", 1996);
        Film film2 = new Film("Lord of the Rings");
        System.out.println(film1.getFilmtitel() + ", " + film1.getUdgivelsesår());
        System.out.println(film2.getFilmtitel() + ", " + film2.getUdgivelsesår());
        Producer producer = new Producer();
        producer.setProducer("Peter Jackson");
        film2.addProducer(producer.getProducer());
        System.out.println(film2.getFilmtitel() + ", " + film2.getUdgivelsesår() + ", " + film2.getProducer());
         */

        //øvelse 3
        /*Raflebæger raflebæger = new Raflebæger();
        raflebæger.ryst(6);
        raflebæger.se();*/

        //øvelse 4
        /*Butik butik = new Butik();
        Cykel cykel1 = new Cykel("Kildemoes", "rød", 2999);
        Cykel cykel2 = new Cykel("SCO", "sort", 1999);
        Cykel cykel3 = new Cykel("Puch", "hvid", 1499);
        butik.tilføj(cykel1);
        butik.tilføj(cykel2);
        butik.tilføj(cykel3);
        System.out.println(cykel1);
        System.out.println(cykel2);
        System.out.println(cykel3);
        System.out.println("Samlet lagerværdi: " + butik.samletLagerBeholdning());
         */

        //øvelse 5
        /*Tal tal = new Tal();
        tal.lavMangeTal();
        System.out.println(tal.getTilfældigeTal());
        */

        //øvelse 6
        /*Tal2 tal2 = new Tal2();
        System.out.println("Alle tal i listen: " + Arrays.toString(tal2.talListe));
        System.out.println("Forekomster af tallet 66: " + tal2.tælTal(66));
        System.out.println("Forekomster af tallet 5: " + tal2.tælTal(5));
        System.out.println("Forekomster af tallet 7: " + tal2.tælTal(7));
        System.out.println("Gennemsnit af alle tal: " + tal2.gennemsnit());
        */
    }
}

