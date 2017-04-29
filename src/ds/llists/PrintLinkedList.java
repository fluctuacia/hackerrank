package ds.llists;

/**
 * Created by fluctuacia on 4/24/17.
 */
public class PrintLinkedList {

    void Print(Node head) {
        if (head == null) {
            return;
        }

        Node cursor = head;
        while (cursor != null) {
            System.out.println(cursor.data);
            cursor = cursor.next;
        }
    }
}
