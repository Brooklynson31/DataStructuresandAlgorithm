
public class LinkedL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	DLinkedList link = new DLinkedList();	
	link.addFirstNode(8);
	link.addFirstNode(4);
	link.addFirstNode(3);
	link.add(2, 7);
	System.out.println(link.size());
	System.out.println(link.toString());
	
	link.removeLastNode();
	link.removeLastNode();
	System.out.println(link.size()); 
	System.out.println(link.toString()); //not displaying correctly
	link.addLastNode(7);
	System.out.println(link.size());
	System.out.println(link.toString());
	link.remove(2);
	System.out.println(link.size());
	System.out.println(link.toString());
	
//	LinkedList 	ll = new LinkedList();
//	//ll.add(6);
////	ll.add(8);
//	ll.addtoFirst(9);
//	
//	ll.addtoFirst(5);
//	ll.addtoFirst(2);
//	ll.addtoFirst(7);
//	ll.add(6);
//	//ll.add(3);
//	System.out.println(ll.toString());
		
	}
}
