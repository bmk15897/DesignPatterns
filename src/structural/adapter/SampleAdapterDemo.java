package structural.adapter;

import java.util.Arrays;
import java.util.List;

public class SampleAdapterDemo {

	public static void main(String[] args) {
		Integer[] integersArray = new Integer[] {42,43,44};
		List<Integer> integersList = Arrays.asList(integersArray);
		System.out.println(integersArray);
		System.out.println(integersList);
	}

}
