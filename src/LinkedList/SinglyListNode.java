package LinkedList;

public class SinglyListNode <T>{
    private SinglyListNode next;
    private T value;

    public SinglyListNode(T value, SinglyListNode next) {
        this.value = value;
        this.next = next;
    }

    public SinglyListNode getNext() {
        return this.next;
    }

    public void setNext(SinglyListNode next) {
        this.next = next;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {

        if (object instanceof SinglyListNode) {
            SinglyListNode aNode = (SinglyListNode) object;
            return this.getValue().equals(aNode.getValue());
        }
        return false;
    }
}