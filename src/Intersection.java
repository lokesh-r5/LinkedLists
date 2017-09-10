//2.7
class Intersection{
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
	
	public static Node findIntersection(Node list1, Node list2){
		int length1=0, length2=0;
		Node li1=list1;
		Node li2= list2;
		while(list1!=null){
			list1=list1.next;
			length1++;
		}
		while(list2!=null){
			list2=list2.next;
			length2++;
		}
		int k;
		if(length1<length2)
			k=length2-length1;
		else if(length1>length2)
			k=length1-length2;
		else 
			k=0;
		if(length1<=length2){
			int count=0;
			while(count<k){
				li2=li2.next;
				count++;
			}
			while(li1!=null){
				if(li1==li2)
					return li1;
				li1=li1.next;
				li2=li2.next;
			}
		}
		else{
			int count=0;
			while(count<k && li1.next!=null){
				li1=li1.next;
				System.out.println(count);
				count++;

			}
			while(li1!=null){
				System.out.println("hg");
				System.out.println(li1.value);
				System.out.println(li2.value);
				if(li1.value==li2.value && li1.next==li2.next){
					System.out.println(li1.value);
					return li1;
				}
				li1=li1.next;
				li2=li2.next;
					
			}
		}
		
		
		return null;
		
	}

	public static void main(String args[]){
		Intersection list1= new Intersection();
		Intersection list2= new Intersection();
		list1.addNode(1);
		list1.addNode(2);
		list1.addNode(3);
		list1.addNode(2);
		list1.addNode(1);
		list2.head=list1.head.next.next;
		list1.printList(list1.head);
		list2.printList(list2.head);
		//
		Node result=findIntersection(list1.head, list2.head);
		if(result!=null)
			System.out.println("Yes "+result.value);
		else
			System.out.println("No");
				
	}
}