package leetcode;
import java.util.*;

public class ReshapetheMatrix {
	public static void main(String[] args) {
		int sum = 0;
		int[][] nums = {{1,2,3,4}}; 
		 
        int[][] b = new int[2][2];
        List<Integer> a=new ArrayList<Integer>();
        for(int row = 0;row<nums.length;row++){
            for(int cow = 0;cow<nums[row].length;cow++){
                sum++;
                a.add(nums[row][cow]);
            }        
       }
        Iterator<Integer> it = a.iterator();
        if(sum == 1*4){
             for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    b[i][j] = it.next();
                }
             }         
        }//不能直接打印二维数组。一维数组打印System.out.println(Arrays.toString(num[0]));
	}
}
