
public class ShowPics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Picture newPicture = new Picture("brady.jpg");
		newPicture.draw();
		
		Picture secondPicture = new Picture("brady.jpg");
		secondPicture.translate(300, 168);
		secondPicture.draw();
		

		
		Picture thirdPicture = new Picture("brady2.jpg");
		thirdPicture.translate(0, 168);
		thirdPicture.draw();
		
		Picture fourthPicture = new Picture("brady2.jpg");
		fourthPicture.translate(300, 0);
		fourthPicture.draw();

		
		
	}
	
}

		
