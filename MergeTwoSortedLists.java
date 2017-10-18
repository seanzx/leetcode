package leetcode;

public class MergeTwoSortedLists {
	 public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 ListNode l = new ListNode(0);
		 ListNode q = l; 
	     while(l1!= null && l2!= null){
	    	 if(l1.val <= l2.val){
	    		 l.next =  new ListNode(l1.val); 
	    		 l1 = l1.next;
	    	 }
	    	 else if(l1.val > l2.val){
	    		 l.next = new ListNode(l2.val); 
	    		 l2 = l2.next; 
	    	 }
	    	 l = l.next;
	     }
		 if(l2 != null)
			 l.next = l2;
		 else if(l1 != null)
			 l.next = l1;
	 return q.next;
	 }
	 public static void main(String[] args) {
		 ListNode l1 = null;
		 ListNode l2 = new ListNode(1);
		System.out.println(mergeTwoLists(l1, l2));
	}
}
