public class LinkedLists extends Controller {

    // declares my class variables
    public Node head;
    public Node last;
    public int size = 0;

    // constructor, used when the class is first called
    public LinkedLists() {
        head = last = new Node(null);
    }

    // add method to add more names
    public void add(String s) {
        last.setNext(new Node(s));
        last = last.getNext();
        size++;
    }

    // remove method, if it returns false then the specified index element does not exist
    
    public boolean remove(String data){
        Node current = head.getNext();
        Node previous = null;
        while (current != null) {
            String dataOld = current.getData();
            if ((dataOld == null && data == null) || (dataOld != null && dataOld.equals(data))) {
                Node afterRemoved = current.getNext();
                if (previous == null) {
                    head.setNext(afterRemoved);
                } else {
                    previous.setNext(afterRemoved);
                }
                if (afterRemoved.getNext() == null) {
                    last = afterRemoved.getNext();
                    System.out.print(last);
                }
                size--;
                return true;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        return false;
    
    }
    
    //return the size of the list, if list is empty it will return -1
    public int size() {
        return size;
    }

    // check if the list is empty or not
    public boolean isEmpty() {
        return true;
    }

    // get the data at specified index
    public String getData(int index) {

        if(index <= 0) {
            return null;
        }

        Node current = head.getNext();
        for(int i = 1;i < index;i++) {
            if(current.getNext() == null) {
                return null;
            }
            current = current.getNext();
        }

        return current.getData();
    }

    // return true if the list contains arguments otherwise false
    public boolean contains(String s) {
    
        for(int i = 1;i<=size();i++) {
            if(getData(i).equals(s)) {
                return true;
            }
        }
        return false;
    }

    // return contents of the list - recursively 
    public String toString() {
        Node current = head.getNext();
        String output = "[";
        while(current != null) {
            output += current.getData()+",";
            current = current.getNext();
        }
        return output+"]";
    }

    //return first node
    public Node getHead() {
        return head;
    }

    // return (recursively) list
    public void print(Node n) {
        if(n == null) {
            return;
        }else {
            System.out.println(n.getData());
            print(n.getNext());
        }
    }
}