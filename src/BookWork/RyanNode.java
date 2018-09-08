package BookWork;

public class RyanNode<K extends RyanData> {

    private K data;
    private RyanNode previous;
    private RyanNode next;

    public RyanNode(K data) {
        this.data = data;
    }

    public void setData(K data) {
        this.data = data;
    }

    public K getData() {
        return this.data;
    }

    public RyanNode getPrevious() {
        return previous;
    }

    public void setPrevious(RyanNode previous) {
        this.previous = previous;
    }

    public RyanNode getNext() {
        return next;
    }

    public void setNext(RyanNode next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }

    public boolean hasPervious() {
        return previous != null;
    }

    public boolean contains(String key) {
        return data.isLike(key);
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
