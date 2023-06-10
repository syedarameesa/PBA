package PBL_Earthquake;
//project by 149

public class LinkedQueue{
    private static class Node{
        Object object;
        Node pre = this;
        Node next = this;

        Node(Object object){
            this.object = object;
        }
        //project by 149
        Node(Object object,Node pre,Node next){
            this.object = object;
            this.pre = pre;
            this.next = next;
        }
        //project by 149
    }

    private Node head = new Node(null);
    //project by 149
    private int size;

    public void add(Object object){
        head.pre = head.pre.next = new Node(object,head.pre,head);
        size++;
    }
    //project by 149
    public Object first(){
        if(size == 0){
            throw new IllegalStateException("Empty Queue");
        }
        //project by 149
        return head.next.object;
    }
    //project by 149

    public Object remove(){
        if(size == 0){
            throw new IllegalStateException("Empty Queue");
        }
        Object obj = head.next.object;
        head.next = head.next.next;
        head.next.pre = head;
        --size;
        return obj;
    }
    //project by 149

    public int size(){
        return size;
    }
    //project by 149

    public boolean isEmpty(){
        return (size==0);
    }
    //project by 149

    public void traverse(){
        for(Node temp = head.next;temp!=head;temp = temp.next){
            System.out.println(temp.object);
        }
        //project by 149
    }
}
