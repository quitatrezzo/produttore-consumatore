public class Produttore extends Thread{
    Piatto piatto;
    public Produttore(Piatto piatto){
        this.piatto = piatto;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5*100);
                this.piatto.produzione();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    }

