package ds.llists;

/**
 * Created by fluctuacia on 5/5/17.
 */
public class InsertNodeAtNth {

    static Node InsertNth(Node head, int data, int position) {
        Node newNode = new Node();
        newNode.data = data;

        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        Node prev = null;
        Node cursor = head;
        int i = 0;
        while (cursor != null && i < position) {
            prev = cursor;
            cursor = cursor.next;
            i++;
        }

        if (prev != null) {
            prev.next = newNode;
        }
        newNode.next = cursor;

        return head;
    }

    public static void main(String[] args) {
        Node head = InsertNth(null, 3, 0);
        head = InsertNth(head, 5, 1);
        head = InsertNth(head, 4, 2);
        head = InsertNth(head, 2, 3);
        head = InsertNth(head, 10, 1);
        System.out.println();
    }
}
