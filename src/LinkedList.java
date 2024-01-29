

//public class linkedList {
//    /*
//    Musical Playlist
//    You are developing s music streaming application, and you want to implement a playlist feature each node in the
//    linked list representation a song and the linked list maintain the order of song in the playlist
//     */
//
//    ///// search concepts in LinkedList /////
//    public boolean contains(int data){
//
//
//        return false;
//    }
//
//}
public class LinkedList {
    private Node head;
    private Node tail;
    private Node prev;

    public Node getHead() {
        return this.head;
    }

    public Node getTail() {
        return this.tail;
    }
}

class doublyLinkedList {
    Node head, tail, prev;


    public void addLast(int data) {


    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void addFirst(int data) {
        prepend(data);
    }

    public void display() {

    }
}
