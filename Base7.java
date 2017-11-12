package leetcode;

public class Base7 {
	public static void main(String[] args) {
	int num = -10000000;
	System.out.println(Integer.toString((Integer.parseInt(num+"",10)), 7));
	}
}
