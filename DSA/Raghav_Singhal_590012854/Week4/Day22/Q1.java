class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class Q1 
{
    public static void main(String[] args) 
    {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println(findMiddle(head).val);
    }
    public static ListNode findMiddle(ListNode head) 
    {
        if(head==null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
