package day07.practice;
import java.time.LocalDate;
import java.util.Objects;

	
	public class Task {
	    private String name;
	    private LocalDate deadline;

	    public Task(String name, LocalDate deadline) {
	        this.name = name;
	        this.deadline = deadline;
	    }
	    
	    public Task(String string, int i, String string2) {
			// TODO Auto-generated constructor stub
		}

		public String getName() {
	        return name;
	    }

	    public LocalDate getDeadline() {
	        return deadline;
	    }
	    
	    
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Task other = (Task) obj;
	        return name.equals(other.name) && deadline.equals(other.deadline);
	    }
	    
	    @Override
	    public int hashCode() {
	        return Objects.hash(name, deadline);
	    }
	    
    
	}

