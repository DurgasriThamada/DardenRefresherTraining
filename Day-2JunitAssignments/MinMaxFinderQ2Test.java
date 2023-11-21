package junit.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MinMaxFinderQ2Test {

	@Test
	public void test() {
		MinMaxFinderQ2 mexpected1=new MinMaxFinderQ2(34,39);
		MinMaxFinderQ2 mactual1=MinMaxFinderQ2.findMinMax(new int[] {34,35,36,37,38,39});
		assertArrayEquals(new int[] {mexpected1.getMin(),mexpected1.getMax()},new int[] {mactual1.getMin(),mactual1.getMax()});
		MinMaxFinderQ2 mexpected2=new MinMaxFinderQ2(-21,99);
		MinMaxFinderQ2 mactual2=MinMaxFinderQ2.findMinMax(new int[] {45,83,-21,34,99});
		assertArrayEquals(new int[] {mexpected2.getMin(),mexpected2.getMax()},new int[] {mactual2.getMin(),mactual2.getMax()});
		MinMaxFinderQ2 mexpected3=new MinMaxFinderQ2(0,9);
		MinMaxFinderQ2 mactual3=MinMaxFinderQ2.findMinMax(new int[] {9,4,3,0,5,7,2,1,1,3,4,6,4,7,8,2});
		assertArrayEquals(new int[] {mexpected3.getMin(),mexpected3.getMax()},new int[] {mactual3.getMin(),mactual3.getMax()});
	}

}