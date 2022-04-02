package abistrato;

public abstract class Fucionario {
    
    protected String nom;
    protected String dlc;
    protected double slr;

    public Fucionario(String nom, String dlc, double slr) {
        this.setNom(nom);
        this.setDlc(dlc);
        this.setSlr(slr);
    }
    public abstract void calcSlr();
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDlc() {
        return dlc;
    }
    public void setDlc(String dlc) {
        this.dlc = dlc;
    }
    public double getSlr() {
        return slr;
    }
    public void setSlr(double slr) {
        this.slr = slr;
    }
    @Override
    public String toString() {
        return "Fucionario [dlc=" + dlc + ", nom=" + nom + ", slr=" + slr + "]";
    }

    
}
