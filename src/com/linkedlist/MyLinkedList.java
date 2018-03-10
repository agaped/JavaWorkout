package com.linkedlist;

/**
 * Created by agaped on 10.03.2018.
 * Double linked list implementation
 */
public class MyLinkedList<E> {

    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;

    public MyLinkedList() {
        size=0;
        head=new ListNode<E>(null);
        tail=new ListNode<E>(null);
        head.next=tail;
        tail.prev=head;
    }

    public int size(){
        return this.size;
    }

    public E get(int index){
        return getNode(index).data;
    }

    public void add(int index, E data){
        ListNode<E> elementToAdd=new ListNode<>(data);
        ListNode<E> elementToAppend;
        if(this.size==0){
            elementToAppend=tail;
        }else{
            elementToAppend=getNode(index);
        }

        elementToAdd.prev=elementToAppend.prev;
        elementToAdd.next=elementToAppend;

        elementToAppend.prev.next=elementToAdd;
        elementToAppend.prev=elementToAdd;

        size++;
    }
    private ListNode<E> getNode(int index){
        int i=0;
        if(index<0 | index>=this.size){
            throw new ArrayIndexOutOfBoundsException();
        }
        ListNode<E> node=head;
        while(i<this.size){
            node=node.next;
            if(i==index){
                break;
            }
            i++;
        }
        return node;
    }

    //replace element with given one
    public void set(int index, E element){
        ListNode<E> elementToAppend=getNode(index);
        elementToAppend.data=element;
    }

    public void remove(int index){
        ListNode<E> nodeToRemove=getNode(index);
        nodeToRemove.next.prev=nodeToRemove.prev;
        nodeToRemove.prev.next=nodeToRemove.next;
        this.size--;
    }
}
