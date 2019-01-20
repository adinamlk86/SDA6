package ooppractice.geometry;

public class Dreptunghi {

    private int lungime;
    private int latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public int calculeazaArie(){
        return latime*lungime;
    }

    public int calculeazaPerimetru(){
        return 2*(latime+lungime);
    }

}
