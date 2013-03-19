import AssocArray.*;

public class AssocArrayMain {
	public static void main(String[] args) {
		AssocArray<Integer> as = new AssocArray<Integer>();

		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			as.add("arg" + i, i);
		}

		long firstTime = System.currentTimeMillis() - start;

		System.out.println(firstTime);
		
	}
}