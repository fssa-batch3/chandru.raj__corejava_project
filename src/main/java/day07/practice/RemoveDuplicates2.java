package day07.practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
public class RemoveDuplicates2 {
	public static void main(String[] args) {
		
		
		ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", LocalDate.of(2023, 7, 18)));
        tasks.add(new Task("Task 2", LocalDate.of(2023, 7, 19)));
        tasks.add(new Task("Task 1", LocalDate.of(2023, 7, 18))); 
        tasks.add(new Task("Task 3", LocalDate.of(2023, 7, 20)));
        tasks.add(new Task("Task 2", LocalDate.of(2023, 7, 19)));
        tasks.add(new Task("Task 3", LocalDate.of(2023, 7, 20)));
        
        HashSet<Task> uniqueTasks = new HashSet<>(tasks);
        
        
        for (Task task : uniqueTasks) {
            System.out.println("Task: " + task.getName() + ", Deadline: " + task.getDeadline());
        }
}
}
	