class MyCircularQueue {
    
	private int[] queue;
	private int head;
	private int tail;
	private int size;

	public MyCircularQueue(int k) {
			queue = new int[k];
			size = k;
			head = -1;
			tail = -1;
	}
	

	public boolean enQueue(int value) {

			if(isFull()==true){
					return false;
			}
			
			else if(isEmpty()==true){
					head = 0;
			}
			tail = (tail + 1) % size;
			queue[tail] = value;
			return true;
	}

	public boolean deQueue() {
			if(isEmpty()==true){
					return false;
			}
			
			if (head==tail){
					head = -1;
					tail = -1;
					return true;
			}
			
			head = (head + 1) % size;
			return true;
	}

	public int Front() {
			if(isEmpty()==true){
					return -1;
			}
			return queue[head];
	}
	

	public int Rear() {
			if(isEmpty()==true){
					return -1;
			}
			return queue[tail];
	}
	
	public boolean isEmpty() {
			if(head == -1){
					return true;
			}
			
			return false;
	}
	
	public boolean isFull() {
			if((tail + 1) % size == head){
					return true;
			}
			
			return false;
	}
}