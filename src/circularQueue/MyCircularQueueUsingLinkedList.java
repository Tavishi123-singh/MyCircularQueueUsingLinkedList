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

    public boolean isEmpty() {
        boolean res=false;
        if(rear==null) res=true;
        return res;
    }
    public Node dequeue() {
        Node res = null;
        if (!isEmpty()) {

            res = rear.getNext();
            size--;
            if (rear.getNext() == rear) {
                rear = null;
            } else {
                rear.setNext(res.getNext());
            }
        }

        return res;
    }
    public Node peek() {
        Node response = null;
        if (!isEmpty()) {
            response = rear.getNext();
        }
        return response;
    }

    public int getSize() {
        return size;
    }
}
