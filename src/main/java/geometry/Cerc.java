package geometry;

public class Cerc {

    private int raza;

    public Cerc(int raza) {
        this.raza = raza;
    }

    public float calculeazaAria(){
        return (float)Math.PI * (raza*raza);
    }

    public float calculeazaCircumferinta(){
        return (float)(2*Math.PI)*raza;
    }

}
