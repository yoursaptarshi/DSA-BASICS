package linkedlist;


public class singlyLL {
    Node head;
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void delete(int element){
        Node temp = head;
        Node prev = null;
        //if the element is present in the heaad
        if(temp != null && temp.data == element){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != element ){
            prev = temp;
            temp = temp.next;
        }
        //if no element is found
        if(temp == null)
        {
            return;
        }
        //if element is found, unlink the element
        prev.next = temp.next;
    }

    public void display(){
        if(head == null){
            System.out.println("There is no element in the link list");
        }
        else{
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data);
                System.out.print("-->");
                temp=temp.next;
            }
            System.out.print("null");
        }
    }

    public static void main(String[] args) {
        singlyLL list = new singlyLL();
        list.insert(5);
        list.insert(19);
        list.insert(24);
        list.insert(47);
        list.delete(47);
        list.display();
    }
}


class Node{
    int data;
    Node next;

    Node(int data){
        this.data =data;
        this.next =null;
    }
}