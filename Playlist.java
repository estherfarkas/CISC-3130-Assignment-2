import java.util.*;
import java.io.*;

public class Playlist {

	public static void main(String[] args)  throws IOException { 
		
		File week1= new File("/Users/estherfarkas/Desktop/week1.csv");
		File week2= new File("/Users/estherfarkas/Desktop/week2.csv");
		File week3= new File("/Users/estherfarkas/Desktop/week3.csv");
		File week4= new File("/Users/estherfarkas/Desktop/week4.csv");
		
		File [] files= {week1, week2, week3, week4};

		
		ArrayList <QueuePlaylist> allWeeks= new ArrayList<>();
		
		for(int i=0; i<files.length; i++) {
			
			QueuePlaylist week= new QueuePlaylist();
			
			makePlaylist(files[i], week);
		
			week.sortList();
			
			
			allWeeks.add(week);
			
		
			}
		

		QueuePlaylist month= mergeLists(allWeeks.get(0), allWeeks.get(1));
		QueuePlaylist month2= mergeLists(allWeeks.get(2), allWeeks.get(3));
		//QueuePlaylist playlist= mergeLists(month, month2);
		
		QueuePlaylist playlist= allWeeks.get(1);
		HistoryStack songHistory= new HistoryStack();
		for (int i=0; i<playlist.size; i++) {
			songHistory.addSong(playlist.listenToSong());
			System.out.println(songHistory.lastListened().getInfo());
			
		}
		
}
	

	public static void makePlaylist (File file, QueuePlaylist list) throws IOException{
		
		Scanner input= new Scanner(file);
		while (input.hasNext()) {
			
			String line=input.nextLine();
			String [] tokens= line.split(",");
			
			Song newSong= new Song(tokens[1],tokens[2]);
			list.addSong(newSong);
			
		}
		input.close();
		System.out.println("Playlist Created: Size =" +  list.size);
	}
	
	
	public static QueuePlaylist mergeLists( QueuePlaylist list1,QueuePlaylist list2) {
		
		
		QueuePlaylist list= new QueuePlaylist();
		
			
			while (list1!=null ||list2!=null) {
				
				if (list1.head.getInfo().compareToIgnoreCase(list2.head.getInfo())<0) {
				      list.addSong(list1.head);
				      list1.listenToSong();
				      
				  }
				   
				else {
					  list.addSong(list2.head);
				      list2.listenToSong();
				  }     
			} System.out.print("Successful Merge");

		 
		return list;
	}
}


