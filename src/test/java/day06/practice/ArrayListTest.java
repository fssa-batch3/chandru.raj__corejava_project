package day06.practice;

public class ArrayListTest {
	import day06.practice.*;

	import java.util.ArrayList;

	import org.junit.jupiter.api.Test;

	public class ArrayListTest {
		
		@Test
	void test() {
			
			Tasklist t1 = new Tasklist(null, 0);
			Tasklist t2 = new Tasklist("Run 5 kms",2);
			Tasklist t3 = new Tasklist("Drink Water",3);
			Tasklist t4 = new Tasklist("Eat Breakfast",4);
			Tasklist t5 = new Tasklist("Go to Sleep",5);
			
			String task1 = t1.gettaskName() + " " + t1.getTaskPriority() + "\n";
			String task2 = t2.gettaskName() + " " + t2.getTaskPriority() + "\n";
			String task3 = t3.gettaskName() + " " + t3.getTaskPriority() + "\n";
			String task4 = t4.gettaskName() + " " + t4.getTaskPriority() + "\n";
			String task5 = t5.gettaskName() + " " + t5.getTaskPriority() + "\n";
			
			ArrayList<String> array = new ArrayList<>();
			
			array.add(task1);
			array.add(task2);
			array.add(task3);
			array.add(task4);
			array.add(task5);
			
			System.out.println(array.toString().replaceAll("\\[|\\]", "").replaceAll(", ", ""));
			
		}

	}
}
