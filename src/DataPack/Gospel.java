package DataPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Gospel extends General {
	private Object  denomination;
	Gospel(String TvProgramID){
		String Temp;
		File path= new File("GENRE/Gospel-3.txt");
		try {
			Scanner GospelSrch= new Scanner(path);
			while(GospelSrch.hasNext()) {
				
				Temp=GospelSrch.next();
				if(Temp.equalsIgnoreCase(TvProgramID)) {
					denomination=GospelSrch.next();
					break;
				}
				else {
					GospelSrch.nextLine();
				}
			}
			System.out.println(denomination);
			GospelSrch.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Object getDenomination() {
		return denomination;
	}
	public void setDenomination(String denom) {
		denomination = denom;
	}
	

}
