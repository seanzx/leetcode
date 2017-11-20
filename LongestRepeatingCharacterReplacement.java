package leetcode;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k) {
        int[] al = new int[26];
        int[] previous = new int[s.length()];
        for(int i = 0; i < 26; i++){
        	al[i] = -1;
        }
        for(int i = 0; i < s.length(); i++){
        	previous[i] = al[s.charAt(i) - 'A'];
        	al[s.charAt(i) - 'A'] = i;
        }
        
        int max = 0;
       for(int i = 0; i < 26; i++){
        	for(int j = al[i]; j >= 0; j = previous[j]){
        		int x = j;
        		int temp = 0;
        		int m = 0;
        		int tempm = 0;
        		while(m <= k && previous[x] > -1){
        			tempm = m;
        			m += x - previous[x] - 1;
        			temp = x;
        			x = previous[x];
        		}
        		if(m > k)
        			max = Math.max(max,j - temp + 1 + Math.min(x+ s.length()-j-1, k - tempm ));
        		else{
        			max = Math.max(max,j - x + 1 + Math.min(x+ s.length()-j-1, k - m));
        			j = 0;
        		}
        	}
        }  
        return max; 
    }
    
    public static void main(String[] args) {
    	String s = "ABBB";
    			
    	int k = 2;
		System.out.println(characterReplacement(s, k));
	}
}
