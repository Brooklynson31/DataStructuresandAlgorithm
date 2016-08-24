
public class DLinkedList {
	private DNode head;
	private DNode tail;
	private Integer nodeCount;
	
	public DLinkedList(){
		nodeCount = 0;
	}
	
public void addFirstNode(Integer data){
	DNode newNode = new DNode(data);
	
	if(head == null){
		head = newNode;
		tail = newNode;
	}
	else{
		head.setPrev(newNode);
		newNode.setNext(head);
		head = newNode;
	}
	nodeCount++;
}


public void addLastNode(Integer data){
	DNode newNode = new DNode(data);
	if(tail == null)
		return;
	else{
		tail.setNext(newNode); //could also set previous
		newNode.setPrev(tail);
		tail = newNode;
		}
	nodeCount++;
}

public void removeLastNode(){
	
	if(tail == null){
		return;}
	else{
		DNode iterator = tail;
		iterator = iterator.getPrev();
		iterator.setNext(tail.getNext());
		iterator.setPrev(tail.getPrev());
		tail = iterator;
	}
	nodeCount--;
}	


public void add(int index, Integer data) {
	DNode newNode = new DNode(data);
	if(index == 0 || index > nodeCount)
		return;
	
	DNode it = head;
	for(int i = 1; i < index && it.getNext() != null; i++){
		it = it.getNext();
	}
	//tail is not changing
	newNode.setNext(it.getNext());
	newNode.setPrev(it);
	it.setNext(newNode);
	//if(newNode.getNext() == null)
	//	tail = newNode;
	nodeCount++;
	
}


public void remove(int index){
	if(index == 0 ||index > nodeCount)
		return;
	
	DNode it = head;
	for(int i = 1; i < index && it.getNext() != null; i++){
		it = it.getNext();
		
		}
	//DNode temp = it.getNext().getNext();
	it.setNext(it.getNext().getNext()); //set to node after node looking to get removed
	it = it.getNext(); // move to new node being pointed at
	it.setPrev(it.getPrev()); //make sure node points to index
	nodeCount--;
}

@Override
public String toString(){
	String output ="";
	DNode it = head;
	while(it != null){
		output += "("  + it.getData().toString() + ")";
		it = it.getNext();
	}
	return output;
}
 


public int size(){
	return nodeCount;
}

}
