package com.leetcode;
class Stack
{
    char[] ch;
    static int top;
    Stack() {top=-1; ch = new char[104];}
    public void push(char ch) {this.ch[++top] = ch; }
    public char pop() {return this.ch[top--]; }
    public boolean isEmpty() { return top == -1 ? true : false;  }
    public char peek() { if(top != -1) return this.ch[top]; else return 'x';}
}

public class BalancedParenthesis
{
    public static void main(String[] args) {
        String str = "{[()()]}{{}}";
        Stack stack = new Stack();

        System.out.println(" is Balance "+str+" : "+isBalance(str,stack));

    }
    public static boolean isBalance(String str, Stack stack)
    {
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[')
            {
                stack.push(str.charAt(i));
            }
            else
            {
                if(stack.isEmpty() || str.charAt(i) != matchingBrace(stack.peek()))
                    return false;
                else
                {
                    stack.pop();
                }
            }
        }
        return true;
    }
    public static char matchingBrace(char ch)
    {
        switch (ch)
        {
            case '{':
                return '}';
            case '[':
                return ']';
            case '(':
                return ')';
        }
        return 'x';
    }
}
