public class Tester{
	public static void main(String[] args) {
		IntList list = new IntList(); // head = Node = Null = (next,value !=)
		list.addFirst(5); // head = Node = 
		list.addFirst(10);
		list.addFirst(11);

		IntList list1 = new IntList(); // head = Node = Null = (next,value !=)
		list1.addFirst(1); // head = Node = 
		list1.addFirst(2);
		list1.addFirst(3);
		list1.addFirst(3);
		list1.addFirst(2);
		list1.addFirst(1);
		list1.addFirst(1);

		System.out.println("length : " + list.length());
		System.out.println("list = "+list);
		list.addIfThereNot(6);
		System.out.println("list = "+list);
		list.conc(list1);
		System.out.println("list = "+list);
		System.out.println("the sum of list is: "+list1.listSum());
		System.out.println("the number is in position: "+list.whereIs(6));
		list.remove(100);
		list1.remove(2);
		list1.remove(3);
		System.out.println("list = "+list);
		
		System.out.println("reversed list1 = \n"+list1.reverseHelp());
		list1.reverse();

		System.out.println("longestSame in list1 : "+list1.longestSame());
		
		list.selectionSort();
		System.out.println("length : " + list.length());



	}
}