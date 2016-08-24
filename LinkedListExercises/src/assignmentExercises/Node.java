package assignmentExercises;

public class Node {
	
	private Node next;
	private Node prev;
	private Integer data;
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node(Integer _data){
		next = null;
		prev = null;
		data = _data;
	}
	
	public Node(Integer _data, Node _next, Node _prev){
		this.data = _data;
		this.next = _next;
		this.prev = _prev;
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
	public void setData(Integer data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [" + data +"]";
	}



}
