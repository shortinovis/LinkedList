import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        int opzione;

        LinkedList<Object> list=new LinkedList<>();
        do {
            System.out.println("scegli  opzione:");
            System.out.println("1-Aggiunta nodo in testa");
            System.out.println("2-Aggiunta nodo in coda");
            System.out.println("3-Aggiunta nodo in pos");
            System.out.println("4-eliminazione nodo");
            System.out.println("5-Aggiunta record");
            System.out.println("0-esci");
            opzione = t.nextInt();
            t.nextLine();
            switch (opzione) {
                case 1:

                    list.add(12);

                    break;
                case 2:
                    list.addInCoda(32);

                    break;
                case 3:
                    list.addPos(2,2);

                    break;
                case 4:
                    list.addBeforeElement(2,4);

                    break;

                case 0:


                    System.out.println("grazie per aver usate il servizio cortinovis, alla prossima!");
                    break;
                default:
                    System.out.println("metti una tra le opzioni richieste");

            }
        } while (opzione != 0);
    }
}
