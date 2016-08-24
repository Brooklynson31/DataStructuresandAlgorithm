package assignmentExercises;

public class Run {

	public static void main(String[] args) {
		// 2.3 Delete Middle Node
	//	LinkedList test = new LinkedList();
//		test.addfirstNode(9);
//		test.addfirstNode(7);
//		test.addfirstNode(5);
//		test.addfirstNode(3);
//		test.addfirstNode(1);
//		System.out.println(test.toString());
//		test.removeNode(3);//removes at desired index
//		test.addatIndex(3, 6);
//		System.out.println(test.toString());
		
		//2.1 Remove Dups
//		test.addfirstNode(3);
//		test.addfirstNode(3);
//		test.addfirstNode(3);
//		test.addfirstNode(3);
//		test.addfirstNode(4);
//		test.addfirstNode(4);
//		test.addfirstNode(4);
//		test.addfirstNode(8);
//		test.addfirstNode(8);
//		test.addfirstNode(8);
//		System.out.println(test.toString());
//		test.removeDups();
//		System.out.println(test.toString());

//		test.addfirstNode(1);
//		test.addfirstNode(3);
//		test.addfirstNode(5);
//		test.addfirstNode(7);
//		test.addfirstNode(9);
//		
//		System.out.println(test.toString());
//		System.out.println(test.returnkelement(0));

		
DoubleLinkedList list = new DoubleLinkedList();
list.addFirstNode(7);
list.addLastNode(1);
list.addLastNode(5);
list.addLastNode(2);
list.addLastNode(7);

boolean result = list.isPalindrome(list);
System.out.println(result);
	}

}
