public class Node {

    // Fields
    private String data;
    private Node next;

    // constructor
    public Node(String data) {
        this(data,null);
    }

    // constructor two with Node parameter
    public Node(String data, Node node) {
        this.data = data;
        next = node;
    }

  

    // return the data
    public String getData() {
        return data;
    }

    // String data to this.data
    public void setData(String data) {
        this.data = data;
    }

    // return next
    public Node getNext() {
        return next;
    }
    // Node next set to this.next
    public void setNext(Node next) {
        this.next = next;
    }

}