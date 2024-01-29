
//public class Node {
//    String data;
//    Node next;
//}

public class Node {
    public Node prev;
    private String data;
    private Node next;
    private Node previous;

    public Node(int data) {
        this.data = String.valueOf(data);
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

}

