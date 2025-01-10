import java.util.ArrayList;

public class Piatto {
    ArrayList<Integer> bocconi = new ArrayList<>();
    int i=0;

    public synchronized void produzione()throws InterruptedException {
            while (bocconi.size() > 9) {
                //System.out.println("aspetto a produrre");
                wait();
            }
            bocconi.add(i);
            i++;
            System.out.println("prodotto un boccone" + i);
            notifyAll();
    }


    public synchronized void consumazione()throws InterruptedException{
            //System.out.println("funzione consumazione avviata");
            while (bocconi.size() < 1) {
                wait();
            }
            System.out.println(bocconi.size());
            //System.out.println(i);
            if (bocconi.size() > 0) {
                //System.out.println("avviato il primo while di consumazione");
                //System.out.println("avviata consumazione");
                //Thread.sleep(2 * 1000);
                System.out.println("mangio boccone"+ i);
                bocconi.remove(0);
                notifyAll();
            }

        }
    }

