/*
 * created by Intellij IDEA
 * User: Tavishi123-singh
 */
package node;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        next=null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
