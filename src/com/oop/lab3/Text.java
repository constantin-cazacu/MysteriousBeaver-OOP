package com.oop.lab3;
import java.util.*;

public class Text {
    String text = "N/A";
    int sCount = 0; //sentence count
    int wCount = 0; //word count
    int lCount = 0; //letter count
    int vCount = 0; //vowel count
    int cCount = 0; //consonant count

    public Text(String text) {
        this.text = text;
    }

    public void sentenceCount(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '.' || ch == '?' || ch == '!')
                sCount++;
        }
        System.out.println("Sentence count: " + sCount);
    }

    public void wordCount(String text) {
        String[] words = text.split("\\s+");
        wCount = words.length;
        System.out.println("Word count: " + wCount);
    }

    public void letterCount(String text) {
        char[] ch = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(ch[i]))
                lCount++;
        }
        System.out.println("Letter count: " + lCount);
    }

    public void speechSoundCount(String text) {
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }
        System.out.println("Vowel count: " + vCount);
        System.out.println("Consonant count: " + cCount);
    }

    public void longestWord(String text) {
        // get rif of all the punctuations
        text = text.replaceAll("\\p{Punct}", "");
        text = text.toLowerCase();
        String[] words = text.split(" ");
        String maxLengthWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= maxLengthWord.length())
                maxLengthWord = words[i];
        }
        System.out.println("Longest word: " + maxLengthWord);
    }

    public List<String> topKFrequent(String text, int k) {
        // get rif of all the punctuations
        text = text.replaceAll("\\p{Punct}", "");
        // switch to lowercase in order not to omit the words starting with a capital letter
        text = text.toLowerCase();
        String[] words = text.split("\\s+");

        // initialize map in order to get the frequencies
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : words) {
            // if word is not there we default to 0 and add 1
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // Initialize priority queue and comparator
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                int frequency1 = map.get(word1);
                int frequency2 = map.get(word2);
                // if frequencies are the same we go by greater alphabetical order
                if (frequency1 == frequency2)
                    return word2.compareTo(word1);
                // else sort strings by lesser frequencies
                return frequency1 - frequency2;
            }
        });

        // loop over our entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // add entry to pq
            pq.add(entry.getKey());
            if (pq.size() > k)
                pq.poll();
        }

        List<String> topK = new ArrayList<>();
        while (!pq.isEmpty())
            topK.add(pq.poll());

        // reverse back to order
        Collections.reverse(topK);
        System.out.println("Top 5 words: " + topK);
        return topK;
    }
}
