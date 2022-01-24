package huone;
import java.util.Scanner;

public class Huone {
	private String roomCode;
	private String roomName;
	@Override
	public String toString() {
		return roomCode + ": " + roomName;
	}
	
	public String getRoomCode() {
		return roomCode;
	}


	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}


	public String getRoomName() {
		return roomName;
	}


	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}


	public void roomInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter roomcode:");
		roomCode = scanner.nextLine();
		System.out.println("Enter room name:");
		roomName = scanner.nextLine();;
	}
}
