import java.util.Arrays;
import java.util.Comparator;

public class Sort {

	public static void main(String[] args) {
		Integer[] values = { 213, 16, 2058, 54, 10, 1965, 57, 9 };
		
		System.out.println(Arrays.toString(values));
		
		Arrays.sort(values, new Comparator<Integer>() {
			@Override
			public int compare(Integer value1, Integer value2) {
				return value2 - value1;
			}
		});

		System.out.println(Arrays.toString(values));
	}

}