import java.util.ArrayList;
import java.util.List;

public class AvgListIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l+"\n");
		int sum = 0;
		int avg = 0;
		for (Integer i : l) {
			sum = sum + i;
			avg = sum/l.size();
		}
		System.out.println("The Sum of List is: "+sum+"\n");
		System.out.println("The Average of list of Integer is: "+avg);

	}

}
