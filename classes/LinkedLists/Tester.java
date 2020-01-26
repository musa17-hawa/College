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

		System.out.println("length : " + list.length());
		System.out.println("list = "+list);
		list.addIfThereNot(6);
		System.out.println("list = "+list);
		list.conc(list1);
		System.out.println("list = "+list);


	}
}