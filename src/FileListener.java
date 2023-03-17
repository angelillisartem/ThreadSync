import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileListener implements Runnable{
    @Override
    public void run() {
//        System.out.print("Thread partito");
        File FileListener = new File("src/FileListener");

        Scanner LetturaFile = null;

        try {
            LetturaFile = new Scanner(FileListener);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//        while (LetturaFile.hasNextLine()) {
//            System.out.print(LetturaFile.next());
//        }

        int cont;
        for (cont = 0; LetturaFile.hasNextLine(); cont++) {
            LetturaFile.nextLine();
        }

        System.out.print("\nLinee attuali: " + cont);

    }

}
