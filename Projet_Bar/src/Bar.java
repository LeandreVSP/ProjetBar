public class Bar implements Runnable{
    int nbTables=1, capaTable=3, qualite;
    Barman barman;
    Client client;

    public Bar(int nbTables, int capaTable, int qualite, Barman barman, Client client) {
        this.nbTables = nbTables;
        this.capaTable = capaTable;
        this.qualite = qualite;
        this.barman = barman;
        this.client = client;
    }

    public void plusTables(){
        if (qualite == 100) {
            nbTables++;
        }
    }
    public void run(){
     plusTables();
    }
}
