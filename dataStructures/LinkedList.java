package dataStructures;

public class LinkedList {
Node head;
	
	static class Node{
		int value;
		Node next;
		
		 Node(int d) {
			value = d;
			next = null;
		}
	}
	
	public void printList() {
		Node next = head;
		while(next!=null) {
			System.out.println(next.value);
			next = next.next;
		}
	}
	
	public void deleteNode(int key) {
		Node next = head;
		while(next.next.value!=key) {
			next = next.next;
		}
		next.next = next.next.next;
	}
	
	// Add new node at the beginning (head) of the LL
	public void push(int d) {
		Node newHead=new Node(d);
		newHead.next = head;
		head = newHead;
	}
	
	// Add a new node after the particular node
	public void insertAfter(Node n, int d) {
		Node i = head;
		Node newNode = new Node(d);
		while(i.value!=n.value) {
			i = i.next;
		}
		newNode.next = i.next;
		i.next = newNode;
	}
	
	//Add a new node at the end of the LL 
	public void append(int d) {
		Node newNode = new Node(d);
		Node i = head;
		while(i.next!=null) {
			i=i.next;
		}
		i.next = newNode;
	}
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		l.head.next = second;
		second.next = third;
		l.printList();
/*		l.push(0);
		l.printList();
		System.out.println("testing insert after");
		l.insertAfter(second, 55);
		l.printList();
		System.out.println("testing insert at the end");
		l.append(100);
		l.printList();
		System.out.println("testing deletion");
		l.deleteNode(3);
		l.printList();
		l.deleteNode(2);
		l.printList();*/
	}

}
