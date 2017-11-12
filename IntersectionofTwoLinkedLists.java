package leetcode;
import java.util.*;
public class IntersectionofTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> s = new HashSet<ListNode>();
		while(headA != null){
			s.add(headA);
			headA = headA.next;
		}
		while(headB != null){
			if(s.contains(headB))
				return headB;
			headB = headB.next;
		}
		return null;
    }
}
