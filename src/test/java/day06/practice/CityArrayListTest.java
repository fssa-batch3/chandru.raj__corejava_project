package day06.practice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CityArrayListTest {
	@Test
	void test() {
	
	        List<String> cityList = new ArrayList<String>();
	        cityList.add("Chennai");
	        cityList.add("Bangalore");
	        cityList.add("Bangalore");
	        cityList.add("Mumbai");
	        List<String> Cities = new ArrayList<String>();
	        for(String city : cityList) {
	        	if(Cities.contains(city)) {
	        		continue;
	        	}
	        	else {
	        		Cities.add(city);
	        	}
	        }
	        System.out.println("Unique cities: " + Cities);
	    }
}
