package com.oop.lab3;
import com.oop.lab3.Text;

public class Main {
    public static void main(String[] args) {
        Text t1 = new Text("Lorem ipsum! Ad astra? Ad astra per aspera. Memento mori. Vincit qui se vincit? Astra inclinant, sed non obligant. Carpe vinum! Carpe diem! Ad meliora. Astra inclinant, sed non obligant. Vivere memento.");
        System.out.println(t1.text);
        System.out.println("About text info:");
        t1.sentenceCount(t1.text);
        t1.wordCount(t1.text);
        t1.letterCount(t1.text);
        t1.speechSoundCount(t1.text);
        t1.longestWord(t1.text);
        t1.topKFrequent(t1.text, 5);
    }
}
