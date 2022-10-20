package LinkedList;

public class SinglyLinkedList<T> {
    private SinglyListNode head;

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(T value) {
        SinglyListNode node = new SinglyListNode(value, null);
        if (isEmpty()) {
            this.head = node;
        } else {
            node.setNext(this.head);
            this.head = node;

        }

    }

    public SinglyListNode search(T value) {
        SinglyListNode search;
        if (isEmpty()) {
            return null;
        } else {
            search = this.head;
            while (search != null) {
                if (search.equals(value)) {
                    return search;

                }
                search = search.getNext();

            }
            return null;
        }
    }

    public int size() {
        SinglyListNode current = this.head;
        int size = 0;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    public void addLast(T value) {
        SinglyListNode node = new SinglyListNode(value, null);
        if (this.isEmpty()) {
            this.head = node;
        } else {
            SinglyListNode pointer = this.head;
            while (pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(node);
        }
    }

    public void reverse() {
        if (isEmpty() || this.size() == 1) {
            return;
        }
        SinglyListNode previousNode = this.head;
        SinglyListNode curreNode = previousNode.getNext();
        this.head.setNext(null);
        while (curreNode != null) {
            this.head = curreNode.getNext();
            curreNode.setNext(previousNode);
            previousNode = curreNode;
            curreNode = this.head;

        }
        this.head = previousNode;

    }

    public void delete(SinglyListNode nodeDel) {
        if (this.isEmpty()) {
            return;
        }
        if (nodeDel == this.head) {
            this.head = nodeDel.getNext();
        }
        SinglyListNode previousNode = this.head;
        while (previousNode != null) {
            if (previousNode.getNext() == nodeDel) {
                previousNode.setNext(nodeDel.getNext());
                break;
            }
            previousNode = previousNode.getNext();
        }
    }

    public SinglyListNode getHead() {
        return this.head;
    }
}