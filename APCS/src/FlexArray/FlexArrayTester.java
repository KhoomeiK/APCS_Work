package FlexArray;

public class FlexArrayTester {
	public static void main(String[] args) {
		// ---------------FlexArrayRectangle----------------
		System.out.println("FlexArrayRectangle output:");

		FlexArrayRectangle list1 = new FlexArrayRectangle();
		FlexArrayRectangle list2 = new FlexArrayRectangle();
		FlexArrayRectangle list3 = new FlexArrayRectangle();

		Rectangle a = new Rectangle(1, 6);
		Rectangle b = new Rectangle(3, 4);
		Rectangle c = new Rectangle(5, 2);
		Rectangle d = new Rectangle(7, 8);
		Rectangle e = new Rectangle(9, 10);

		Rectangle[] lista = { a, b, c };
		Rectangle[] listb = { c, a, b };
		Rectangle[] listc = { d, e };

		for (int i = 0; i < lista.length; i++)
			list1.append(lista[i]);
		for (int i = 0; i < listb.length; i++)
			list2.append(listb[i]);
		for (int i = 0; i < listc.length; i++)
			list3.append(listc[i]);

		// compareTo()
		System.out.println("//compareTo()");
		System.out.println(list1.compareTo(list2));
		System.out.println(list2.compareTo(list3));
		System.out.println(list1.compareTo(list3));
		System.out.println();

		// equals()
		System.out.println("//equals()");
		System.out.println(list1.equals(list2));
		System.out.println(list2.equals(list3));
		System.out.println(list1.equals(list3));
		System.out.println();

		// sort()
		System.out.println("//sort()");
		System.out.println("Before the sort : " + list1);
		list1.sort();
		System.out.println(list1);
		System.out.println();

		// getValue()
		System.out.println("//getValue()");
		System.out.println("Current array : " + list1);
		System.out.println(list1.getValue(0));
		System.out.println(list1.getValue(4));
		System.out.println(list1.getValue(2));
		System.out.println(list1.getValue(10));
		System.out.println();

		// searchFor()
		System.out.println("//searchFor()");
		System.out.println("Current array : " + list1);
		System.out.println(list1.searchFor(a));
		System.out.println(list1.searchFor(e));
		System.out.println();

		// ---------------FlexArrayPrimitive----------------
		System.out.println("FlexArrayPrimitive output:");

		FlexArrayPrimitive List1 = new FlexArrayPrimitive();
		FlexArrayPrimitive List2 = new FlexArrayPrimitive();
		FlexArrayPrimitive List3 = new FlexArrayPrimitive();

		int[] Lista = { 34, 7, 8, -16, 15 };
		int[] Listb = { 7, 8, 15, 34, -16 };
		int[] Listc = { 3, 89, 2, 0 };

		for (int i = 0; i < Lista.length; i++)
			List1.append(Lista[i]);
		for (int i = 0; i < Listb.length; i++)
			List2.append(Listb[i]);
		for (int i = 0; i < Listc.length; i++)
			List3.append(Listc[i]);

		// compareTo()
		System.out.println("compareTo()");
		System.out.println(List1.compareTo(List2));
		System.out.println(List2.compareTo(List3));
		System.out.println(List1.compareTo(List3));
		System.out.println();

		// equals()
		System.out.println("equals()");
		System.out.println(List1.equals(List2));
		System.out.println(List2.equals(List3));
		System.out.println(List1.equals(List3));
		System.out.println();

		// sort()
		System.out.println("sort()");
		System.out.println("Before the sort : " + List1);
		List1.sort();
		System.out.println(List1);
		System.out.println();

		// getValue()
		System.out.println("getValue()");
		System.out.println("Current array : " + List1);
		System.out.println(List1.getValue(0));
		System.out.println(List1.getValue(4));
		System.out.println(List1.getValue(2));
		System.out.println(List1.getValue(10));
		System.out.println();

		// searchFor()
		System.out.println("searchFor()");
		System.out.println("Current array : " + List1);
		System.out.println(List1.searchFor(7));
		System.out.println(List1.searchFor(1000));
		System.out.println();
	}
}
