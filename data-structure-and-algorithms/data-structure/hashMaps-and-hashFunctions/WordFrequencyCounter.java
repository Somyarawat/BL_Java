import java.util.*;
public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> wordMap = new HashMap<>();
        System.out.print("Enter a Sentence : ");
        String sentence = sc.next();
        String words[] = sentence.split(" ");
        int i = 0;
        while (i < words.length) {
            String word = words[i].toLowerCase();
            if (wordMap.containsKey(word)) {
                int count = wordMap.get(word);
                wordMap.put(word, count + 1);
            }
            else {
                wordMap.put(word, 1);
            }
            i++;
        }
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}