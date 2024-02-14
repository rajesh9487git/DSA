package linkedList;

public class LinkedListExercises {

	public class Node {

		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	static Node head;
	Node tail;

	public void addNodeAtEnd(int val) {

		Node newNode = new Node(val);

		if (head == null) {

			head = newNode;
			tail= newNode;
		} else {

			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}

	}
	
	public void printLinkList(Node headNode) {
		
		Node current= headNode;
		
		while(current!=null) {
		System.out.println(current.val);
		current=current.next;
		
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListExercises l = new LinkedListExercises();
		l.addNodeAtEnd(10);
		l.addNodeAtEnd(20);
		l.addNodeAtEnd(30);
		l.addNodeAtEnd(40);
		
		l.printLinkList(head);

	}

}
