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


	public String toString(){
		Node res = this.head;
		return res.toString();
	}
}