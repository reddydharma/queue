package que;

public class client {
	public static void main(String args [])
	{
		int size=5;
		queue aq=new arrayqueue(5);
		aq.enque(23);
		aq.enque(25);
		aq.display();
		aq.deque();
		aq.enque(12);
		aq.display();
		
		queue alq=new arraylistqueue(5);
	}

}
