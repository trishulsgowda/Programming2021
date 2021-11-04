package datastructure;

public class List {
	
	Node head=null;

	public static void main(String[] args) {
		List list = new List();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.print();
	}
	
	
	private void print() {
		Node cur = this.head;
		System.out.print("[");
		StringBuilder sb = new StringBuilder();
		while(cur != null){
			sb = sb.length()>0 ? sb.append(",").append(cur.data): sb.append(cur.data);
			cur = cur.next;
		}
		System.out.print(sb.toString());
		System.out.print("]");
	}


	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public Node add(int data){
		Node newNode = new Node(data);
		if(this.head == null){
			this.head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return this.head;
	}
}
