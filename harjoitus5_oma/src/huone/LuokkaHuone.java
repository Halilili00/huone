package huone;

import java.util.Scanner;

public class LuokkaHuone extends Huone{
	private int seats;
	private int computers;
	private String dataProjector;
	
	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getComputers() {
		return computers;
	}

	public void setComputers(int computers) {
		this.computers = computers;
	}

	public String getDataProjector() {
		return dataProjector;
	}

	public void setDataProjector(String dataProjector) {
		this.dataProjector = dataProjector;
	}

	public void askData() {
		roomInfo();
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("seats number");
		seats = scanner1.nextInt();
		System.out.println("computer number ");
		computers = scanner1.nextInt();
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("project on tai ei ");
		dataProjector = scanner3.nextLine();
	}

	@Override
	public String toString() {
		return getRoomCode() + ": " + getRoomName() + ", Seats " + seats + ", Computers " + computers + ", DataProjector " + dataProjector;
	}

}
