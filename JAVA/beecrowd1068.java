import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()) {
            String[] line = scanner.nextLine().split("");

            StackDynamicList stack = new StackDynamicList();

            for (String character : line) {
                if (character.equals("(")) {
                    stack.push(character);
                } else if (character.equals(")")) {
                    if (stack.isEmpty()) {
                        stack.push(character);
                        break;
                    }
                    stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }

    }
}

class Node {
    private Object value;

    private Node next;

    private Node previous;

    public Node(Object value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public boolean hasNext() {
        return next != null;
    }

    public boolean hasPrevious() {
        return previous != null;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Object getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

class StackDynamicList {
    private Node last;

    private int size;

    public StackDynamicList() {
        last = null;
    }

    public void clear() {
        last = null;
    }

    public boolean contains(Object o) {
        Node aux = last;

        while (aux != null) {
            if (aux.getValue().equals(o)) {
                return true;
            }
            aux = aux.getNext();
        }

        return false;
    }

    public void push(Object o) {
        Node newNode = new Node(o);

        size++;

        if (last == null) {
            last = newNode;
            return;
        }

        newNode.setPrevious(last);
        last.setNext(newNode);
        last = newNode;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("Empty list");
        }

        Object response = peek();
        last = last.getPrevious();
        size--;

        return response;
    }

    public boolean isEmpty() {
        return last == null;
    }

    public Object peek() {
        return last.getValue();
    }

    public String toString() {
        Node aux = last;
        ArrayList<String> list = new ArrayList<>();

        while (aux != null) {
            list.add(aux.getValue().toString());
            aux = aux.getPrevious();
        }

        //reverse list
        StringBuilder response = new StringBuilder("[");
        for (int i = list.size() - 1; i >= 0; i--) {
            response.append(list.get(i));
            if (i > 0) {
                response.append(", ");
            }
        }
        response.append("]");

        return response.toString();
    }
}