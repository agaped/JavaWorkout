package linkedlist;

/**
 * Created by agaped on 10.03.2018.
 */
public class ListNode<E> {
    ListNode<E> prev;
    ListNode<E> next;
    E data;

    public ListNode(E data) {
        this.data = data;
    }
}
