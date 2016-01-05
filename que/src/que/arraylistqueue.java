package que;

import java.util.ArrayList;

public class arraylistqueue extends queue {

	
	ArrayList<Integer> arraylist=new ArrayList<Integer>();
	
	public arraylistqueue(int i) {
		super();
	}

	@Override
	public boolean enque(int var) {
		arraylist.add(var);
		System.out.println("Inserted "+var);
		return false;
	}

	@Override
	public void deque() {
		if(arraylist.isEmpty())
		{
			System.out.println("Queue is empty ");
		}
		else
			System.out.println("Deleted "+arraylist.remove(0));
		
	}

	@Override
	public void display() {
		if(arraylist.isEmpty())
			System.out.println("Queue is empty");	
			else
			{
				System.out.println("Queue is ");
			   for(Integer obj:arraylist)
			   {
				   System.out.println(obj);
			   }
		}

	}

}
