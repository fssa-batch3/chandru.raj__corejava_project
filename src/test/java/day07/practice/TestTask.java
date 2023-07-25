package day07.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

public class TestTask {
	 @Test
	    public void testEqualsAndHashCode() {
	        // Given
	        Task task1 = new Task("Todo", 1, "2023-07-22");
	        Task task2 = new Task("Todo", 1, "2023-07-22");
	        Task task3 = new Task("Sleep", 2, "2015-06-05");
	        Task task4 = new Task("Drink", 3, "2033-09-30");

	        // When
	        // Test equals() method
	        boolean task1EqualsTask2 = task1.equals(task2);
	        boolean task1EqualsTask3 = task1.equals(task3);

	        // Test hashCode() method
	        int task1HashCode = task1.hashCode();
	        int task2HashCode = task2.hashCode();
	       // int task2HashCode = task3.hashCode();
	        
	        // Then
	        // Check if task1 is equal to task2 and task1 is not equal to task3
	        Assertions.assertTrue(task1EqualsTask2);
	        Assertions.assertFalse(task1EqualsTask3);

	        // Check if the hash codes of task1 and task2 are the same since they are equal
	        Assertions.assertEquals(task1HashCode, task2HashCode);
	    }
}
