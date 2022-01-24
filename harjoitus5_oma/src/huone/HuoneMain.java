package huone;

import java.util.ArrayList;
import java.util.Scanner;

public class HuoneMain {
	private ArrayList<Huone> rooms = new ArrayList<Huone>();
	public static void main(String[] args) {
		HuoneMain esim = new HuoneMain();
		esim.ask();
		
	}
	public void ask() {
		Scanner scanner = new Scanner(System.in);
		boolean bool=true;
		while(bool) {
			System.out.println("Enter number");
			String a = scanner.nextLine();
			if(a.isEmpty()) {
				bool = false;
				break;
			}
			int valinta = Integer.parseInt(a);
			switch(valinta) {
			case 1 :
				LuokkaHuone luokkaHuoneData = new LuokkaHuone();
				luokkaHuoneData.askData();
				rooms.add(luokkaHuoneData);
				break;
			case 2 :
				Tyohuone tyoHuoneData = new Tyohuone();
				tyoHuoneData.askData();
				rooms.add(tyoHuoneData);
				break;
			case 3 :
				Huone huone = new Huone();
				huone.roomInfo();
				rooms.add(huone);
				break;
			case 4 :
				for(Huone room : rooms)
					System.out.println(room.toString());
				break;
			case 5 :
				for(int i=0; i<rooms.size(); i++) {
					if(rooms.get(i).getClass() == LuokkaHuone.class) {
						System.out.println(rooms.get(i));
					}
				}
				break;
			case 6 :
				for(int i=0; i<rooms.size(); i++) {
					if(rooms.get(i).getClass() == Tyohuone.class) {
						System.out.println(rooms.get(i));
					}
				}
				break;
			case 7 :
				for(int i=0; i<rooms.size(); i++) {
					if(rooms.get(i).getClass() == Huone.class) {
						System.out.println(rooms.get(i));
					}
				}
				break;
			case 8 :
				System.out.println("Search with roomcode:");
				String searchCode = scanner.nextLine();
				for(int i=0; i<rooms.size(); i++) {
					if((rooms.get(i).getRoomCode()).equals(searchCode)) {
						System.out.println(rooms.get(i));
					}
				}
				break;
			case 9 :
				//looppaa kaikki huoneet
				System.out.println("Searched member name:");
				String x = scanner.nextLine();
				for(int i=0; i<rooms.size(); i++) {
					if(rooms.get(i).getClass() == Tyohuone.class) {
						Tyohuone search = (Tyohuone)rooms.get(i);
						boolean b = search.etsiNimella(x);
						if(b){
							System.out.println(rooms.get(i));
						}
					}
				}
				break;
			default:
				bool = false;
				System.out.println("End");
			}
		}
	}
}
