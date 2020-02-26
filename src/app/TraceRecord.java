package app;

class Node
{
    int x;
    int y;
    Node next;
    public Node(int x, int y){
        this.x = x;
        this.y = y;
        this.next = null;
    }
}

public class TraceRecord {
    
    public Node first;
    public Node last;
    public boolean isEmpty(){
        return first == null;
    }

    public void insert(int x, int y){
        Node node = new Node(x, y);
        if (this.isEmpty()) {
            first = node;
            last = node;
        }
        else {
            last.next = node;
            last = node;
        }
    }
    public void delete(){
        Node node;
        if (this.isEmpty()) {
            System.out.println("[佇列已經空了]\n");
            return;
        }
        node = first;
        while (node.next!=last) {
            node = node.next;
        }
        node.next = last.next;
        last = node;
    }
}