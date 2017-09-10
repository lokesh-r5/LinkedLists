import java.util.Random;
//Partition problem 2.4
class LinkedList{
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
	
	 Node partition(int n){
		Node firstHead= null;
		Node secondHead= null;
		Node second=null;
		Node first= null;
		if(head==null){
			System.out.println("List is emplty, Not possible for partition");
			return null;
		}
		else{
			Node current= head;
			while(current.next!=null){
				if(current.value<n){
					if(firstHead==null){
						firstHead=current;
						first= current;						
					}
					else{
						first.next=current;
						first=first.next;
					}
				}
				else{
					if(secondHead==null){
						secondHead=current;
						second=current;
					}
					else{
						second.next=current;
						second=second.next;
					}
				}
				current=current.next;
			}
			first.next=secondHead;
			second.next=null;
			return firstHead;
			
		}
	}
	public static void main(String args[]){
		LinkedList list= new LinkedList();
		Random rand= new Random();
		for(int i=0; i<20; i++){
			list.addNode(rand.nextInt(50));
		}
		list.printList(list.head);
		Node result= list.partition(20);
		list.printList(result);
	}
}