
public class Node {
	private Node next; //references next node or null if you are at tail of list and there isnt one
	
	private Integer data; // contains data that each node containts

	public Node(int _data){ //contructor that points to next node in list starting at the head and crawling to the tail and null
		next = null;
		data = _data;
	}
	
	public Node(int _data, Node _next){ //contrustor that allows you to choose which node in list you want to point to next
		this.data =_data;				//typically something that might be seen in doubly linked list
		this.next = null;

	}

	public Node(Object object) {
		next = null;
		object = data;
		// TODO Auto-generated constructor stub
	}

	public Node() {

	next = null;
		
		// TODO Auto-generated constructor stub
	}


	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

//	@Override
//	public String toString() {
//		//return  "current node = " + this.data;
//		return "current node = " + this.data + ", " + "next node = " + this.next;
//	}
	
}
