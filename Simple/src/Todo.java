import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Todo {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		List list = new ArrayList<String>();
		
		String query;
		while(true)
		{
			query = sc.next();
			if(query.equals("add"))
			{
				String task = sc.nextLine();
				list.add(task);
			}
			else if(query.equals("report"))
			{
				for(int i=1;i<=list.size();i++)
				{
					System.out.println("["+ i +"] "+list.get(i-1));
				}
			}
			
		}
		
		
	}

}
