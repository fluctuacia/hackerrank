package ds.llists;

/**
 * Created by fluctuacia on 4/29/17.
 */
public class InsertNodeAtTail {

    Node Insert(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (head == null) {
            return newNode;
        }

        Node cursor = head;
        while (cursor.next != null) {
            cursor = cursor.next;
        }
        cursor.next = newNode;
        return head;
    }
}
