import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ClumpsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Genome = scanner.nextLine();
        int k = scanner.nextInt();
        HashSet<String> frequent = FrequentWords.frequentWords(Genome,k);
        for (String s : frequent) {
            System.out.println(s);
        }
//        int k = scanner.nextInt();
//        int L = scanner.nextInt();
//        int t = scanner.nextInt();
    }
}



