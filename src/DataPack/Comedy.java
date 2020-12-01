package DataPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Comedy  extends General{
	private Object Stars;
	Comedy(String Tvprogram){
		
		String Temp;
		File path= new File("GENRE/COMEDY-1.txt");
		try {
			Scanner ComedySrch= new Scanner(path);
			while(ComedySrch.hasNextLine()) {
				Temp=ComedySrch.nextLine();
				if(Temp.equalsIgnoreCase(Tvprogram)) {
					this.Stars=ComedySrch.nextLine();
					break;
				}
				else {
					ComedySrch.nextLine();
				}
			}
			ComedySrch.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Object getStars() {
		return Stars;
	}
	public void setStars(Object stars) {
		Stars = stars;
	}
	
}
