public class Barman implements Runnable {

    int motiv;
    double exp , adapt;
    String grade;


    public Barman(double exp, double adapt, String grade, int motiv) {
        // AJOUTER LES CONDITIONS DANS LE CONSTRUCTEUR
        this.exp = exp;  //faire en sorte que ça soit entre 0 et 100
        this.adapt = adapt; //Multiplicateur entre 1,0 et 2,0
        this.grade = grade; // soit Débutant, tu verras ,soit Expert
        this.motiv = motiv; // Entre 1 et 10
    }

    public void promotion() {
        this.grade = "Expert";
    }
    public void retro() {
        this.grade = "Débutant";
    }

    public void run(){
        System.out.println(grade);
    }


















    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public double getAdapt() {
        return adapt;
    }

    public void setAdapt(double adapt) {
        this.adapt = adapt;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getEtat() {
        return motiv;
    }

    public void setEtat(int etat) {
        this.motiv = motiv;
    }
}
