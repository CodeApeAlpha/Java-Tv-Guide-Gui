package DataPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class General {
	
	protected Object ChannelPK,TvProgramID,Title,ShortDescription,CC,BroadCastStatus,Length,ProgramType,ChannelName;

	protected ArrayList<Object>TvProgramChannel=  new ArrayList<>();
	General(){
	}
	public void GeneralFileSrchFun() {
		File path= new File("TvProgrmamFinal.txt");
		
		try {
			Scanner FileReader= new Scanner(path);
			while(FileReader.hasNextLine()) {
				TvProgramChannel.add(FileReader.nextLine());
			}
			FileReader.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	
	}
	public void SubData(String Channel, String Tvprog){
		for (int row=0;row<TvProgramChannel.size();row+=8) {
			
			if(row==0) {
				ChannelPK=TvProgramChannel.get(0);
				Title=TvProgramChannel.get(2);
				if(Channel.equalsIgnoreCase((String) ChannelPK)&& Tvprog.equalsIgnoreCase((String)Title)){
					TvProgramID=TvProgramChannel.get(1);
					ShortDescription=TvProgramChannel.get(3);
					CC=TvProgramChannel.get(4);
					BroadCastStatus=BroadCastStatusFun((String)TvProgramChannel.get(5));
					Length=TvProgramChannel.get(6);
					ProgramType=TvProgramChannel.get(7);
				}
			}
			else{
				ChannelPK=TvProgramChannel.get(row);
				Title=TvProgramChannel.get(row+2);
				if (Channel.equalsIgnoreCase((String)ChannelPK) && Tvprog.equalsIgnoreCase((String)Title)) {
					TvProgramID=TvProgramChannel.get(row+1);
					ShortDescription=TvProgramChannel.get(row+3);
					CC=TvProgramChannel.get(row+4);
					BroadCastStatus=TvProgramChannel.get(row+5);
					Length=TvProgramChannel.get(row+6);
					ProgramType=TvProgramChannel.get(row+7);
				}	
			}
		}			
	}
	public String ChannelNameFileSrchFun(String ChannelNum,boolean check) {
		String temp1 = null;
		String temp2=null;
		try {
			File ChannelNamePath= new File("ChannelName.txt");
			@SuppressWarnings("resource")
			Scanner ChannelNameSrch = new Scanner(ChannelNamePath);
			while(ChannelNameSrch.hasNextLine()) {
				
				if (check==false) {
					temp1=ChannelNameSrch.next();
					if(temp1.equalsIgnoreCase(ChannelNum)) {
						return ChannelNameSrch.next();
					}else {
						ChannelNameSrch.nextLine();
					}
				}
				if(check==true) {
					temp1=ChannelNameSrch.next();
					temp2=ChannelNameSrch.next();
					if(temp2.equalsIgnoreCase(ChannelNum)) {
						return temp1;
					}else {
						ChannelNameSrch.nextLine();
					}
				}
				
			}
			ChannelNameSrch.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public String BroadCastStatusFun(String Code) {
		String temp;
		File path= new File("BroadcastStatus.txt");
		try {
			@SuppressWarnings("resource")
			Scanner BroadCastStatusSrch= new Scanner(path);
			while(BroadCastStatusSrch.hasNext()) {
				temp=BroadCastStatusSrch.next();
				if(temp.equalsIgnoreCase(Code)) {
					return (String) (this.BroadCastStatus=BroadCastStatusSrch.next());
				}
				else {
					BroadCastStatusSrch.next();
				}
			}
			BroadCastStatusSrch.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String GenreSrch(String code) {
		String temp;
		File path= new File("Genre.txt");
		try {
			@SuppressWarnings("resource")
			Scanner GenreSrch= new Scanner(path);
			while(GenreSrch.hasNext()) {
				temp=GenreSrch.next();
				if(temp.equalsIgnoreCase(code)) {
					return (String) (this.BroadCastStatus=GenreSrch.next());
				}
				else {
					GenreSrch.next();
				}
			}
			GenreSrch.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;

		
	
		
	}
	
	
	
	public Object getChannelPK() {
		return ChannelPK;
	}
	public void setChannelPK(Object channelPK) {
		ChannelPK = channelPK;
	}
	public Object getTvProgramID() {
		return TvProgramID;
	}
	public void setTvProgramID(Object tvProgramID) {
		TvProgramID = tvProgramID;
	}
	public Object getTitle() {
		return Title;
	}
	public void setTitle(Object title) {
		Title = title;
	}
	public Object getShortDescription() {
		return ShortDescription;
	}
	public void setShortDescription(Object shortDescription) {
		ShortDescription = shortDescription;
	}
	public Object getCC() {
		return CC;
	}
	public void setCC(Object cC) {
		CC = cC;
	}
	public Object getBroadCastStatus() {
		return BroadCastStatus;
	}
	public void setBroadCastStatus(Object broadCastStatus) {
		BroadCastStatus = broadCastStatus;
	}
	public Object getLength() {
		return Length;
	}
	public void setLength(Object length) {
		Length = length;
	}
	public Object getProgramType() {
		return ProgramType;
	}
	public void setProgramType(Object programType) {
		ProgramType = programType;
	}
	public Object getChannelName() {
		return ChannelName;
	}
	public void setChannelName(Object channelName) {
		ChannelName = channelName;
	}

	public ArrayList<Object> getTvProgramChannel() {
		return TvProgramChannel;
	}
	public Object getTvProgramChannel(int row) {
		return TvProgramChannel.get(row);
	}
	public void setTvProgramChannel(ArrayList<Object> tvProgramChannel) {
		TvProgramChannel = tvProgramChannel;
	}
}
