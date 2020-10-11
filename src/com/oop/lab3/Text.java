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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void sentenceCount(String text) {
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch == '.' || ch == '?' || ch == '!')
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
        for(int i = 0; i < text.length(); i++) {
            if(Character.isLetterOrDigit(ch[i]))
                lCount++;
        }
        System.out.println("Letter count: " + lCount);
    }

    public void speechSoundCount(String text) {
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else if(ch >= 'a' && ch <= 'z') {
                cCount++;
            }
        }
        System.out.println("Vowel count: " + vCount);
        System.out.println("Consonant count: " + cCount);
    }

    public void longestWord(String text) {
        text = text.toLowerCase();
        String[] words = text.split(" ");
        String maxLengthWord = "";
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() >= maxLengthWord.length())
                maxLengthWord = words[i];
        }
        System.out.println("Longest word: " + maxLengthWord);
    }

    public List<String> topKFrequent(String text, int k) {
        text = text.replaceAll("\\p{Punct}","");
        text = text.toLowerCase();
        String[] words = text.split(" ");
        List<String> top5 = new ArrayList<>();
        if (words == null || words.length == 0) {
            return top5;
        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(k,
                (a, b) -> a.getValue() != b.getValue() ? b.getValue() - a.getValue()
                        : a.getKey().compareTo(b.getKey()));
        for (Map.Entry<String, Integer> set : map.entrySet()) {
            maxHeap.add(set);
        }

        while (k > 0) {
            top5.add(maxHeap.poll().getKey());
            k--;
        }
        System.out.println("Top 5 words: " + top5);
        return top5;
    }
}
