public class Stack {

    public int[] data;
    private int size;
    private int current = 0;

    public Stack(int size){
        if(size > 0){
            this.size = size;
            data = new int[size];
        }
    }

    public boolean isEmpty(){
        if(current == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if(current == size){
            return true;
        } else {
            return false;
        }
    }

    public void push(int input){
        if(this.isFull()){
            System.out.println("The stack is full!");
        } else {
            data[current] = input;
            current++;
        }
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        } else {
            int temp = data[current-1];
            current--;
            return temp;
        }
    }

    public void printStack(){
        for(int i = 0; i < current; i++){
            System.out.print(data[i] + ", ");
        }
        System.out.println();
    }
}
