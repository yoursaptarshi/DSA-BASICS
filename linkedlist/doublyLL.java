package linkedlist;


public class doublyLL {
    doublyNode head;

    
    //function to insert in the doublyLL
    public void insert(int element){
        doublyNode newNode = new doublyNode(element);

        //check if head is null?, if yes, push new element in head;

        if(head == null){
            head = newNode;
            return;
        }
        doublyNode temp = head;
        
        while(temp.Next != null){
           
            temp = temp.Next;
        }
        //once reached the last node
        //attach the newNode
        temp.Next = newNode;
        newNode.Prev=temp;

    }

    public void display(){
        if(head == null){
            System.out.println("There is nothing to display");
            return;
        }
        doublyNode temp = head;
        while(temp!=null){
            System.out.print(temp.data);
            System.out.print("-->");
            temp = temp.Next;
        }
        System.out.println("null");
    }


    public void delete(int element){
        if(head == null){
            System.out.println("There is nothing to dlete ");
            return;
        }
        doublyNode temp = head;
        doublyNode prevNode = null;
        while(temp != null && temp.data != element){
            prevNode = temp;
            temp = temp.Next;
        }
        if(temp == null) return;

        prevNode.Next = temp.Next;
    }
    public static void main(String[] args) {
        doublyLL list = new doublyLL();
        list.insert(0);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.delete(4);
        list.display();
    }

}
class doublyNode{
    int data;
    doublyNode Prev;
    doublyNode Next;
    doublyNode(int data){
        this.data = data;
        Prev =null;
        Next =null;
    }
}

