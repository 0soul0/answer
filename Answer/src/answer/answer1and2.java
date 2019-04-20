package answer;
import java.util.Arrays;
import java.util.List;

public class answer1and2 {

	public static void main(String[] args) {
		String[] ary = null; 
		String[] checkary = null;
		///answer1
		isSubset(ary,checkary);
		/*answer2
		 *O(1)*/
		
	}
	
	public static boolean isSubset(String[] ary, String[] checkary) {
		List<String> list = Arrays.asList(ary);
		if (list.containsAll(Arrays.asList(checkary))) {
			return true;
		}
		return false;
	}

}
