package leetcode;

import java.util.*;
public class KeyboardRow {
	public static void main(String[] args) {
		 Set<String> c = new HashSet<String>();
		 String s1=new String("hello");
		 String s2=s1;
		 String s3=new String("world");
		 c.add(s1);
		 c.add(s2);
		 c.add(s3); 
		 System.out.println(c.size());
		 Iterator<String> it = c.iterator();
		 System.out.println(it.next());
		 System.out.println(it.next()); 
		 
		 List<String> d =new ArrayList<String>();
		 d.add(s1);
		 d.add(s2);
		 d.add(s3);
		 for(int i=0; i<d.size();i++){
		 	System.out.println(d.get(i));
		 }
		 Iterator<String> it2 = d.iterator();
		 while(it2.hasNext()){
			 System.out.println(it2.next());
		 }
		 Map<String,String> e = new HashMap<String,String>();
		 e.put("California","Los Angeles");
		 e.put("JiangXi","Nanchang");
		 System.out.println(e.get("JiangXi"));
		 
	}
}
