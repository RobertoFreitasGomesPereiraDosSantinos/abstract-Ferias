package abistrato;

public class Gerente extends Fucionario {

    public Gerente(String nom, String dlc, double slr) {
        super(nom, dlc, slr);
    }

    public void calcSlr() {
        slr = slr + (slr * 0.2);
    }
}
