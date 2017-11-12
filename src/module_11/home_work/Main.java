package module_11.home_work;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author voksus on 28.04.2017.
 */
public class Main {

    private static String fileName = "dataHW11.txt";
    private static String fileData;

    public static void main(String[] args) {

        // creating new data in file
        generateTextFile();

        // 11.1
        System.out.println("\n\t11.1 ---> the data in file '" + fileName + "' is:");
        readTextFile();
        System.out.println(fileData);
        System.out.println("\n\t---> word(s) to be changed is:");
        Map<String, String> toReplace = new HashMap<>();
        toReplace.put("o", "O");
        toReplace.put("a", "AA");
        for (Map.Entry<String, String> entry : toReplace.entrySet()) {
            System.out.println(entry.getKey() + "\t > \t" + entry.getValue());
        }

        System.out.println("\n\t---> changed String is:");
        String finalString = replacer(toReplace);
        System.out.println(finalString);

        // 11.2
        System.out.println("\n\t11.2 ---> file was changed and updated.");
        fileContentReplacer(toReplace);
        readTextFile();
        System.out.println("\n\t---> new data is:\n" + fileData);

        // 11.3
        System.out.println("\n\t11.3 ---> file was changed and updated.");
        fileContentMerger(toReplace);
        readTextFile();
        System.out.println("\n\t---> new data is:\n" + fileData);

        // 11.4
        String toFind = "AA";
        System.out.print("\n\t11.4 ---> count word(s) '" + "' in file is: ");
        System.out.println(checkWord(toFind));

    }

    private static void readTextFile() {
        readTextFile(fileName);
    }

    private static void readTextFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            fileData = "";
            String line;
            while ((line = br.readLine()) != null) {
                if (fileData.length() > 0 && line.length() > 0) {
                    fileData += "\n";
                }
                fileData += line;
            }
        } catch (IOException e) {
            System.err.println("the ERROR happened while trying to read file :(");
            e.printStackTrace();
        }
    }

    private static void generateTextFile() {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n");
            bw.write("Curabitur tempus lobortis mi eget viverra.\n");
            bw.write("Mauris consequat finibus gravida.");
        } catch (IOException e) {
            System.err.println("the ERROR happened while trying to write file :(");
            e.printStackTrace();
        }
    }

    private static String replacer(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            fileData = fileData.replaceAll(entry.getKey(), entry.getValue());
        }
        return fileData;
    }

    public static File fileContentReplacer(Map<String, String> map) {
        String newString = replacer(map);
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            bw.write(newString);
        } catch (IOException e) {
            System.err.println("The ERROR happened while trying to write file :(");
            e.printStackTrace();
        }
        File file = new File(fileName);
        return file;
    }

    public static File fileContentMerger(Map<String, String> map) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName, true)))) {
            bw.write("\n\n");
            bw.write(replacer(map));
        } catch (IOException e) {
            System.err.println("The ERROR happened while trying to write file :(");
            e.printStackTrace();
        }
        File file = new File(fileName);
        return file;
    }

    public static int checkWord(String word) {

        File file = new File(fileName);
        System.out.println("... the word to search '" + word + "'");
        int wordsCount = 0;


        boolean useTryWithResources = false;

        // using try-with-resources
        if (useTryWithResources) {
            System.out.println("(Try-with-resources USED)");
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    int len = line.length();
                    line = line.replace(word, "");
                    wordsCount += (len - line.length()) / word.length();
                }
            } catch (IOException e) {
                System.err.println("The ERROR happened while trying to read file :(");
                e.printStackTrace();
            }
            return wordsCount;
        }
        // w/o try-with-resources
        System.out.println("(Try-with-resources NOT USED)");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                int len = line.length();
                line = line.replace(word, "");
                wordsCount += (len - line.length()) / word.length();
            }
        } catch (IOException e) {
            System.err.println("The ERROR happened while trying to read file :(");
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("The ERROR happened while trying to close file :(");
                e.printStackTrace();
            }
        }
        return wordsCount;
    }
}