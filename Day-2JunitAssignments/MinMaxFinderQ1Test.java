package junit.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import Assignment.JUnit.MinMaxFinderQ1;

public class MinMaxFinderQ1Test {

	@Test
	public void test() {
		MinMaxFinderQ1 m=new MinMaxFinderQ1();
		int[] expected1=new int[] {34,39};
		int[] actual1=m.findMinMax(new int[] {34,35,36,37,38,39});
		assertArrayEquals(expected1,actual1,"1st value is minimum and the 2nd is maximum");
		int[] expected2=new int[] {-21,99};
		int[] actual2=m.findMinMax(new int[] {45,83,-21,34,99});
		assertArrayEquals(expected2,actual2,"1st value is minimum and the 2nd is maximum");
		int[] expected3=new int[] {0,9};
		int[] actual3=m.findMinMax(new int[] {9,4,3,0,5,7,2,1,1,3,4,6,4,7,8,2});
		assertArrayEquals(expected3,actual3,"1st value is minimum and the 2nd is maximum");
		
	
	}

}