import java.util.HashMap;
import java.util.LinkedList;

public class radixSort {

    public static void sort(String[] words) {
        int longestWordLen = 0;
        for(String word : words) {
            if(word.length() > longestWordLen) {
                longestWordLen = word.length();
            }
        }

        for(int i = longestWordLen-1; i >= 0 ; i--) {
            sortAtIndex(words, i);
        }

    }
    public static void sortAtIndex(String[] words, int sortAtIndex) {
        LinkedList<String>[] buckets = new LinkedList[59]; //A-Z+a-z plus one more bucket for empty char
        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<String>();
        }

        int index = 0;
        for(String word: words) {
            if(word.length() > sortAtIndex) {
               index = word.charAt(sortAtIndex) - 64;
               buckets[index].add(word);
            } else {
                buckets[0].add(word);
            }
        }

        index = 0;
        int j = 0;
        for(LinkedList<String> bucket : buckets) {
            if(!bucket.isEmpty()) {
                for(j = 0; j < bucket.size(); j++) {
                    words[index] = bucket.get(j);
                    index++;
                }
            }
        }



    }
}
