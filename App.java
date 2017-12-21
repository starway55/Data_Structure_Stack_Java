public class App {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(7);
        stack.push(5);
        stack.printStack();

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.printStack();
    }
}
