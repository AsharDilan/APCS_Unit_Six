import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SpellChecker {
    public static String[] getDictionary() throws IOException {
        String[] words = new String[];
        Scanner scan = new Scanner(new File("files/words.txt"));
        int count = 0;
        while (scan.hasNext()) {
            words[count] = scan.next();
            count++;
        }
        return words;
    }

    public static boolean wordInDictionary(String word, String[] dictionary) {
        int min = 0;
        int max = dictionary.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (dictionary[mid].compareTo(word) == 0)
                return true;
            else if (dictionary[mid].compareTo(word) > 0)
                min = mid + 1;
            else
                max = mid - 1;
            return false;

        }
    }

    public static void main(String[] arr) throws IOException{
        String[]dict = getDictionary();
        Scanner scan = new Scanner(new File("files/alice.txt"));
        FileWriter fw = new FileWriter("files/corrected.txt");

        while (scan.hasNext()){
             String nextword = scan.next();
             if (wordInDictionary(nextword,dict)){
                 for (String word : arr) {
                     fw.write(word + " ");
                 }
                 fw.close();
             }
        }
        }
}



