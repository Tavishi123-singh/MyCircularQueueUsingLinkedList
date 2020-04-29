/*
 * created by Intellij IDEA
 * User: Tavishi123-singh
 */
package main;

import circularQueue.MyCircularQueueUsingLinkedList;
import node.Node;

public class Main {
    public static void main(String[] args) {
        MyCircularQueueUsingLinkedList queue=new MyCircularQueueUsingLinkedList();
        queue.enqueue(1000);
        queue.enqueue(2000);
        queue.enqueue(3000);
        queue.enqueue(4000);
        queue.enqueue(5000);
        Node peek=queue.peek();
        if(peek!=null){
            System.out.println(peek.getData() + " is the element at front of the queue");
        }
        Node delete=queue.dequeue();
        if(delete!=null){
            System.out.println(delete.getData() + " is the element deleted from front");
        }
        peek=queue.peek();
        if(peek!=null){
            System.out.println(peek.getData() + " is the element at front of the queue");
        }
    }
}
