package arraylist;

import java.util.ArrayList;

public class FlowerFruit {
	public static void main(String[] args) {
		ArrayList flower = new ArrayList();
		flower.add("rose");
		flower.add("mallie");
		flower.add("sevvanthi");
		System.out.println(flower);
		
		ArrayList fruit = new ArrayList();
		fruit.add("strawberry");
		fruit.add("orange");
		fruit.add("apple");
		System.out.println(fruit);
		
		ArrayList a3 = new ArrayList();
		a3.addAll(flower);
		a3.addAll(fruit);
		System.out.println(a3);
		
		
	}

}
