package DataPack;

import java.util.ArrayList;




public class Channel {
//	private Object ChannelName;
//	private Object ChannelNumber;
	private General Tvprogram= new General() ;
	private ArrayList<Object> List;
//	private Time Date; 
	Object[][] Title=new Object[16][7];
	Channel(){
		
		Tvprogram.GeneralFileSrchFun();
		List=Tvprogram.getTvProgramChannel();
	
	}
	public Object[][] TvGuideChannel() {
		String ChannelNumCurrent;
		String ChannelNumPrevious;
		String ChannelName;
		int row=0;
		int col=0;
		for(int check=0;check<List.size();check+=8) {
			if(check!=0) {
				ChannelNumCurrent=(String)List.get(check);
				ChannelNumPrevious=(String)List.get(check-8);
				if(ChannelNumCurrent.equalsIgnoreCase(ChannelNumPrevious)) {
					ChannelName=Tvprogram.ChannelNameFileSrchFun((String)ChannelNumCurrent,false);
					if(col==0) {
						Title[row][col]=ChannelName;
						col++;
						
					}
					Title[row][col]=List.get(check-8+2);
					col++;
					Title[row][col]=List.get(check+2);
				}
				else{
					row++;
					col=0;
				}				
			}
		}

		return Title; 		
		
	}
	
	
}

