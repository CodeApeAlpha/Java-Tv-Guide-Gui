package DataPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Weather extends General {

	private Object severtyRating;
	Weather(String Tvprogram){
		String Temp;
		File path= new File("GENRE/Weather-7.txt");
		try {
			Scanner WeatherSrch= new Scanner(path);
			while(WeatherSrch.hasNext()) {
				Temp=WeatherSrch.next();
				if(Temp.equalsIgnoreCase(Tvprogram)) {
					this.severtyRating=WeatherSrch.next();
					break;
				}
				else {
					WeatherSrch.next();
				}
			}
			System.out.println(severtyRating);
			WeatherSrch.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Object getSevertyRating() {
		return severtyRating;
	}

	public void setSevertyRating(Object severtyRating) {
		this.severtyRating = severtyRating;
	}

	public static void main(String[] args) {
		new Weather("46");
	}
}