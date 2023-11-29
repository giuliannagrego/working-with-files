package application.write;

import java.io.*;

public class Program {
    public static void main(String[] args) {

        String[] lines = new String[] {"Olá mundo!", "Veja, estou escrevendo em um arquivo por código", "Codar é massa!!!"};

        String path = "C:\\ProgramData\\Temp\\out.txt";

        // Gera um arquivo e escreve as linhas da String[] lines
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}