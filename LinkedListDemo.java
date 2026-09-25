import java.util.*;
class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList<String> rideLine=new LinkedList<>();
		
		rideLine.add("Alice");
		rideLine.add("Bob");
		rideLine.add("Charlie");

		rideLine.addFirst("Zendaya");
		rideLine.addLast("David");

		System.out.println("Current line: " + rideLine);

		String name=rideLine.removeFirst();
		System.out.println("\nBoarding now : "+name);

		String lastName=rideLine.removeLast();
		System.out.println("Left the line : "+lastName);
		
		System.out.println("From first  : "+rideLine.getFirst());
	
		System.out.println("\n--- People still waiting ---");
		for(String item:rideLine)
		{
			System.out.println("- "+item);
		}

	}
}