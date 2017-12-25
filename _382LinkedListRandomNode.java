package leetcode;
import java.util.*;
public class _382LinkedListRandomNode {
	Map<Integer, Integer> m = new HashMap<>();
	int i = 0;
	public _382LinkedListRandomNode(ListNode head) {
		
		ListNode q = head;
		while(q != null) {
			m.put(i++, q.val);
			q = q.next;
		}
		
	}
	public int getrandom() {
		Random x = new Random();
		return m.get(x.nextInt(i));
	}
}
