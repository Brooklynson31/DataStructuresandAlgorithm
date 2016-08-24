package assignmentExercises;

public class DoubleLinkedList {
	private Node head;
	private Node tail;
	private Integer nodeCount;
	
	public DoubleLinkedList(){
		nodeCount = 0;
	}
	
public void addFirstNode(Integer data){
	Node newNode = new Node(data);
	
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
	Node newNode = new Node(data);
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
		Node iterator = tail;
		iterator = iterator.getPrev();
		iterator.setNext(null);
		tail = iterator;
	}
	nodeCount--;
}	

public void removeFirstNode()
{
	if(head == null){
		return;
	}
	else{
		Node newhead = head.getNext();
		newhead.setPrev(null);
		head = newhead;
	}
	nodeCount--;
}

public void add(int index, Integer data) {
	Node newNode = new Node(data);
	if(index == 0 || index > nodeCount)
		return;
	else if (index == nodeCount){
		addLastNode(data);
		return;
	}
	else if(index == 1){
		addFirstNode(data);
		return;
	}
	
	Node iterator = head;
	for(int i = 1; i < index-1; i++){
		iterator = iterator.getNext();
	}
	Node afterIterator = iterator.getNext();
	afterIterator.setPrev(newNode);
	newNode.setNext(afterIterator);
	iterator.setNext(newNode);
	newNode.setPrev(iterator);

	nodeCount++;
	
}


public void remove(int index){
	if(index == 0 ||index > nodeCount)
		return;
	else if (index == nodeCount){
		removeLastNode();
		return;
	}
	else if (index == 1){
		removeFirstNode();
		return;
	}
	
	Node iterator = head;
	for(int i = 1; i < index-1; i++){
		iterator = iterator.getNext();
		
		}
	Node afterDeleted = iterator.getNext().getNext();
	iterator.setNext(afterDeleted); 
	afterDeleted.setPrev(iterator); 									
	
	nodeCount--;
}

Boolean isPalindrome(DoubleLinkedList list){
	Node forwarditerator = this.head;
	Node backwarditerator = this.tail;
	boolean isPalindrome = true;
	int index = 0;
	if(nodeCount % 2 == 1 ){
		while(index != nodeCount/2 + 2){
		
			if(!forwarditerator.getData().equals(backwarditerator.getData())){
					isPalindrome = false;
					return isPalindrome;
			}
			forwarditerator = forwarditerator.getNext();
			backwarditerator = backwarditerator.getPrev();
		
			index++;
		}	
	
	}
	else{
		while(index != nodeCount/2 ){ // since you must go into loop in order to incrememt index(index +1 in condition)
			
			if(!forwarditerator.getData().equals(backwarditerator.getData())){
					isPalindrome = false;
					return isPalindrome;
			}
			forwarditerator = forwarditerator.getNext();
			backwarditerator = backwarditerator.getPrev();
		
			index++;
		}	
	
	}
		
		
		return isPalindrome;
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
