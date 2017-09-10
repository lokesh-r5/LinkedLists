//2.8

class LoopDetection{
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
	
	public static Node loopDetection(Node list){
		Node slow=list;
		Node fast=list.next;
		while(slow!=fast && slow!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

	public static void main(String args[]){
		LoopDetection list= new LoopDetection();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5 );
		list.head.next.next.next.next.next=list.head.next.next.next;
		//list.printList(list.head);
		//
		Node result=loopDetection(list.head);
		if(result==null)
			System.out.println("Not a loop");
		else
			System.out.println("Node "+ result.value);
				
	}
}