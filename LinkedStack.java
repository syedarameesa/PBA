package PBL_Earthquake;

class Node{
    Node next;
    Object data;

    Node(Object obj){
        this.data = obj;
    }
    //project by 149
    Node(Object obj,Node next){
        this.data = obj;
        this.next = next;
    }
    //project by 149
}

public class LinkedStack{
    private Node top;
    private int size;

    public boolean isEmpty(){
        return (size == 0);
    }
    //project by 149

    public Object peek(){
        if(size == 0){
            throw new java.util.NoSuchElementException("Empty Stack");
        }
        //project by 149
        return top.data;
    }
    //project by 149
    public Object pop(){
        if(size == 0){
            throw new java.util.NoSuchElementException("Empty Stack");
        }
        //project by 149
        Object obj = top.data;
        top = top.next;
        size--;
        return obj;
    }
    //project by 149

    public void push(Object obj){
        top = new Node(obj,top);
        ++size;
    }
    //project by 149

    public int size(){
        return size;
    }
}