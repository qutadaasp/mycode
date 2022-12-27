package javaapplication20;

import java.awt.*;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Graph extends JFrame {

    static int size = 0;
    static LinkedList<String> a;
    static int cn = 0;

    public static void addG(String s) {
        a.add(s);
        size++;
    }

    public static void removeG(int s) {
        a.remove(s);
        size--;
    }

    @Override
    public void paint(Graphics gr) {
        try {
            super.paint(gr);
            Scanner s = new Scanner(System.in);
            int x = 20;
            for (int i = 0; i < size; i++) {
                gr.drawRect(x, 50, 50, 22);
                x += 100;
                gr.drawString(a.get(i), x - 80, 70);
                for (int j = 0; j < size; j++) {
                    gr.drawRect(x - 50, 50, 50, 22);
                    gr.drawString("null", x - 180, 70);
                }
                gr.drawLine(x, 70, x + 40, 70);
                x += 40;

            }
            gr.drawString("null", x - 80, 70);
            gr.drawString("null", x, 70);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public Graph() {
        setVisible(true);
        setSize(1000, 1000);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] as) {
        Graph b = new Graph();
        a = new LinkedList<>();
        addG("b");
        addG("a");
        addG("3");
        addG("3");
        addG("3");
        addG("3");
        removeG(2);
    }
}
//String        drawString(Stringtoadd,h,w)
// DrawLine (x1,y1,x2,y2)
//DrawRectabgle(x,y,w,h)
//DrawImage للصور
