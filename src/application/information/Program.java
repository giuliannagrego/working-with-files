package application.information;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Principais recursos de informação da classe File
        System.out.println("getName: " + path.getName()); // Despreza o caminho e pega apenas o nome do arquivo
        System.out.println("getParent: " + path.getParent()); // Despreza o arquivo e pega apenas o nome do caminho
        System.out.println("getPath: " + path.getPath()); // Pega o caminho completo

        sc.close();
    }
}
