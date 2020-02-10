package objectOrientedP05;

public class RoomClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoomClass sarah = new RoomClass();
		sarah.area();
		sarah.areaWithDoor();
		RoomClass closet = new RoomClass();
		RoomClass kitchen = new RoomClass();
		kitchen = closet;
		RoomClass basement = new RoomClass();
		closet = basement;
		closet.area();
	
		

	}

}
