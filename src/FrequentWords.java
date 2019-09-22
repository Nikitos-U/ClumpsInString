import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FrequentWords {
    public static HashSet<String> frequentWords(String text, int k) {
        List<String> allFrequentPatterns = new ArrayList<>();
        int[] count = new int[text.length() - k + 1];
        int max = 0;
        for (int i = 0; i <= text.length() - k; i++) {
            String Pattern = text.substring(i, i + k);
            count[i] = PatternCount.patternCount(text, Pattern);
            allFrequentPatterns.add(Pattern);
            if (max < count[i]) {
                max = count[i];
            }
        }
        HashSet<String> frequentPatterns = new HashSet<>();
        for (int i = 0; i < text.length() - k + 1; i++) {
            if (count[i] == max) {
                frequentPatterns.add(allFrequentPatterns.get(i));
            }
        }
        return (frequentPatterns);
    }
}
