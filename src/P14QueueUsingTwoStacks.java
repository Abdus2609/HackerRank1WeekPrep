import java.util.*;

public class P14QueueUsingTwoStacks {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        MyQueue<Integer> queue = new MyQueue<>();

        int numQueries = scanner.nextInt();

        for (int i = 0; i < numQueries; i++) {
            int instructionType = scanner.nextInt();
            
            switch (instructionType) {
                case 1 -> {
                    int item = scanner.nextInt();
                    queue.enqueue(item);
                }
                case 2 -> {
                    queue.dequeue();
                }
                case 3 -> {
                    System.out.println(queue.peek());
                }
            }

        }
        
        scanner.close();
    }
    
}

class MyQueue<T> {

    Stack<T> leftStack;
    Stack<T> rightStack;

    MyQueue() {
        this.leftStack = new Stack<>();
        this.rightStack = new Stack<>();
    }

    void checkIfRightEmpty() {
        if (this.rightStack.isEmpty()) {
            while (!leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }
        }
    }

    void enqueue(T item) {
        leftStack.push(item);
    }

    T dequeue() {
        checkIfRightEmpty();
        return rightStack.pop();
    }

    T peek() {
        checkIfRightEmpty();
        return rightStack.peek();
    }
}
