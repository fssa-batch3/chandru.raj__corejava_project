package day06.solved;

public class StringArray {
	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[4];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";
		cityArr[3] = "Delhi";

		

		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}
	}

}
