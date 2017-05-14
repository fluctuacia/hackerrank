package ds.llists;

/**
 * Created by fluctuacia on 5/14/17.
 */
public class DeleteNode {

    Node Delete(Node head, int position) {
        if (head == null) {
            return null;
        }

        if (position == 0) {
            return head.next;
        }

        int i = 0;
        Node cursor = head;
        while (i < position - 1 && cursor != null) {
            cursor = cursor.next;
            i++;
        }

        if (cursor != null && cursor.next != null) {
            cursor.next = cursor.next.next;
        }

        return head;
    }
}
