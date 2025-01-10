public class Main {
    public static void main(String[] args) {
        Piatto piatto = new Piatto();
        Consumatore consumatore = new Consumatore(piatto);
        Produttore produttore = new Produttore(piatto);
        consumatore.start();
        produttore.start();



    }
}