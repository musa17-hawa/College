import java.util.*;

public class SortedSet <E extends Comparable<E>>{
	private ArrayList<E> elements;

	public SortedSet(){
		this.elements = new ArrayList<>();

	}
    public void addToSet(E element) throws ElementExistException {
        if (elements.isEmpty()) {
            elements.add(element);
            return;
        }

        int low = 0;
        int high = elements.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = elements.get(mid).compareTo(element);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                throw new ElementExistException("Element already exists in set.");
            }
        }

        elements.add(low, element);
    }

	public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int numOfElements() {
        return elements.size();
    }

    public SortedSet<E> union(SortedSet<E> s) {
        SortedSet<E> result = new SortedSet<>();
        int i = 0, j = 0;
        try{
            while (i < elements.size() && j < s.numOfElements()) {
                E e1 = elements.get(i);
                E e2 = s.elements.get(j);
                if (e1.compareTo(e2) < 0) {
                    result.addToSet(e1);
                    i++;
                } else if (e1.compareTo(e2) > 0) {
                    result.addToSet(e2);
                    j++;
                } else {
                    result.addToSet(e1);
                    i++;
                    j++;
                }
            }

            while (i < elements.size()) {
                result.addToSet(elements.get(i));
                i++;
            }
            while (j < s.numOfElements()) {
                result.addToSet(s.elements.get(j));
                j++;
            }
        }catch(ElementExistException e){
            System.err.println(e);
        }
        return result;

    }

    public SortedSet<E> union(ArrayList<SortedSet<E>> s) {
        SortedSet<E> result = new SortedSet<>();
        for (SortedSet<E> set : s) {
            result = result.union(set);
        }
        return result;
    }

    public SortedSet<E> minus(SortedSet<E> s) {
        SortedSet<E> result = new SortedSet<>();
        int i = 0, j = 0;
        try{
            while (i < elements.size() && j < s.numOfElements()) {
                E e1 = elements.get(i);
                E e2 = s.elements.get(j);
                if (e1.compareTo(e2) < 0) {
                    result.addToSet(e1);
                    i++;
                } else if (e1.compareTo(e2) > 0) {
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
            while (i < elements.size()) {
                result.addToSet(elements.get(i));
                i++;
            }
        }catch(ElementExistException e){
            System.err.println(e);
        }
        return result;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i));
            if (i != elements.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
