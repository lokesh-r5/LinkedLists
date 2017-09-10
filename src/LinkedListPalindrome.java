//2.6
class LinkedListPalindrome{
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			this.next=null;
		}
	}
	Node head;
	void addNode(int n){
		Node newNode= new Node(n);
		if(head==null){
			head=newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
	}
	
	void printList(Node printNode){
		if(printNode==null){
			System.out.println("List is emplty");
		}
		else{
			Node temp=printNode;
			while(temp!=null){
				System.out.print(temp.value+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]){
		LinkedListPalindrome list= new LinkedListPalindrome();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(2);
		list.addNode(1);
		list.printList(list.head);
		boolean result=list.palindrome(list.head);
		if(result)
			System.out.println("Yes, Palindrome");
		else
			System.out.println("No");
				
	}
}