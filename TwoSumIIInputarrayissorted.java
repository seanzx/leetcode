package leetcode;

import java.util.*;
public class TwoSumIIInputarrayissorted {
	public static int[] twoSum(int[] numbers, int target) {
        int[] x = new int[2];
        for(int i = 0, j = numbers.length-1 ; i < j;){
        	if(numbers[i]+numbers[j] == target){
        		x[0] = i+1;
        		x[1] = j+1;
        		return x;
        	}
        	else if(numbers[i]+numbers[j] > target){
        		j--;
        		i=0;
        	}
        	else if(numbers[i]+numbers[j] < target){
        		i++;
        	}
        }
        return x;
    }
	
	
	public static void main(String[] args) {
		int[] numbers = {1,9,11,101,100};
		int[] x =twoSum(numbers, 110);
		System.out.println(x[0]+" "+x[1]);
	}
}
