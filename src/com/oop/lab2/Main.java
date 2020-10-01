package com.oop.lab2;
import com.oop.lab2.advanced.Queue;
import com.oop.lab2.basic.box;

public class Main {
    public static void main(String[] args) {

        box b1 = new box();
        box b2 = new box(2.25);
        box b3 = new box(7.0, 3.25, 3.0);

        System.out.println("Box #1\t " + "height: " + b1.getHeight() + "\t width: " + b1.getWidth() + "\t length: " + b1.getlength());
        System.out.println("Box #2\t " + "height: " + b2.getHeight() + "\t width: " + b2.getWidth() + "\t length: " + b2.getlength());
        System.out.println("Box #3\t " + "height: " + b3.getHeight() + "\t width: " + b3.getWidth() + "\t length: " + b3.getlength());

        System.out.println("");

        System.out.println("Box #1 surface area:\t" + b1.surfaceArea(b1.getHeight(), b1.getWidth(), b1.getlength()));
        System.out.println("Box #2 surface area:\t" + b2.surfaceArea(b2.getHeight(), b2.getWidth(), b2.getlength()));
        System.out.println("Box #3 surface area:\t" + b3.surfaceArea(b3.getHeight(), b3.getWidth(), b3.getlength()));

        System.out.println("");

        System.out.println("Box #1 volume:\t" + b1.boxVolume(b1.getHeight(), b1.getWidth(), b1.getlength()));
        System.out.println("Box #2 volume:\t" + b2.boxVolume(b2.getHeight(), b2.getWidth(), b2.getlength()));
        System.out.println("Box #3 volume:\t" + b3.boxVolume(b3.getHeight(), b3.getWidth(), b3.getlength()));

        System.out.println("");

        Queue q1 = new Queue(5);
        Queue q2 = new Queue();

        q1.pushElement(7);
        q1.pushElement(22);
        q1.pushElement(29);
        System.out.println("Last element is: " + q1.getLastElement());


        System.out.println("");

        q2.pushElement(7);
        q2.pushElement(9);
        q2.pushElement(16);
        System.out.println("Last element is: " + q2.getLastElement());

    }

}
