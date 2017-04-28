package module_11.home_work;

import java.io.*;
import java.util.Map;

/**
 * Created by voksus on 28.04.2017.
 */
public class Main {

    private static String fileName = "dataHW11.txt";

    public static void main(String[] args) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            bw.write("Hello на русском... Бла-бла-бла...");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            System.out.println(br.readLine());
        }

    }

    private String replacer(Map map) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            // to do
        }
        return null;
    }

}