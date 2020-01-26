public class Node{
	private int value;
	private Node next;

	public Node(int val, Node n){
		value = val;
		next = n;
	}

	public int getValue(){
		return value;
	}
	public Node getNext(){
		return next;
	}
	public void setValue(int value){
		this.value = value;
	}
	public void setNext(Node next){
		this.next = next;
	}

	public String toString(){
		String res = "";
		for(Node p = this; p != null; p=p.getNext()){
			res += p.getValue()+" ";
		}
		return res;
	}
}