import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner t = new Scanner(System.in);
        int opzione;

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


                    break;
                case 2:


                    break;
                case 3:


                    break;
                case 4:


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
