class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}

class Solution
{
    // A Function to check whether the linked list is a palindrome.
    boolean isPalindrome(Node head) 
    {
        Node current = head;
        boolean flag = true;
        Stack<Integer> st = new Stack<Integer>();
        while(current != null) {
            st.push(current.data);
            current = current.next;
        }
        while(head != null) {
           int currentData = st.pop();
           if(head.data == currentData) {
               flag = true;
           }
           else {
               flag = false;
               break;
           }
           head = head.next;
        }
        return flag;
    }    
}
