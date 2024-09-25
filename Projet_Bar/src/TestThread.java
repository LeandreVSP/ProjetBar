public class TestThread {
    public static void main(String[] args) {

        //Runnable runnable= new Barman();       voir cette ligne plus tard


        Barman barmanObj = new Barman(0, 0.1, "Debutant", 2);
        //Bar barObj = new Bar(1,4,0, barmanObj, clientObj);
        Client clientObj = new Client(10, 98, 0, "occasionnel", "homme", barmanObj);
        Client clientObj2 = new Client(10, 98, 0, "occasionnel", "femme", barmanObj);
        Client clientObj3 = new Client(100, 98, 0, "occasionnel", "homme", barmanObj);


        Thread barman = new Thread(barmanObj);
        Thread client = new Thread(clientObj);
        Thread client2 = new Thread(clientObj2);
        Thread client3 = new Thread(clientObj3);
        //Thread bar = new Thread(barObj);

        client2.start();
        client.start();
        client3.start();
        barman.start();

        //bar.start();





        try {
            client.join();
            barman.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
