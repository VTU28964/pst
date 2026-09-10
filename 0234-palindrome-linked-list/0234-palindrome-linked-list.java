class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while(f!=null&&f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        ListNode sec = reverse(s);
        ListNode fir = head;
        while(sec!=null){
            if(fir.val != sec.val)
            return false;
            fir = fir.next;
            sec = sec.next;
            }
            return true;
        }
        ListNode reverse(ListNode head){
            ListNode prev = null;
            while(head!=null){
                ListNode  next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
        return prev;
    }
}