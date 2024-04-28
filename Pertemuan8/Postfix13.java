package Pertemuan8;

import java.util.Scanner;

public class Postfix13 {
    public int n, top;
    public char[] stack;

    public Postfix13(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.') {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c) {
        if (c == '^' || c == '%' || c == '*' || c == '/'|| c == '-' || c == '+') {
            return true;
        } else {
            return false;
        }
    }

    public int derajat(char c) {
        switch (c) {
            case '^':
                return 3;

            case '%':
                return 2;

            case '/':
                return 2;

            case '*':
                return 2;

            case '-':
                return 1;

            case '+':
                return 1;

            default:
                return 0;
        }
    }

    public String konversi(String q) {
        String p = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = q.charAt(i);
            if (IsOperand(c)) {
                p = p + c;
            }
            if (c == '(') {
                push(c);
            }
            if (c == ')') {
                while (stack[top] != '(') {
                    p = p + pop();
                }
                pop();
            }
            if (IsOperator(c)) {
                while (derajat(stack[top]) >= derajat(c)) {
                    p = p + pop();
                }
                push(c);
            }
        }
        return p;
    }

}

class PostfixMain13{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String p,q;
        System.out.print("\nMasukkan ekspresi matematika (infix) : ");
        q = input.nextLine();
        q = q.trim();
        q = q+ ")";

        int total = q.length();
        Postfix13 post = new Postfix13(total);
        p = post.konversi(q);
        System.out.println("Postfix : " + p);








        input.close();
    }
}
