
public class Skloniste {

	private Node head;
	private Node tail;
	
	public Skloniste()
	{
		this.head = head;
		this.tail = tail;
	}
	
	public void enqueue(Zivotinja zivotinja)
	{
		Node newNode = new Node(zivotinja);
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
			tail.next = null;
		}
	}
	
	public void dequeueAny()
	{
		if (head == null)
		{
			throw new NullPointerException("Sklonište je prazno!");
		}
		if (head == tail)
		{
			tail = null;
		}
		head = head.next;
	}
	
	
	public void dequeueDog()
	{
		String pas = "pas";
		if (head == null)
		{
			throw new NullPointerException("Sklonište je prazno!");
		}
		if (head == tail)
		{
			tail = null;
		}
		if (head.value.getTip().equals(pas))
		{
			head = head.next;
		}
		
		Node previous = head;
		Node current = head.next;
		while (current.value.getTip()!=pas)
		{
			previous = current;
			current = current.next;
		}
		if (current.value.getTip().equals(pas))
		{
			previous.next = current.next;
			current.next = null;
		}
	}

	public void dequeueCat()
	{
		String macka = "maèka";
		if (head == null)
		{
			throw new NullPointerException("Sklonište je prazno!");
		}
		if (head.value.getTip().equals(macka))
		{
			head = head.next;
		}
		Node previous = head;
		Node current = head.next;
		while (current.value.getTip()!=macka)
		{
			previous = current;
			current = current.next;
		}
		if(current.value.getTip().equals(macka))
		{
			previous.next = current.next;
			current.next = null;
		}
}
	
	public String toString()
	{
		Node current = head;
		String str ="";
		while (current != null)
		{
			str += current.value.toString() + "\n";
			current = current.next;
		}
		return str;
	}
	
	private class Node
	{
		private Node next;
		private Zivotinja value;
		
		public Node(Zivotinja value)
		{
			this.value = value;
			this.next = null;
		}
		
		public Node(Zivotinja value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}
	
}
