class Main {

    static class LinkedList {
        int data;
        LinkedList next = null;

        LinkedList(int data, LinkedList node) {
            this.data = data;
            this.next = node;
        }
    }

    static LinkedList head = null;
    static LinkedList temp = null;
    // Insert at Beginning
    public void insert(int data) {
        LinkedList newNode = new LinkedList(data, null);
        // If list is empty
        if (head == null) {
            head = newNode;
            head.next=null;
            return;
        }
       newNode.next=head;
       head=newNode;
    }

    // Display list
    public void display() {
        LinkedList temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Main list = new Main();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}
