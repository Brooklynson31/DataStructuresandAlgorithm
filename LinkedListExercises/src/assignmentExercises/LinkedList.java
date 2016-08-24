package assignmentExercises;

public class LinkedList {
	
	private Node head;
	private Node tail;
	private Integer nodeCount;
	
	
	public LinkedList()
	{
		head = new Node(null);
		nodeCount= 0;
	}
	
	public void addfirstNode(Integer data){
		Node temp = new Node(data);
		if(nodeCount == 0){
			head = temp;
			tail = temp;
		}
		else {
			temp.setNext(head);
			head = temp;
		}
		nodeCount++;
	}
	



	public void addLastNode(Integer data){
		Node temp = new Node(data);
		if(tail == null)
			return;
		else{
			tail.setNext(temp);
			tail = temp;
		}
	
		nodeCount++;
	}
//add after specified index
	public boolean addatIndex(Integer index, Integer data) {
		boolean abletoAdd = false;
		Node newNode = new Node(data);
		if(index == 0 || index > nodeCount)
			return false;
			
			else if (index == 1){ //first index
			addfirstNode(data);
			abletoAdd = true;
			return abletoAdd;
			}
		
			else if (index == nodeCount){ //last index
			addLastNode(data);
			abletoAdd = true;
			return abletoAdd;
			}
		
		Node current = head;
		for(int i = 1; i < index-1; i++){
			current = current.getNext();
		}
		//tail is not changing
		
		newNode.setNext(current.getNext());
		current.setNext(newNode);
		nodeCount++;
		return false;
	}
	public void removefirstNode(){
		Node newhead = head.getNext();
		head = null;
		head = newhead;
		nodeCount--;
	}
	
	//removes at index except for head and tail
	public boolean removeNode(Integer index){
		boolean abletoRemove = false;
		Node current = head;
		if(index > nodeCount || index  == 0){
			return false;
		}
			else if (index == 1){ //first index
			removefirstNode();
			abletoRemove = true;
			return abletoRemove;
			}
			else if (index == nodeCount){ //last index
			removeLastNode();
			abletoRemove = true;
			return abletoRemove;
			}

		for(int i = 1;  i < index-1; i++ ){ //crawl through list
			current = current.getNext();
			}

			Node nodeAfterdeletedNode = current.getNext().getNext();
			current.setNext(nodeAfterdeletedNode);
			nodeCount--;
			abletoRemove = true;
			return abletoRemove;
	}

	
	public void removeLastNode(){
		
		
		Node current = head;
		while(current.getNext() != tail){
			current = current.getNext();
		}
		
		current.setNext(null);
		tail = current;
		

		nodeCount--;
	}	

public void removeDups(){
	
	Node firstiterator = head;

	for(int i = 1; firstiterator.getNext() != null ;i++){
		Integer temp = firstiterator.getData();
		Node seconditerator = firstiterator.getNext();
		for (int j = i+1; seconditerator.getNext() != null ;){
	
			
			if(temp == seconditerator.getData()){
				removeNode(j);
			}
			seconditerator = seconditerator.getNext();
			
		}
		firstiterator = firstiterator.getNext();
	}
}

public Node returnkelement(Integer distancefromTail){
	Node current = head;
	int index = 1;
	if(distancefromTail > nodeCount)
		return null;
	else if(distancefromTail == 0)
		return tail;
	
	while (nodeCount - index != distancefromTail){
		current = current.getNext();
		index++;
	}
	return current;
}




	@Override
	public String toString(){
		String output ="";
		Node it = head;
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
///remove node
//if(head == null){
//return;}
//else{
////Node iterator = tail;
//iterator = iterator.getPrev();
//iterator.setNext(tail.getNext());
//iterator.setPrev(tail.getPrev());
//tail = iterator;
//}

//remove last node
//else if (current.getNext() == tail){
////tail = current;
////tail.setNext(null);
//removeLastNode();
//abletoRemove = true;
//return abletoRemove;
//}

//set node after deleted node
//if(current.getNext() != tail || current.getNext().getNext() != null){
//if(current.getNext().getNext() != tail || current.getNext().getNext() != null){
//Node nodeAfterdeletedNode = current.getNext().getNext();
//current.setNext(nodeAfterdeletedNode);
//nodeCount--;
//abletoRemove = true;
//return abletoRemove;
//}

//crawl list
//for(int i = 1; current.getNext() != tail && i < index; i++ ){
//
//current = current.getNext();
//
//}
//deletes node after index

