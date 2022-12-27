
package examfirst;

import java.util.Stack;

    public class Postfix {

    private Stack<String> arr = new Stack<>();
    private String input = "";
    private String output = "";

    private String ch = "";

    public void setInput(String input) {
        this.input = input;
         
    }

    public String convert() {
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i) + "";
            switch (ch) {
                case "+":
                case "-":
                       output+=" " ;
                    getOpere(ch, 1);
                   
                    break;

                case "*":
                case "/":
                       output+=" " ;
                    getOpere(ch, 2);
                     
                    break;
                case "(":
                    arr.push("(");
                    break;
                case ")":
                    getParen();
                    break;
                default:
                    output += ch;
                    break;

            }
        }

        while (!arr.empty()) {
            output += " "+arr.pop().charAt(0);

        }
        return output;
    }

    private void getOpere(String ch, int i) {

        while (!arr.empty() && !arr.peek().equals("(")&& i <= (Integer.parseInt(arr.peek().charAt(1) + ""))  ) {
            output += " " +arr.pop().charAt(0);
        }
        arr.push(ch + i);

    }

    private void getParen() {

        while (true) {
            if (arr.peek().equals("(")) {
                arr.pop();
                break;
            }
            output += " " +arr.pop().charAt(0);

        }
    }
    
    public static void main(String[] args) {

        Postfix in = new Postfix();
        in.setInput("15*2");
        System.out.println(in.convert());

    }
    }