
public class LinkedList {
	//reference to the head node (first node in list
	private Node head;
	private int listCount;
	
	//Linked Lsit constructor
	public LinkedList(){
	//since list empty reference to head node is intially assigned as new node with no data
	 head = new Node(null);
	 //head = new Node();
		listCount = 0;
	
	}
	
	public void add(int data){
		//adds element to the end of the list
	Node temp = new Node(data);
	Node current = head;
	//start at head node and crawl to end of the list(until you get null value which is the final element)
	while (current.getNext().getData() != null){
		//current.getnext
		current = current.getNext();
	}
	//last nodes next referece set to our new node
	current.setNext(temp); //while loop stops when next is null after current, and then sets a new Node between current and null
	listCount++;
	
	}
	
	public void addtoFirst(int data){
		Node newhead = new Node(data);
	
	
		newhead.setNext(head);
		head = newhead;
		
			listCount++;
		
		
	}
	
	public void add(int data, int index){
		//overloaded method that allows to add Node at specififed index
		Node temp = new Node(data);
		Node current = head;
		//linked list are not 0 based indexing
		for(int i=1; i < index && current.getNext() != null; i++ ){
		//crawl until specificed index or until last element in the list, whichever comes first
			current = current.getNext();
		}
		//set new node's next node reference to this nodes next node reference
		temp.setNext(current.getNext());
		//now set this nodes next node reference tto the new node
		current.setNext(temp);
		listCount++;
		}
	public Integer get(int index)
	////returns the element at the specified position in this list
	{
		//if index is at 0 automatically return null since linked list are 1 based indexed system
		if (index <= 0)
			return null;
		//start at top
		Node current = head.getNext();
		
		for(int i =1; i < index;i++){
			//if index points to the null value at end of list or there is a null value in list
			//return null
			if(current.getNext() == null)
				return null;
			current = current.getNext();
		}
		
		return current.getData();
			
	}
	
	public boolean remove(int index){
		//reomves the element at the specififed position in this list
		//if(index is out of range, exit
		
		//cant remove from 0 or an index that is greater then the size
		if(index < 1 || index > size())
			return false;
		
		Node current = head;
		for(int i = 1; i < index; i++){
			if(current.getNext() == null)
				return false;
			//if you run into null value then you were unable to remove
			current = current.getNext();
		}
		
		current.setNext(current.getNext().getNext());
		//override the node after the index and set that node to the node that is
		//two away from current
		listCount--;
		return true;
		
	}
	public String toString(){
		//rewrite for add to front
		//Node current = head.getNext();
		Node current = head;
		String output = "";
		while(current.getData() != null){
			//while(current != null
			output += "[" + current.getData().toString() + "]";
			if(current.getNext() == null){
			break;}
			else{
				current = current.getNext();
			}
		}
		return output;
	}
	
	public int size(){
		return listCount;
	}
	
//old toString()
//	Node current = head.getNext();
//			String output = "";
//		while (current != null)
//		{
//			output += "[" + current.getData().toString() + "]";
//			current = current.getNext();
//			
//		}
//		return output;
}
