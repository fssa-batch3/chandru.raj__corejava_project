package day06.practice;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Delhi");
		cityList.add("Hydrabad");
		cityList.add("Chennai");
		
		List<String> RCityList = new ArrayList<String>();
		
		for (String city : cityList) {
            if (!RCityList.contains(city)) {
                RCityList.add(city);
            }
        }
		
		
		for (String city : RCityList) {
            System.out.println(city);
        }
	}
}
			