import java.util.Calendar;

public class Film {
    private String filmtitel;
    private int udgivelsesår;
    private String producer;
    int year = Calendar.getInstance().get(Calendar.YEAR);

    public Film(String filmtitel, int udgivelsesår){
        this.filmtitel = filmtitel;
        this.udgivelsesår = udgivelsesår;
    }
    public Film(String filmtitel){
        this.filmtitel = filmtitel;
        udgivelsesår = year;
    }
    public String getFilmtitel(){
        return filmtitel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }
    public void addProducer(String producer){
        this.producer = producer;
    }
    public String getProducer(){
        return producer;
    }
}

class Producer{
    private String producer;

    public String getProducer(){
        return producer;
    }
    public void setProducer(String producer){
        this.producer = producer;
    }
}
