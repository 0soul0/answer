package answer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class answer3 {
	public static void main(String[] args) {
		int [] arrays=null;
		///answer3
		nextFibonacci(arrays);
	}
	
	public static int[] nextFibonacci(int[] fib) {
		long time = System.currentTimeMillis();
		int i = 0;
		int[] nfib = new int[3];
		nfib[1] = 1;
		nfib[0] = 1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int j = 0; j < fib.length; j++) {
			map.put(fib[j], 0);
		}
		Arrays.sort(fib);
		while (fib.length > i) {
			nfib[2] = nfib[1] + nfib[0];
			if (nfib[2] > fib[i]) {
				map.put(fib[i], nfib[2]);
				i++;
			}
			nfib[0] = nfib[1];
			nfib[1] = nfib[2];
		}
		i = 0;
		int[] ary = new int[fib.length];
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> e : entrySet) {
			ary[i] = e.getValue();
			i++;
		}
		System.out.println(System.currentTimeMillis() - time);
		return ary;
	}

}
