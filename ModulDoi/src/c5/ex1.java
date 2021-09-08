package c5;

import java.util.ArrayList;

public class ex1 {

	public static void main(String[] args) {
		ArrayList<String> listaMea = new ArrayList<String>();
		listaMea.add(0, "Alex");
		listaMea.add(0, "George");
		listaMea.add(0, "Tudor");
		listaMea.add(0, "Mihai");
		listaMea.add(0, "Costi");
		listaMea.add(0, "Ana");
		listaMea.add(0, "Alex");
		listaMea.add("Florin");
		System.out.println(listaMea);
		System.out.println("Dimensiunea listei este de: " + listaMea.size());
		System.out.println("Ana se afla in lista mea? " + listaMea.contains("Ana"));
		System.out.println("Laura se afla in lista mea? " + listaMea.contains("Laura"));
		System.out.println("Elementul de pe pozitia 4 este: " + listaMea.get(4));
		System.out.println("Prima data Alex se gaseste la indexul " + listaMea.indexOf("Alex"));
		System.out.println("Ultima data Alex se gaseste la indexul " + listaMea.lastIndexOf("Alex"));
		System.out.println("Ana va fi eliminata din lista " + listaMea.remove("Ana"));
		System.out.println(listaMea);
		System.out.println("Elementul de pe ultima pozitie va fi eliminat din lista " + listaMea.remove(listaMea.size() - 1));
		System.out.println(listaMea);
		System.out.println("Adauga-l pe Alex la index = 1 in locul lui " + listaMea.set(1, "Alex"));
		System.out.println(listaMea);
		System.out.println("Sterge toate elementele din lista");
		listaMea.clear();
		System.out.println(listaMea);
		

	}

}
