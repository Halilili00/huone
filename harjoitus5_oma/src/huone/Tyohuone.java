package huone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tyohuone extends Huone{
	private String[] staffMembers;
	
	public String[] getStaffMembers() {
		return staffMembers;
	}

	public void setStaffMembers(String[] staffMembers) {
		this.staffMembers = staffMembers;
	}
	
	@Override
	public String toString() {
		return getRoomCode() + ": " + getRoomName() + ", Staffmembers= " + Arrays.toString(staffMembers);
	}

	public void askData() {
		roomInfo();
		Scanner scanner1 = new Scanner(System.in); 
		System.out.println("Enter number of names");
		int numberOfMembers = scanner1.nextInt();
		System.out.println("Enter names:");
		String[] names = new String[numberOfMembers];
		int i=0;
		Scanner scanner2 = new Scanner(System.in); 
		do {
			names[i] = scanner2.nextLine();
			i++;
		}while(i<numberOfMembers);
		staffMembers = names;
	}
	
	public boolean etsiNimella(String searchN) {
		for(int i=0; i<staffMembers.length; i++) {
			if(staffMembers[i].equals(searchN)) {
				return true;
			}
		}
		return false;
	}
}
