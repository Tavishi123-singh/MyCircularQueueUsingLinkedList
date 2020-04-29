/*
 * created by Intellij IDEA
 * User: Tavishi123-singh
 */
package circularQueue;

import node.Node;

public class MyCircularQueueUsingLinkedList {
    private Node rear;
    private int size;
    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            rear = node;
            size++;
            node.setNext(node);
        } else {
            node.setNext(rear.getNext());
            rear.setNext(node);
            rear = node;
            size++;

        }
    }

    private boolean isEmpty() {
        boolean res=false;
        if(rear==null) res=true;
        return res;
    }
}
