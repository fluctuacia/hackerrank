package ds.llists;

/**
 * Created by fluctuacia on 5/5/17.
 */
public class InsertNodeAtHead {

    Node Insert(Node head, int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;

        return newNode;
    }
}
