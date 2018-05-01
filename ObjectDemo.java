
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day newDay = new Day();
		Day myBirthday = new Day (1997, 3, 23);
		Day todayDate = new Day (2018, 2, 22);
		System.out.println(todayDate.daysFrom(myBirthday));
		
	}
	
	
	
	
}

