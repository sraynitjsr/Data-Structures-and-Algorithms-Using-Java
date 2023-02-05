class MyLinkedListReverse {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void start()
	{
		MyLinkedListReverse list = new MyLinkedListReverse ();
		MyLinkedListReverse.head = new Node(10);
		MyLinkedListReverse.head.next = new Node(-20);
		MyLinkedListReverse.head.next.next = new Node(30);
		MyLinkedListReverse.head.next.next.next = new Node(40);
		MyLinkedListReverse.head.next.next.next.next = new Node(50);

		System.out.print("Given Linked List is\t => ");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.print("Reversed Linked List is  => ");
		list.printList(head);
	}
}
