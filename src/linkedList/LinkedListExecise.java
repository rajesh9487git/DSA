package linkedList;

public class LinkedListExecise {

	// check if there is a node with value 6

	public class Node1 {

		int val;
		Node1 next;

		public Node1(int val) {

			this.val = val;
		}

	}

	static Node1 head;
	Node1 tail;

	public void addLinkedList(int val) {

		Node1 newNode = new Node1(val);

		if (head == null) {

			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}

	}

	public boolean checkExistenceOfGiveValue(Node1 headNode, int gv) {

		Node1 current = headNode;

		while (current != null) {

			if (current.val == gv) {

				return true;

			}

			current = current.next;

		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListExecise l = new LinkedListExecise();

		l.addLinkedList(4);
		l.addLinkedList(3);
		l.addLinkedList(6);
		l.addLinkedList(1);

		Boolean res = l.checkExistenceOfGiveValue(head, 6);
		System.out.println(res);

	}

}
