public class Reorder {
    static Node head;
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

    public void Reorderll(Node head){
        Node slow = head , fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null, curr = slow.next , next;
        slow.next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node first = head;
        Node second = prev;
        while(second != null){
            Node temp1 = first.next;
            Node temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
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
        Reorder ll = new Reorder();
        ll.AddFirst(6);
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddFirst(0);
        ll.PrintLL();
        ll.Reorderll(head);
        System.out.println();
        ll.PrintLL();
    }
}
