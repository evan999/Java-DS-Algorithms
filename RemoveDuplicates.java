public static Node removeDuplicates(Node head) {
      //Write your code here
      //input: head. output: head
      //if head is null, return head
      //preserve the head.
      //Node trav1 = head;
      //Node trav2 = head.next;
      //while trav2 is not equal to null;
        //compare trav1 and trav2
            //if they are different, 1) make trav1 equal to trav2 (trav1 = trav2) and 2) move trav2 to next node (trav2 = trav2.next), 3) trav1.next = trav2?
            //if they are the same, 
            //   move trav2 to next node.trav2 = trav2.next
            //   trav1 stays where it is
      // trav1.next = null
        if (head == null) {
            return head;
        }
        Node trav1 = head;
        Node trav2 = head.next;
        while(trav2 != null) {
            if (trav1.data != trav2.data) {
                trav1.next = trav2;
                trav1 = trav2;
                trav2 = trav2.next;
                //continue;
            }
            else {
                trav2 = trav2.next;
            }    
        }
        trav1.next = null;
        return head;
    }