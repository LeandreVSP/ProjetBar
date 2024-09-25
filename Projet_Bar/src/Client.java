public class Client implements Runnable{
    double satisfaction, tolerance, alcool;
    String type= "occasionnel", genre;
    Barman barman;
    Bar bar;
    // type = occasionnel ou habitue


    public Client(double satisfaction, double tolerance, double alcool, String type, String genre, Barman barman) {
        this.satisfaction = satisfaction; // Entre 0 et 100
        this.tolerance = tolerance; //Entre 0 et 10
        this.alcool = alcool; //Entre 0 et 100
        this.type = type; // Soit occasionnel et ou habitué
        this.genre = genre; // hommme/ femme
        this.barman = barman;
    }
    public void retour(){
        if (satisfaction >= 100) {
            barman.promotion();
        }
        else
            barman.retro();
    }
    public void run(){
        retour();
        System.out.println();
    }




















    public double getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(double satisfaction) {
        this.satisfaction = satisfaction;
    }

    public double getTolerance() {
        return tolerance;
    }

    public void setTolerance(double tolerance) {
        this.tolerance = tolerance;
    }

    public double getAlcool() {
        return alcool;
    }

    public void setAlcool(double alcool) {
        this.alcool = alcool;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Barman getBarman() {
        return barman;
    }

    public void setBarman(Barman barman) {
        this.barman = barman;
    }
}
