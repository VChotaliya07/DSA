/*
Write a Java program that simulates a shopping cart using an ArrayList<String>. Follow the exact steps below in order. Print the cart's contents to the console after steps where the cart changes so you can see your progress.


1.Create the Cart: Create an empty ArrayList of Strings called shoppingCart.

2.Add Items: Add the following items to the cart in this order: "Milk", "Eggs", "Bread", and "Coffee".

3.Insert an Item: You forgot something important! Insert "Apples" exactly at index 1 (between Milk and Eggs).

4.Update an Item: You changed your mind about regular Bread. Replace "Bread" with "Whole Wheat Bread" using its index.

5.Read an Item: Retrieve and print the item currently at index 3.

6.Search for Items:

Check if the cart contains "Coffee" and print a message (e.g., "Do we have Coffee? true").

Find and print the exact index number of "Eggs".

7.Sort the Cart: Sort the shopping cart alphabetically so it's easier to find things in the store.

8.Iterate & Print: Use an enhanced for loop to print a numbered receipt of all items in the sorted cart. (e.g., 1. Apples, 2. Coffee, etc.)

9.Remove the item at index 0.

Remove "Milk" by its name.

Check and print the total number of items (size).

Clear all items from the cart.

Check if the cart is empty (isEmpty) and print the result.

*/
import java.util.*;

class ArrayListDemo
{
	public static void main(String[] args)
	{
		List<String> shoppingCart=new ArrayList<>();

		shoppingCart.add("Milk");
		shoppingCart.add( "Eggs");
		shoppingCart.add( "Bread");
		shoppingCart.add("Coffee");

		shoppingCart.add(1,"Apples");

		shoppingCart.set(shoppingCart.indexOf("Bread"),"Whole Wheat Bread");

		System.out.println(shoppingCart.get(3));

		System.out.println( "Do we have Coffee? "+shoppingCart.contains("Coffee"));
		System.out.println( "Index of Eggs :"+shoppingCart.indexOf("Eggs"));

		Collections.sort(shoppingCart);
		int cnt=1;
		for(String item:shoppingCart)
		{
			System.out.print(cnt+" "+item+" , ");
			cnt++;
		}

		shoppingCart.remove(0);
		shoppingCart.remove("Milk");

		System.out.println("\n Size of cart : "+shoppingCart.size());
		shoppingCart.clear();
		System.out.println("crat is Empty : "+shoppingCart.isEmpty());
	}
}
