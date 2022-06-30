package Tasks2;

public class CustomLinkedList<T> {
    int size = 0;
    Node<T> first;
    Node<T> last;

    public CustomLinkedList() {
    }

    public void add(T item) {
        Node<T> lastElement = last;
        Node<T> newElement = new Node<>(item, null, lastElement);
        last = newElement;
        if (lastElement == null) {
            first = newElement;
        } else {
            lastElement.next = newElement;
        }
        ++size;
    }

    public Node<T> get(int index) {
        Node<T> tmp = first;
        if (index < 0 || index >= size) {
            return null;
        }
        for (int i = 0; i < index; ++i) {
            tmp = tmp.next;
        }
        return tmp;
    }

    private static class Node<T> {
        T item;
        Node<T> next;
        Node<T> prev;

        public Node(T item, Node<T> next, Node<T> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return item.toString();
        }
    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(list.get(2));
    }
}
