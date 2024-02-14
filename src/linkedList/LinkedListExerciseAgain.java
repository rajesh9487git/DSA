package linkedList;

public class LinkedListExerciseAgain {

	public class Node {

		int val;
		Node next;

		public Node(int val) {

			this.val = val;
		}
	}

	static Node head;
	Node tail;

	public void addLinkedList(int val) {

		Node newNode = new Node(val);

		if (head == null) {

			head = newNode;
			tail = newNode;
		} else {

			tail.next = newNode;
			newNode.next = null;
			tail = newNode;

		}

	}

	public void printLinkedList(Node headNode) {

		Node current = headNode;

		while (current != null) {

			System.out.println(current.val);
			current = current.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListExerciseAgain l = new LinkedListExerciseAgain();
		l.addLinkedList(10);
		l.addLinkedList(30);
		l.addLinkedList(50);
		
		l.printLinkedList(head);
		

	}

}
