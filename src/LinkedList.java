
public class LinkedList {
	protected class Node{
		int data;
		Node next;
	}
	Node head = null;
	public void insertFirst(int data){
		Node node = new Node();
		node.data=data;
		if(head == null){
			head = node;
			node.next = null;
		}
		else{
			node.next=head;
			head = node;
		}
	}
	public void insertLast(int data){
		Node node = new Node();
		node.data=data;
		node.next =  null;
		if(head == null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp != null){
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	public void print(Node node){
		while(node!= null){
			System.out.print(node.data+"->");
			node = node.next;
		}
		System.out.println();
	}
}