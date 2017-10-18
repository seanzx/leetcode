package leetcode;
import java.util.*;
public class LinkedListCycle {
	 public static boolean hasCycle(ListNode head) {
		 Set<ListNode> s= new HashSet<ListNode>();
		 ListNode q = head;
		 while(q != null && !s.contains(q)){
			 s.add(q);
			 q = q.next;
			
		 }
		 if(q == null)
			 return false;
		 else 
			 return true;
	 }
	 
	 public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		System.out.println(hasCycle(head));
	}
}
