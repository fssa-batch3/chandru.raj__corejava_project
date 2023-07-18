package cityNames;
//import java.util.ArrayList;
import java.util.HashSet;
public class ArrayList {
    public static void main(String[]args) {
    	ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
	    numbers.add(3);
		numbers.add(4);
		numbers.add(2);
	    numbers.add(8);
		numbers.add(3);
		
		
		HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);
		
		
		for (Integer number : uniqueNumbers) {
            System.out.println(number);
    }
}
