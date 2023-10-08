package insertAtLast;

class LinkedList {
    Nodee head;
    
    LinkedList() {
        head = null;
    }
    
    void insert(int data) {
        Nodee newNode = new Nodee(data);
        if (head == null) {
            head = newNode;
        } else {
            Nodee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    void display() {
        Nodee current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
