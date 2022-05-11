package com.datastructure;


public class LinkedList <E>  {
    class  Node <E> {
        Node <E> next  ;
        E data ;
        public Node (E obj) {
            data = obj;
            next = null;
        }
    }
    private  Node <E> head;    // that's  a pointer
    private  Node <E> tail;
    private  int currentSize ;
    public LinkedList () {
        head = null;
        tail = null ;
        currentSize = 0;
    }
    public void addFirst (E data ) {
        Node <E> node = new Node <E> (data) ;
        node.next = head;
        head = node ;
        currentSize ++;
    }
    public void addLast (E data){
        Node <E> node = new Node<E>(data);
        if (head == null) {
            head = tail = node ;
            currentSize++;
            return;
        }
        tail.next = node;
        tail = node ;
        currentSize++;

    }
    public void addLastALter (E data) {
        Node <E> node = new Node <E> (data) ;
        if (head == null) {
            head = node ;
            currentSize++;
            return;
        }

        Node <E> temp = head;
        while(temp.next != null) {  // the next of the node that temp points to
            temp = temp.next;
        }
        temp.next = node;
        currentSize++;
    }

    public E removeFirst () {
        if (head == null)  return  null;
        E temp = head.data;
        if (head.next == null) head = tail = null ;
        else  head  = head.next ;
        currentSize--;
        return  temp;
    }
    public E removeLast () {
        if (head == null)  return  null;
        if (head.next == null) return  removeFirst() ;
        Node <E> curr = head, prev =null;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;
        tail = prev;
        currentSize--;
        return  curr.data;
    }
    public E remove (E data){
        Node <E> curr=head, prev = null;
        while (curr != null) {
            System.out.println(((Comparable<E>)data).compareTo(curr.data) );
            if (((Comparable<E>)data).compareTo(curr.data) == 0) {
                if (curr == head) return removeFirst();
                if (curr.next == null) return removeLast();
                prev.next = curr.next ; // middle
                currentSize--;
                return curr.data;
            }
            prev = curr;
            curr = curr.next;

        }
        return null;
    }
    public Boolean contains (E data){
        Node <E> curr=head;
        while (curr != null) {
            System.out.println(((Comparable<E>)data).compareTo(curr.data) );
            if (((Comparable<E>)data).compareTo(curr.data) == 0) {

                return true;
            }
            curr = curr.next;

        }
        return false;
    }
}
