package DataPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class News extends General {

	private Object NewsPeriod;
	News(String Tvprogram){
		
		String Temp;
		File path= new File("GENRE/NEWS-6.txt");
		try {
			Scanner NewsSrch= new Scanner(path);
			while(NewsSrch.hasNext()) {
				Temp=NewsSrch.next();
				if(Temp.equalsIgnoreCase(Tvprogram)) {
					this.NewsPeriod=NewsSrch.next();
					break;
				}
				else {
					NewsSrch.next();
				}
			}
			NewsSrch.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Object getNewsPeriod() {
		return NewsPeriod;
	}

	public void setNewsPeriod(Object newsPeriod) {
		NewsPeriod = newsPeriod;
	}

}
