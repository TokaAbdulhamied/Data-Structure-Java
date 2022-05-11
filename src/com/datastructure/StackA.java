package com.datastructure;

public class StackA {
    private  int top ;
    private int Max = 1000;
    private int container[] = new int [Max];
    StackA(){
        top = -1;
    }
    public boolean isEmpaty(){
        return (top < 0);
    }
    public void push(int item){
        if (top >= (Max - 1)) {
            System.out.println("Stack Overflow");
        }
        top++;
        container[top] = item;
    }
    public int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int item = container[top];
        top--;
      return item;
    }

    public int peak(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return  container[top];
    }
    void print(){
        for(int i = top;i>-1;i--){
            System.out.print(" " + container[i]);
        }
    }
}
