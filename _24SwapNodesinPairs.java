package leetcode;
import java.util.*;
public class _24SwapNodesinPairs {
	public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
		while(curr.next != null && curr.next.next != null) {
			ListNode first = curr.next;
			ListNode second = curr.next.next; 
			first.next = second.next;
			curr.next = second;
			second.next = first;
			curr = curr.next.next;
		}
		
		return dummy.next;
    }
	
	public static void main(String[] args) {
		_24SwapNodesinPairs s = new _24SwapNodesinPairs();
		ListNode head= new ListNode(1);
		head.next = new ListNode(2);
		s.swapPairs(head);
	}
}
