package que;

public class client {

	public static void main(String[] args) {
		 int size=5;
		QueueArray q=new QueueArray(size);
		q.insert(12);
		q.insert(2);
		q.insert(43);
		q.insert(7);
		q.insert(23);
		q.insert(12);
		q.display();
		int no=q.delete();
		q.display();
		int no1=q.delete();
		int no2=q.delete();
		q.display();
		int no3=q.delete();
		int no4=q.delete();
		q.display();
		
		

	}

}
