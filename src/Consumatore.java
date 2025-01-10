public class Consumatore extends Thread {
    Piatto piatto;
    public Consumatore(Piatto piatto){
        this.piatto = piatto;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2*1000);
                System.out.println("this.piatto.consumazione()");
                this.piatto.consumazione();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        }


    }

