package leetcode;
import java.util.*;
public class LoggerRateLimiter {
	Map<String, Integer> m= new HashMap<String, Integer>();
	
	public LoggerRateLimiter(){
	}
	
	public boolean shouldPrintMessage(int timestamp, String message) {
        if(m.containsKey(message)){
        	if(m.get(message) + 10 <= timestamp){
        		m.put(message, timestamp);
        		return true;
        	}
        	else return false;
        }else{
        	m.put(message, timestamp);
    		return true;
        }
    }
}
