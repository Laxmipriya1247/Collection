import java.util.Scanner;

public class Main{
			public static void main(String[] args) {
			List list=new List();
			list.add("B");
			list.add("V");
			list.add("R");
			list.add("I");
			list.add("T");
			list.add("B");
			list.add("T");
			list.add("E");
			list.add("C");
			list.add("H");
			System.out.println("elements in collection are:");
			list.print();
			while("True"!=null)
			{
			System.out.println("\n1.Adding an element into the collection\n2.Retrieve an element from the collection\n3.Remove an elemnt from the collection");
			System.out.println("Enter your choice:");
			Scanner s=new Scanner(System.in);
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:
			System.out.println("Enter the number of elements:");
			Scanner ss=new Scanner(System.in);
			int var1=ss.nextInt();
			System.out.println("Enter the elements:");
			for(int i=0;i<var1;i++)
			{
			Scanner sc=new Scanner(System.in);
			String vv=sc.next();
			list.add(vv);
			}
			     list.print();
			     break;
			case 2:
			System.out.println("Enter the index number of an element to retrieve:");
			Scanner sc=new Scanner(System.in);
			int g=sc.nextInt();
			Object o=list.get(g);
			System.out.println("The element at index "+g +" is:"+o);
			break;
			case 3:
			System.out.println("Enter index number of an element to remove from the collection:");
			Scanner sss=new Scanner(System.in);
			int r=sss.nextInt();
			list.remove(r);
			System.out.println();
			System.out.println("Elements in collection after removing an element are:");
			list.print();
			break;
			default:
			System.out.println("Wrong selection");
			}
			
			}
			}
}
