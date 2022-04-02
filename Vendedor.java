package abistrato;

public class Vendedor extends Fucionario{

    private double tvnd;

    public Vendedor(String nom, String dlc, double slr) {
        super(nom, dlc, slr);
    }

    public double getTvnd() {
        return tvnd;
    }

    public void setTvnd(double tvnd) {
        this.tvnd = tvnd;
    }

    public void calcSlr() {
        slr = slr + (slr * 0.2);
    }
    
}
