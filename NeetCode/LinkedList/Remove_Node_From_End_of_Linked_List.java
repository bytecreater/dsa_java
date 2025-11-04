public class Remove_Node_From_End_of_Linked_List {
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

    public void RemoveKth(int k){
        
        int i = 0;
        Node tempNode = head;
        while(tempNode != null){
            i++;
            tempNode = tempNode.next;
        }
        if(k == i){
            head = head.next;
            return;
        }
        int n = i - k;
        System.out.println(n);
        tempNode = head;
        for(int j = 0; j < n; j++){
            if(j == n-1){
                tempNode.next = tempNode.next.next;
                break;
            }
            tempNode = tempNode.next;
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
        Remove_Node_From_End_of_Linked_List ll = new Remove_Node_From_End_of_Linked_List();
        ll.AddFirst(6);
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.PrintLL();
        System.out.println();
        ll.RemoveKth(5);
        ll.PrintLL();
    }
    
}
