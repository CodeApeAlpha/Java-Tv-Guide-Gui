package DataPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Movies extends General {
	private Object Rating;
	private Object DateReleased;
	private Object Stars;
	
	Movies(String Tvprogram){
		String Temp;
		File path= new File("GENRE/Movies-5.txt");
		try {
			Scanner MoviesSrch= new Scanner(path);
			while(MoviesSrch.hasNextLine()) {
				Temp=MoviesSrch.nextLine();
				if(Temp.equalsIgnoreCase(Tvprogram)) {
					this.Rating=MoviesSrch.nextLine();
					this.DateReleased=MoviesSrch.nextLine();
					this.Stars=MoviesSrch.nextLine();
					break;
				}
				else {
					MoviesSrch.nextLine();
				}
			}
			MoviesSrch.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public Object getRating() {
		return Rating;
	}
	public void setRating(Object rating) {
		Rating = rating;
	}
	public Object getDateReleased() {
		return DateReleased;
	}
	public void setDateReleased(Object dateReleased) {
		DateReleased = dateReleased;
	}
	public Object getStars() {
		return Stars;
	}
	public void setStars(Object stars) {
		Stars = stars;
	}
	public static void main(String[] args) {
		new Movies("31");
	}


	

}
