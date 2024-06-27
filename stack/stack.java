public class stack{
    private int maxSize;
    private int top;
    private int[]stackArray;

    stack(int size){
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top=-1;
    }

    public void push(int element){
        if(top > maxSize-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stackArray[top] = element;
    }
    public void peek(){
        if(top==-1){
            System.out.println("No elements in stack");
            return;
        }
        System.out.println("The top element is: "+stackArray[top]);
    }
    public void display(){
        if(top==-1){
            System.out.println("No element to display");
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.println(stackArray[i]);
        }
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public  void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
         top--;
         

    }
    public static void main(String[] args) {
        stack st = new stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pop();
        st.push(14);
        st.peek();
        st.display();
    }
}