public class Reverese_LL {
    Node head;
    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void AddFirst(int data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            return;
        }
        NewNode.next = head;
        head = NewNode;
    }

    public void Reversell() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next;   // Step 1: Save next node
            curr.next = prev;   // Step 2: Reverse current link
            prev = curr;        // Step 3: Move prev forward
            curr = next;        // Step 4: Move curr forward
        }

        head = prev; // Step 5: Update head
    }

    public void PrintLL(){
        Node tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        Reverese_LL ll = new Reverese_LL();
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.PrintLL();
        System.out.println();
        ll.Reversell();
        ll.PrintLL();
    }
}
