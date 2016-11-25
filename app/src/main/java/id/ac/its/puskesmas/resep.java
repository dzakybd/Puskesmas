package id.ac.its.puskesmas;

/**
 * Created by Dzaky on 25/11/2016.
 */

public class Resep {

    public String resep(int penyakit) {
        String text;
        switch (penyakit){
            case 1:
                text="Paracetamol";
                break;
            case 2:
                text="Antalgin";
                break;
            case 3:
                text="Oskadon";
                break;
            default:
                text="";
                break;
        }
        return text;
    }
}
