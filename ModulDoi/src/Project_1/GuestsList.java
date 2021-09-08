package Project_1;

import java.util.ArrayList;
import java.util.Scanner;

public class GuestsList {

	ArrayList <Guest> theList;
	ArrayList <Guest> waitingList;
	
	int limit ;
	
	public GuestsList(int limit) {
		this.limit = limit;
		this.theList = new ArrayList<>();
		this.waitingList = new ArrayList<>();
	}
	Scanner sc = new Scanner(System.in);
	public int add() {
		
		System.out.println("Se adauga o noua persoana");
		System.out.println("Introduceti numele de familie: ");
		String secondName = sc.next();
		System.out.println("Introduceti prenumele: ");
		String firstName = sc.next();
		System.out.println("Introduceti email: ");
		String email = sc.next();
		System.out.println("Introduceti numarul de telefon");
		String phoneNumber = sc.next();
		
		Guest g = new Guest(secondName, firstName, email, phoneNumber);
		
		for(Guest guest : theList) {
			if(g.equalsToName(guest)) {
				System.out.println("Ne pare rau dar numele si prenumele a fost deja introdus in lista.");
				return -1;
				
			}else if(g.equalsToEmail(guest)) {
				System.out.println("Ne pare rau dar email-ul a fost deja introdus in lista.");	
				return -1;
				
			}else if(g.equalsToNumber(guest)) {
				System.out.println("Ne pare rau dar numarul de telefon a fost deja introdus in lista.");	
				return -1;
			}
		}
		
		if(theList.size() < limit) {
			theList.add(g);
			System.out.println("<" + g.getFirstName() + " " + g.getLastName() + "> Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
			return 0;
		}
		waitingList.add(g);
		System.out.println("<" + g.getFirstName() + " " + g.getLastName() + "> Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine <" + waitingList.size() + ">. Te vom notifica daca un loc devine disponibil.");
		return waitingList.size();
	}
	
	
	public int addGuest(Guest g) {
		for(Guest guest : theList) {
			if(g.equalsToName(guest)) {
				System.out.println("Ne pare rau dar numele si prenumele a fost deja introdus in lista.");
				return -1;
				
			}else if(g.equalsToEmail(guest)) {
				System.out.println("Ne pare rau dar email-ul a fost deja introdus in lista.");	
				return -1;
				
			}else if(g.equalsToNumber(guest)) {
				System.out.println("Ne pare rau dar numarul de telefon a fost deja introdus in lista.");	
				return -1;
			}
		}
		
		if(theList.size() < limit) {
			theList.add(g);
			System.out.println("<" + g.getFirstName() + " " + g.getLastName() +"> Felicitari! Locul tau la eveniment este confirmat. Te asteptam!");
			return 0;
		}
		waitingList.add(g);
		System.out.println("<" + g.getFirstName() + " " + g.getLastName() +"> Te-ai inscris cu succes in lista de asteptare si ai primit numarul de ordine <" + waitingList.size() + ">. Te vom notifica daca un loc devine disponibil.");
		return waitingList.size();
	}
	public boolean check() {
	
		System.out.println("Cautarea persoanei se poate face dupa: "
				+ "\n1. Nume si Prenume"
				+ "\n2. Email"
				+ "\n3. Numar de telefon"
				+ "\nAlegeti una dintre variantele de mai sus");
	
		int n = sc.nextInt();
		if(n > 3 || n < 1) {
			System.out.println("Nu ati ales una dintre variantele de mai sus.");
		}

		if(n == 1) {
			System.out.println("Se cauta persoana dupa nume si prenume");
			System.out.println("Introduceti numele: ");
			String secondName = sc.next();
			System.out.println("Introduceti prenumele: ");
			String firstName = sc.next();
			for(Guest g : theList) {
				if ((g.getFirstName().toLowerCase().compareTo(firstName.toLowerCase()) == 0) && (g.getLastName().toLowerCase().compareTo(secondName.toLowerCase()) == 0)) {
					System.out.println(firstName + " " + secondName + " se afla pe lista de invitati");
				}
			}
			for(Guest g1 : waitingList) {
				if ((g1.getFirstName().toLowerCase().compareTo(firstName.toLowerCase()) == 0) && (g1.getLastName().toLowerCase().compareTo(secondName.toLowerCase()) == 0)) {		
					System.out.println(firstName + " " + secondName + " se afla pe lista de asteptare");
				}
			}
		}		

		if(n == 2) {
			System.out.println("Se cauta persoana dupa adresa de email.");
			System.out.println("Introduceti adresa de email:");
			String email = sc.next();
			for(Guest g : theList) {
				if (g.getEmail().toLowerCase().compareTo(email.toLowerCase()) == 0) {
					System.out.println("Persoana cu adresa de email "+ email+ " se afla pe lista de invitati");
					return true;
				}
			}
			for(Guest g : waitingList) {
				if (g.getEmail().toLowerCase().compareTo(email.toLowerCase()) == 0)  {
					System.out.println("Persoana cu adresa de email "+ email+ " se afla pe lista de asteptare");
					return true;
				}
			}
		}
 
		if(n == 3) {		
			System.out.println("Se cauta persoana dupa numarul de telefon.");
			System.out.println("Introduceti numarul de telefon: ");
			String phoneNumber = sc.next();
			for(Guest g : theList) {
				if (g.getPhoneNumber().compareTo(phoneNumber) == 0) {
					System.out.println("Persoana cu numarul de telefon "+ phoneNumber + " se afla pe lista de invitati");
					return true;
				}
			}
			for(Guest g : waitingList) {
				if (g.getPhoneNumber().compareTo(phoneNumber) == 0)  {
					System.out.println("Persoana cu numarul de telefon "+ phoneNumber + " se afla pe lista de asteptare");
					return true;
				}
			}
		}
		return false;
			
	}
	
	public boolean remove() {
		System.out.println("Dupa ce criteriu doriti sa stergeti persoana?\n\t"
				+ "1. Nume si Prenume\n\t"
				+ "2. Email \n\t"
				+ "3. Numar de telefon \n");
		int n = sc.nextInt();
		
		if (n > 3 && n < 1) {
			System.out.println("Nu ati introdus una din cifrele 1, 2 sau 3");
			return false;
		}
		
		if (n == 1) {
			System.out.println("Introduceti numele: ");
			String secondName = sc.next();
			System.out.println("Introduceti prenumele: ");
			String firstName = sc.next();
		
			boolean guestOnMainList = false;
			for (Guest g : theList) {
				if ((g.getFirstName().toLowerCase().compareTo(firstName.toLowerCase()) == 0) && (g.getLastName().toLowerCase().compareTo(secondName.toLowerCase()) == 0)) {
					theList.remove(g);
					System.out.println("Stergerea persoanei s-a realizat cu succes.");
					boolean result =  waitingList.isEmpty();
					guestOnMainList = true;
					if (result == false) {
						theList.add(waitingList.get(0));
						System.out.println("Felicitari " + waitingList.get(0).getFirstName() + " " + waitingList.get(0).getLastName() + "! S-a eliberat un loc pe lista invitatilor."
								+ "Te asteptam la eveniment!");
						waitingList.remove(0);
					}
					return true;
				}
			}
			//remove in waitingList
			if (guestOnMainList == false) {
				for (Guest g : waitingList) {
					if ((g.getFirstName().toLowerCase().compareTo(firstName.toLowerCase()) == 0) && (g.getLastName().toLowerCase().compareTo(secondName.toLowerCase()) == 0)) {
						waitingList.remove(g);
						System.out.println("Stergerea persoanei s-a realizat cu succes.");
						return true;
					}
				}
			}
		}
		
		if(n == 2){

			System.out.println("Introduceti email-ul: ");
			String mail = sc.next();
			System.out.println();
			
			boolean guestOnMainList = false;
			for (Guest g : theList) {
				if (g.getEmail().toLowerCase().compareTo(mail.toLowerCase()) == 0) {
					theList.remove(g);
					System.out.println("Stergerea persoanei s-a realizat cu succes.");
					boolean result =  waitingList.isEmpty();
					guestOnMainList = true;
					
					if (result == false) {
						theList.add(waitingList.get(0));
						System.out.println("Felicitari " + waitingList.get(0).getFirstName() + " " + waitingList.get(0).getLastName() + "! S-a eliberat un loc pe lista invitatilor."
								+ "Te asteptam la eveniment!");
						waitingList.remove(0);
					}
					return true;
				}
			}
			//remove in waitingList
			if (guestOnMainList == false) {
				for (Guest g : waitingList) {
					if (g.getEmail().toLowerCase().compareTo(mail.toLowerCase()) == 0) {
						waitingList.remove(g);
						System.out.println("Stergerea persoanei s-a realizat cu succes.");
						return true;
					}
				}
			}
		}

		if (n == 3) {

			System.out.println("Introduceti numarul de telefon: ");
			String num = sc.next();
			System.out.println();

			boolean guestOnMainList = false;
			for (Guest g : theList) {
				if (g.getPhoneNumber().compareTo(num) == 0) {
					theList.remove(g);
					System.out.println("Stergerea persoanei s-a realizat cu succes.");
					boolean result =  waitingList.isEmpty();
					guestOnMainList = true;
					
					if (result == false) {
						theList.add(waitingList.get(0));
						System.out.println("Felicitari " + waitingList.get(0).getFirstName() + " " + waitingList.get(0).getLastName() + "! S-a eliberat un loc pe lista de invitati."
								+ "Te asteptam la eveniment!");
						waitingList.remove(0);
					}
					return true;
				}
			}
			
			//remove in waitingList
			if (guestOnMainList == false) {
				for (Guest g : waitingList) {
					if (g.getPhoneNumber().compareTo(num) == 0) {
						waitingList.remove(g);
						System.out.println("Stergerea persoanei s-a realizat cu succes.");
						return true;
					}
				}
			}
			
		}
		System.out.println("Persoana nu a fost gasitia !");
		return false;
	}
	
		public int checkTheListName (int n, String firstName, String secondName) {
			if (n != 1) {
				return -1;
			}
			for (Guest g : theList) {
				if ((g.getFirstName().toLowerCase().compareTo(firstName.toLowerCase()) == 0) && (g.getLastName().toLowerCase().compareTo(secondName.toLowerCase()) == 0)) {
					return theList.indexOf(g);
				}
			}
			return -1;
		}
	
		public int checkTheListEmailOrNumber(int n, String emailPhoneNumber) {
			if (n != 2 && n != 3) {
				return -1;
			}
			if (n == 2) {
				for (Guest g : theList) {
					if ((g.getEmail().toLowerCase().compareTo(emailPhoneNumber.toLowerCase())) == 0) {
						return theList.indexOf(g)  ;
					}
				}
			} else {
				for (Guest g : theList) {
					if ((g.getPhoneNumber().compareTo(emailPhoneNumber)) == 0) {
						return theList.indexOf(g);
					}
				}
			}
			return -1;
		}
		public boolean update() {
			System.out.println("Se actualizeaza detaliile unei persoane…");
			System.out.println("Alege modul de autentificare, tastand:\r\n"
					+ "\"1\" - Nume si prenume\r\n"
					+ "\"2\" - Email\r\n"
					+ "\"3\" - Numar de telefon");
			int user = sc.nextInt();

			if (user > 3 && user < 1) {
				System.out.println("Nu ati introdus una din cifrele de mai sus");
				return false;
			}
			
			if (user == 1) {
				System.out.println("Introduceti numele: ");
				String secondName = sc.next();
				System.out.println("Introduceti prenumele: ");
				String firstName = sc.next();
				int i = checkTheListName(user,firstName,secondName);
				if (i != -1) {
					System.out.println("Alege campul pe care doriti sa il actualizati:\r\n"
							+ "\"1\" - Nume\r\n"
							+ "\"2\" - Prenume\r\n"
							+ "\"3\" - Email\r\n"
							+ "\"4\" - Numar de telefon");
					int modify = sc.nextInt();
					
					if (modify == 1) {
						System.out.println("Introduceti numele: \n");
						secondName = sc.next();
						theList.get(i).setLastName(secondName);
						System.out.println("Nume schimbat cu succes!");
					
					} else if (modify == 2) {
						System.out.println("Introduceti prenumele: \n");
						firstName = sc.next();
						theList.get(i).setFirstName(firstName);
						System.out.println("Prenume schimbat cu succes!");
						
					} else if (modify == 3) {
						System.out.println("Introduceti email-ul: \n");
						String email = sc.next();
						theList.get(i).setEmail(email);
						System.out.println("Email schimbat cu succes! ");
						
					} else if (modify == 4) {
						System.out.println("Introduceti numarul de telefon: \n");
						String phoneNumber = sc.next();
						theList.get(i).setPhoneNumber(phoneNumber);
						System.out.println("Numarul de telefon schimbat cu succes! ");
					} else {
						System.out.println("Nu ati introdus una din variantele de mai sus");
					}
				} else {
					System.out.println("Persoana nu se afla in sistem.");
				}
				
			} else if (user == 2) {
				System.out.println("Introduceti email-ul: ");
				String email = sc.next();
				int i = checkTheListEmailOrNumber(user, email);
				
				if (i != -1) {
					System.out.println("Alege campul de actualizat, tastand:\r\n"
							+ "\"1\" - Nume\r\n"
							+ "\"2\" - Prenume\r\n"
							+ "\"3\" - Email\r\n"
							+ "\"4\" - Numar de telefon");
					int modify = sc.nextInt();
					
					if (modify == 1) {
						System.out.println("Scrieti numele: \n");
						String lastName = sc.next();
						theList.get(i).setLastName(lastName);
						System.out.println("Numele schimbat cu succes!");
						
					} else if (modify == 2) {
						System.out.println("Scrieti prenumele: \n");
						String firstName = sc.next();
						theList.get(i).setFirstName(firstName);
						System.out.println("Prenumele schimbat cu succes!");
						
					} else if (modify == 3) {
						System.out.println("Scrieti email-ul: \n");
						email = sc.next();
						theList.get(i).setEmail(email);
						System.out.println("Email schimbat cu succes! ");
						
					} else if (modify == 4) {
						System.out.println("Scrieti numarul de telefon: \n");
						String phoneNumber = sc.next();
						theList.get(i).setPhoneNumber(phoneNumber);
						System.out.println("Numarul de telefon schimbat cu succes!");
					} else {
						System.out.println("Nu ati introdus un numar valid");
					}
				} else {
					System.out.println("Persoana nu se afla in sistem.");
				}
			
			} else if(user == 3) {
				System.out.println("Introduceti numarul de telefon: ");
				String phoneNumber = sc.next();
				int i = checkTheListEmailOrNumber (user, phoneNumber);
				if (i != -1) {
					System.out.println("Alege campul de actualizat, tastand:\r\n"
							+ "\"1\" - Nume\r\n"
							+ "\"2\" - Prenume\r\n"
							+ "\"3\" - Email\r\n"
							+ "\"4\" - Numar de telefon");
					int modify = sc.nextInt();
					
					if (modify == 1) {
						System.out.println("Scrieti numele: \n");
						String lastName = sc.next();
						theList.get(i).setLastName(lastName);
						System.out.println("Numele schimbat cu succes!");
						
					} else if (modify == 2) {
						System.out.println("Scrieti prenumele: \n");
						String firstName = sc.next();
						theList.get(i).setFirstName(firstName);
						System.out.println("Prenumele schimbat cu succes!");
						
					} else if (modify == 3) {
						System.out.println("Scrieti email-ul: \n");
						String email = sc.next();
						theList.get(i).setEmail(email);
						System.out.println("Email schimbat cu succes!");
						
					} else if (modify == 4) {
						System.out.println("Scrieti numarul de telefon: \n");
						phoneNumber = sc.next();
						theList.get(i).setPhoneNumber(phoneNumber);
						System.out.println("Numarul de telefon schimbat cu succes! ");
					} else {
						System.out.println("Nu ati introdus un numar valid");
					}
				} else {
					System.out.println("Persoana nu se afla in sistem.");
				}
			}
			return false;
		}
		
		public void guests() {
			System.out.println("\n\t~Lista invitati~\n");
			int guestNo = 1;
			for(Guest i : theList) {
				System.out.println(guestNo + ". Nume: " + i.getFirstName() + " " + i.getLastName() + ", email: " + i.getEmail() + ", numar de telefon: " + i.getPhoneNumber());
				guestNo++;
			}
			if(theList.isEmpty()) {
				System.out.println("Lista de invitati este goala.");
			}
			
		} 
		public void waitList() {
			System.out.println("\n\t~Lista de asteptare~\n");
			int guestNo = 1;
			for(Guest i : waitingList) {
				System.out.println(guestNo + ". Nume: " + i.getFirstName() + " " + i.getLastName() + ", email: " + i.getEmail() + ", numar de telefon: " + i.getPhoneNumber());
				guestNo++;
			}
			if(waitingList.isEmpty()) {
				System.out.println("Lista de asteptare este goala.");
			}
		} 
		public void available() {
			int availabeleGuests = this.limit - theList.size();
			System.out.println("Numarul de locuri disponibile in lista de invitati: " + availabeleGuests);
		}
		public void guest_no() {
			System.out.println("Numar participanti: " + theList.size());
		}
		public void waitList_no() {
			System.out.println("Numarul de persoane aflate pe lista de asteptare: " + waitingList.size());
		}
		public void subscribe_no() {
			int total = theList.size() + waitingList.size();
			System.out.println("Numarul total de persoane: " + total);
		}
		public void search() {
			System.out.println("Introduceti sirul de caractere pentru cautarea partiala: ");
			String partialSearch = sc.next();
			ArrayList<Guest> fieldsContainsPartialWord = new ArrayList<>();
			int guest_no = 1;
			for(Guest i : theList) {
				if(i.getFirstName().toLowerCase().contains(partialSearch.toLowerCase())) {
					fieldsContainsPartialWord.add(i);
				}else if(i.getLastName().toLowerCase().contains(partialSearch.toLowerCase())) {
					fieldsContainsPartialWord.add(i);
				}else if(i.getEmail().toLowerCase().contains(partialSearch.toLowerCase())) {
					fieldsContainsPartialWord.add(i);
				}else if(i.getPhoneNumber().toLowerCase().contains(partialSearch.toLowerCase())) {
					fieldsContainsPartialWord.add(i);
				}
			}
			if (fieldsContainsPartialWord.isEmpty()) {
				System.out.println("Nu s-a gasit niciun rezultat.");
			}
			for (Guest i : fieldsContainsPartialWord) {
				System.out.println(guest_no + ". Nume: " + i.getFirstName() + " " + i.getLastName() + ", email: " + i.getEmail() + ", numar de telefon: " + i.getPhoneNumber());
				guest_no++;
			}
		}
		public void help() {
			System.out.println("\n\n help         \n1 Afiseaza aceasta lista de comenzi\r\n"
					+ "2 add          - Adauga o noua persoana (inscriere)\r\n"
					+ "3 check        - Verifica daca o persoana este inscrisa la eveniment\r\n"
					+ "4 remove       - Sterge o persoana existenta din lista\r\n"
					+ "5 update       - Actualizeaza detaliile unei persoane\r\n"
					+ "6 guests       - Lista de persoane care participa la eveniment\r\n"
					+ "7 waitlist     - Persoanele din lista de asteptare\r\n"
					+ "8 available    - Numarul de locuri libere\r\n"
					+ "9 guests_no    - Numarul de persoane care participa la eveniment\r\n"
					+ "10 waitlist_no  - Numarul de persoane din lista de asteptare\r\n"
					+ "11 subscribe_no - Numarul total de persoane inscrise\r\n"
					+ "12 search       - Cauta toti invitatii conform sirului de caractere introdus\r\n"
					+ "13 quit         - Inchide aplicatia\n\n");
		}
	}

	

