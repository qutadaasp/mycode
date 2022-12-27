/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examfirst;

import java.util.Stack;

public class Prefix2 {

    private Stack<String> arr = new Stack<>();
    private String input = "";
    private String output = "";

    private String ch = "";
    private StringBuffer str;

    public void setInput(String input) {

        this.input = input;

    }

    public String convert() {
        for (int i = input.length() - 1; i >= 0; i--) {
            ch = input.charAt(i) + "";
            switch (ch) {
                case "+":
                case "-":

                    output += " ";
                    getOpere(ch, 1);
                    break;

                case "*":
                case "/":
                    output += " ";
                    getOpere(ch, 2);
                    break;
                case ")":

                    arr.push(")");
                    break;
                case "(":
                    output += " ";
                    getParen();
                    break;
                default:
                    output += ch;
                    break;

            }
        }
        while (!arr.empty()) {
            output += arr.pop().charAt(0) + " ";
        }

        str = new StringBuffer(output);
        output = str.reverse().toString();
        return output;
    }

    private void getOpere(String ch, int i) {

        while (!arr.empty() && !arr.peek().equals(")") && i < (Integer.parseInt(arr.peek().charAt(1) + ""))) {
            output += arr.pop().charAt(0) + " ";

        }
        arr.push(ch + i);

    }

    private void getParen() {

        while (true) {
            if (arr.peek().equals(")")) {
                arr.pop();
                break;
            }
            output += arr.pop().charAt(0) + " ";

        }

    }

    public static void main(String[] args) {

        Prefix2 in = new Prefix2();

        in.setInput("(5+3)*5/10");

        System.out.println(in.convert());

    }

}
