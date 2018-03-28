package exercises;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum=getNumber(l1)+getNumber(l2);
        System.out.println("Function addTwoNumbers sum: "+sum);
        String sumLen=((Integer)sum).toString();
        int len=sumLen.length();
        System.out.println("Function addTwoNumbers sum length: "+len);
        int x=sum%10;
        ListNode result=new ListNode(x);
        sum=sum-x;

        int val=0;
        int pow=2;
        for(int i=1; i<=len; i++){
            val=sum%(int)(Math.pow(10,pow));
            sum-=val;
            result.next=new ListNode(val%(int)(Math.pow(10,pow-1)));
            result=result.next;
            pow++;
        }
        return result;
    }

    public int getNumber(ListNode list){
        int sum=0;
        int pow=1;
        while(list.next!=null){
            sum+=list.val*pow;
            pow*=10;
            list=list.next;
        }
        System.out.println("Function getNumber result: "+sum);
        return sum;
    }

     public class ListNode {
        int val;
     ListNode next;
     ListNode(int x) {
         val = x; }
 }

 public static void main(String[] args){

 }
}
