public class IntList{
	private Node head;
	public IntList(){
		head = null;
	}

	public void addFirst(int n){
		head = new Node(n,head);
	}

	public int length(){
		int counter = 0;
		for(Node p = this.head; p != null; p = p.getNext()){
			counter++;
		}
		return counter;
	}


	public void addIfThereNot(int n){
		for(Node p = this.head; p!=null; p = p.getNext()){
			if(p.getValue() == n) return;
		}
		this.addFirst(n);
	}

	public void conc(IntList other){
		Node p;
		for(p = this.head; p.getNext()!=null; p = p.getNext());
		p.setNext(other.head);

	}

	public int listSum(){

		return listSumPrivate(this.head);
	}

	private int listSumPrivate(Node head){
		if (head == null) return 0;
		return head.getValue()+listSumPrivate(head.getNext());
	}

	public int whereIs(int n){
		int counter = 0;
		for(Node p = this.head; p!=null; p = p.getNext()){
			if(p.getValue() == n){
				return counter;
			}
			counter++;
		}
		return -1;
	}

	public void remove(int n){
		Node p;
		if(this.head.getValue() == n){
			this.head = this.head.getNext();
		}
		else{
			for(p = this.head; p.getNext()!=null && p.getNext().getValue()!=n ;p = p.getNext());
			if(p.getNext() == null && p.getValue() != n){
				return;
			}
			else if(p.getNext() == null && p.getValue() == n){
				p.setNext(null);
			}
			else{
				p.setNext(p.getNext().getNext());
			}
		}
	}

	public void reverse(){
		System.out.println(this.reverseHelp());
	}

	public IntList reverseHelp(){
		IntList list = new IntList();
		list.head = null;
		for(Node p = this.head; p!=null; p = p.getNext()){
			list.addFirst(p.getValue());
		}
		return list;
	}

	public int longestSame(){
		int counter = 1;
		int max = 1;
		for(Node p = this.head; p.getNext() !=null; p = p.getNext()){
			if(p.getValue() == p.getNext().getValue()){
				counter++;
			}
			else{
				if (counter > max){
					max = counter;
				}
			}
		}
		return counter;

	}

	public void selectionSort(){
		sortAscend(this.head);
		System.out.println(this);
	}

	public void sortAscend(Node head){
		if (head == null) return;
		int minElem = head.getValue();
		int temp = head.getValue();
		Node p;
		Node i;
		for(p = head; p != null; p = p.getNext()){
			if(p.getValue() < minElem){
				minElem = p.getValue();
			}
		}
		for(i = head; i != null; i = i.getNext()){
			if (i.getValue() == minElem){
				i.setValue(temp);
				break;
			}
		}
		head.setValue(minElem);
		sortAscend(head.getNext());
	}
	
	public String toString(){
		Node res = this.head;
		return res.toString();
	}
}