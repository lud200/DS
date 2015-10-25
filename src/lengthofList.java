
public class lengthofList {
	public static void main(String args[]){
		LinkedList l = new LinkedList();
		l.insertFirst(1);
		l.insertFirst(2);
		l.insertFirst(3);
		l.insertFirst(4);
		l.insertFirst(5);
		l.print(l.head);
//		length length = new length();
//		System.out.println("Length of the list is : "+length.findLength(l));
		findelement f = new findelement();
		f.findElement(l, 3);
	}
}
class length{
	public int  findLength(LinkedList l){
		int count = 0;
		while(l.head != null){
			count++;
			l.head=l.head.next;
		}
		return count;
	}
}