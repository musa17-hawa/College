import java.util.*;

public class PrimesDiscoverer {
    public static SortedSet<Integer> sieve(int n){
        boolean[] isComposite = new boolean[n+1];

        // fill the array with true
        for (int i = 0; i <= n; i++)
            isComposite[i] = true;

        for (int i = 2; i <= n; i ++) {
            if (isComposite[i])
                for (int j = i + i; j <= n; j += i)
                    isComposite[j] = false;
        }

        SortedSet<Integer> primes = new SortedSet<>();
        for (int i = 2; i <= n; i++)
            if (isComposite[i])
                try {
                    primes.addToSet(i);
                }catch (ElementExistException ignored){}

        return primes;
    }
}