public class ReturnKthtoLast{
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
			this.next=null;
		}
	}
	static Node head;
	public static void add(ReturnKthtoLast list, int value){
		Node newNode= new Node(value);
		if(head==null){
			head= newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=newNode;
		}
		
	}
	public static void main(String atgs[]){
		ReturnKthtoLast list= new ReturnKthtoLast();
		for(int i=1; i<10; i++){
			ReturnKthtoLast.add(list, i);
		}
		int k=10;
		int count=0;
		Node middle;
		Node temp= head;
		while(temp.next!=null){
			temp=temp.next;
			count++;
			if(count==k)
				break;
		}
			middle= head;
		while(temp.next!=null){
			temp=temp.next;
			middle=middle.next;	
		}
		System.out.println("target element "+middle.value);
	}
}