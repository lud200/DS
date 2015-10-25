public class findelement {
	public void findElement(LinkedList l, int data){
		while(l.head != null){
			if(l.head.data == data){
				System.out.println("Element found:"+data);
			}
			l.head = l.head.next;
		}
	}
}
