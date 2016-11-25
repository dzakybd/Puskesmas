package id.ac.its.puskesmas;

/**
 * Created by Dzaky on 24/11/2016.
 */

public class Apoteker {
    private String kode;
    private String nama;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKode() {
        return kode;
    }

    public String ambilobat(int penyakit) {
        String text;
        switch (penyakit){
            case 1:
                text="Paracetamol\n" +
                        "diminum 3x sehari sebelum makan\n" +
                        "1tablet untuk dewasa\n" +
                        "Terima Kasih, Semoga Cepat Sembuh :)";
                break;
            case 2:
                text="Antalgin\n" +
                        "diminum 3x sehari sebelum makan\n" +
                        "1tablet untuk dewasa\n" +
                        "Terima Kasih, Semoga Cepat Sembuh :)";
                break;
            case 3:
                text="Oskadon\n" +
                        "diminum 3x sehari sebelum makan\n" +
                        "1tablet untuk dewasa\n" +
                        "Terima Kasih, Semoga Cepat Sembuh :)";
                break;
            default:
                text="";
                break;
        }
        return text;
    }
}
