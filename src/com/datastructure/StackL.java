package com.datastructure;

public class StackL <E>{
    class Node <E> {
        Node <E> next ;
        E data;
        Node(E data){
            next = null;
            this.data = data;
        }
    }
    private Node <E> top ;
    StackL (){
        top=null;
    }
    public boolean isEmpaty(){
        return (top ==null);
    }
    public void push(E data){
        Node <E> node = new Node<E>(data);
     if (top == null) {
          top = node;
          return;
     }
     node.next = top;
     top = node ;
    }
    public E pop(){
        if (top == null) {
            return null;
        }
        E data = top.data;
        top = top.next;
        return data;
    }
    public E peak(){
        if (top ==null ) {
            return null;
        }
        return  top.data;
    }

}
