public class Merge_two_sorted_list {
    Node head;
    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void Addlast(int data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            return;
        }
        Node tempNode = head;
        while(tempNode.next != null){
            tempNode = tempNode.next;
        }
        tempNode.next = NewNode;
        NewNode.next = null;
    }

    public void PrintLL(){
        Node tempNode = head;
        if (head == null){
            System.out.print("List is empty");
            return;
        }
        while(tempNode != null ){
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Merge_two_sorted_list ll = new Merge_two_sorted_list();
        int[] list1 = {1,2,4};
        int[] list2 = {1,3,5};
        for(int i = 0; i < list1.length; i++){
            if(list1[i] == list2[i]){
                ll.Addlast(list1[i]);
                ll.Addlast(list2[i]);
            }
            else if(list1[i] > list2[i]){
                ll.Addlast(list2[i]);
                ll.Addlast(list1[i]);
            }
            else{
            ll.Addlast(list1[i]);
            ll.Addlast(list2[i]);
            }
        }
        ll.PrintLL();
    }
}
