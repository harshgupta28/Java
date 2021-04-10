import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Solution
{
	public static void main(String[] args) {
			
		ArrayList<Integer> list = new ArrayList<>();
		list.add(110);
		list.add(30);
		list.add(40);
		
		Map<String, String> map = new HashMap<>();
		
		Set set = map.keySet();
		
		Comparator comparator = new Comparator()
		{

			@Override
			public int compare(Object o1, Object o2) {
				
				Integer i1 = (Integer) o1;
				Integer i2= (Integer) o2;
				
				return i2-i1;
			}
	
		};
		
		Collections.sort(list,comparator);
		
		Iterator it = list.iterator();
		
		while(it.hasNext())
		{
			Integer next = (Integer) it.next();
			
			System.out.println(next);
			
		}
	}
}
