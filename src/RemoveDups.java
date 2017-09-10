import java.util.LinkedList;
import java.util.Set;
import java.util.Hashtable;
public class RemoveDups{
	public static void main(String args[]){
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(1);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(8);
		list.add(3);
		list.add(5);
		list.add(3);
		Hashtable<Integer, Integer> find= new Hashtable<Integer, Integer>();
		int num=0;
		for(int a: list){
			if(find.containsKey(a)){
				num=find.get(a);
				num++;
			}
			else
				num=1;
			find.put(a, num);
			num=0;
		}
		list.removeAll(list);
		Set<Integer> keys= find.keySet();
		for(Integer key: keys){
			list.add(key);
		}
		for(int a: list){
			System.out.print(a+" ");
		}
	}
}
