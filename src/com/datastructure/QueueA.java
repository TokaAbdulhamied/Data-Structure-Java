package com.datastructure;

public class QueueA {
    private int Max = 1000;
    private int front, rear;
    private int queue [] = new int [Max];
    QueueA(){
        front=rear=-1;
    }
    public void Enqueue (int item) {
        if (rear == -1)  {
            queue[0] = item;
            front=0;
        }
        rear++;
            queue[rear] = item;


    }
    public int Dequeue () {
        System.out.println();
        if (rear == -1 ) return  -1;
        int item = queue[front];
        front++;
        return item;
    }
}
