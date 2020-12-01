package DataPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kids extends General{
	private Object AgeRange;
	Kids(String Tvprogram){
	
		String Temp;
		File path= new File("GENRE/KIDS-4.txt");
		try {
			Scanner KidsSrch= new Scanner(path);
			while(KidsSrch.hasNext()) {
				Temp=KidsSrch.next();
				if(Temp.equalsIgnoreCase(Tvprogram)) {
					this.AgeRange=KidsSrch.next();
					break;
				}
				else {
					KidsSrch.nextLine();
				}
			}
//			System.out.println(AgeRange);
			KidsSrch.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Object getAgeRange() {
		return AgeRange;
	}

	public void setAgeRange(Object ageRange) {
		AgeRange = ageRange;
	}
}


