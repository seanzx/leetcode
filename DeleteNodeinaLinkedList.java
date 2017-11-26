package leetcode;

public class DeleteNodeinaLinkedList {
	 public static void deleteNode(ListNode node) {
		 if(node == null)
			 return ;
		 ListNode p = node;
		 ListNode q = node.next;
	     while(q != null){
	    	 p.val = q.val;
	    	 q = q.next;
	    	 if(q != null)
	    		 p = p.next;
	    	 else
	    		 p.next = null;
	     }
	 }
	 
	 public static void main(String[] args) {
		ListNode p = new ListNode(0);
		p.next = new ListNode(1);
		deleteNode(p);
	}
}
