//2.5 
public class SumLists extends LinkedList{
	public static void main(String args[]){
		LinkedList list1= new LinkedList();
		LinkedList list2= new LinkedList();
		LinkedList result= new LinkedList();
		list1.addNode(9);
		list1.addNode(6);
		list1.addNode(1);
		
		list2.addNode(7);
		list2.addNode(6);
		
		list1.printList(list1.head);
		list2.printList(list2.head);
		int n=0;
		int value;
		if(list1.head==null||list2.head==null){
			System.out.println("Given list is null");
		}
		else{
			while(list1.head!=null && list2.head!=null){
				value=list1.head.value+list2.head.value+n;
				result.addNode(value%10);
				n=value/10;
				list1.head=list1.head.next;
				list2.head=list2.head.next;
			}
			while(list1.head!=null){
				value=list1.head.value+n;
				result.addNode(value%10);
				n=value/10;
				list1.head=list1.head.next;
			}
			while(list2.head!=null){
				value=list2.head.value+n;
				result.addNode(value%10);
				n=value/10;
				list1.head=list1.head.next;
			}
			if(n>0){
				result.addNode(n);
			}
			
		}
		result.printList(result.head);
	}
	
}