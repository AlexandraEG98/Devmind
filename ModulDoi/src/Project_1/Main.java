package Project_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Bine ati venit! \n");
		System.out.println("Introduceti numarul de participanti: ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		GuestsList list = new GuestsList(value);
		
		while(true) {
			System.out.println("Asteapta comanda sau apasa 1 pentru a se afisa lista de optinuni");
			 value = sc.nextInt();
			switch (value) {
			case 1:
				list.help();
				break;
			case 2:
				list.add();
				break;
			case 3:
				list.check();
				break;
			case 4:
				list.remove();
				break;
			case 5:
				list.update();
				break;
			case 6:
				list.guests();
				break;
			case 7:
				list.waitList();
				break;
			case 8:
				list.available();
				break;
			case 9:
				list.guest_no();
				break;
			case 10:
				list.waitList_no();
				break;
			case 11:
				list.subscribe_no();
				break;
			case 12:
				list.search();
				break;
			}
			if(value == 13) {
				System.out.println("La revedere!");
				break;
			}
			if(value > 13 || value < 1) {
				System.out.println("Nu ati introdus o comanda valida.");
			}
		}
		sc.close();
//		
//		Guest p1 = new Guest("Constantin" , "Ivan" , "costivn@gmail.com" , "0722");
//		Guest p2 = new Guest("Alexandra" , "Grancea" , "alexandra@gmail.com" , "0723");
//		Guest p3 = new Guest("Vasile" , "Popovici" , "vasile@gmail.com" , "0782");
//		Guest p4 = new Guest("Ion" , "Vladimirescu" , "ion@gmail.com" , "0766");
//		Guest p5 = new Guest("Ana" , "Macovei" , "ana@gmail.com" , "0785432");
//		Guest p6 = new Guest("Maria" , "Iftime" , "maria@gmail.com" , "07872432");
//	
//		GuestsList g1 = new GuestsList(3);
//	
//		g1.addGuest(p1);
//		g1.addGuest(p2);
//		g1.addGuest(p3);
//		g1.addGuest(p4);
//		g1.addGuest(p5);
//		g1.addGuest(p6);
//
//		System.out.println("\n check \n");
//		g1.check();
//		System.out.println("\n remove \n");
//		g1.remove();
//		System.out.println(" \n guests \n");
//		g1.guests();
//		System.out.println("\n  search \n");
//		g1.search();
//		System.out.println("\n  waitlist \n");
//		g1.waitList();
//		System.out.println("\n guests_no \n");
//		g1.guest_no();
//		System.out.println("\n waitlist_no \n");
//		g1.waitList_no();
//		System.out.println("\n update \n");
//		g1.update();
//		System.out.println("\n remove \n");
//		g1.remove();
//		System.out.println("\n subscribe_no \n");
//		g1.subscribe_no();
//		System.out.println("\n add \n");
//		g1.add();
//		System.out.println("\n subscribe_no \n");
//		g1.subscribe_no();
//		System.out.println("La revedere!");
		
	}
}
