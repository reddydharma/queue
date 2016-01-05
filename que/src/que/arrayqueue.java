package que;

public final class arrayqueue extends queue {
	int qsize;
	int queue[];
	int rear;
	int front;
	int len;
	int j;
	public arrayqueue(int size) {
		qsize=size;
	   queue=new int[qsize];
	 rear=-1;
	 front=0;
	 len=0;
	}
	
	@Override
	public  boolean  enque(int var) {
		 boolean flag=false;
			if(rear==front)
				front=0;
			
			    rear++;
				if(rear>=qsize)
				{
				System.out.println("Queue Overflow");
				flag=false;
				return flag;
				}	
			else
			{	
				
			    queue[rear]=var;
			    flag=true;
			    len++;
			}
				return flag;
		 
	}

	@Override
	public void deque() {
		 int temp=front;

			int element=queue[temp];
		    temp++;
		    len--;
		    
		    for(j=front;j<len;j++)
		     	{
		    	queue[j]=queue[temp];
		     	temp++;
		     	}
		    rear--;
		    if(rear==-1)
		    	System.out.println("Underflow");

		    System.out.println(element+"dequed");
			

	}

	@Override
	public void display() {
		System.out.println("Queue");
		if(len==0)
		{
			System.out.print("Empty");
		    return ;
		}
		for(int i=front;i<rear;i++)
		{
			System.out.print(queue[i]+" ");
		}
		System.out.println("\n");

	}

}
