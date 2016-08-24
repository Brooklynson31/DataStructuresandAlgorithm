
public class DNode {
	private DNode next;
	private DNode prev;
	private Integer data;
	
	public DNode(Integer _data){
		next = null;
		prev = null;
		data = _data;
	}
	
	public DNode(Integer _data, DNode _next, DNode _prev){
		this.data = _data;
		this.next = null;
		this.prev = null;
		
	}
	
	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

}
