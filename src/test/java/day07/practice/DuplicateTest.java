package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class DuplicateTest {
	@Test
	void test() {
	 ArrayList<Integer> numbers = new ArrayList<>();
     numbers.add(1);
     numbers.add(2);
     numbers.add(3);
     numbers.add(2); //
     numbers.add(4);
     numbers.add(1); //

     
     HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

     System.out.println("Unique values:");
     for (int num : uniqueNumbers) {
         System.out.println(num);
     }
 }
}