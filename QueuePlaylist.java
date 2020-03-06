
public class QueuePlaylist { //Double ended linked list for queue
		public Song head;
		public Song last;
		public int size;
		
		public QueuePlaylist() { //Default Constructor
			head=null;
			last=null;
			size=0;
		}
		
		
		public void addSong(Song song) {
			
			if (head==null) {
				head=song;
				last=song;}
			
			else { 
				last.next=song;
				last=song;
				size+=1;
			}
			
		}
		
		public Song listenToSong() {
			
				Song temp= head;
				head=head.next;
				size-=1;
				return temp;}	
		
		public void sortList() {
			
			Song current= head;
			Song tempSong=current.next;
			
			for (int i=0; i<size-1; i++) {
				while (tempSong!=null&&tempSong.next!=null) {
					
					
					if (tempSong.next.songTitle.compareToIgnoreCase(tempSong.songTitle)<0) {
						Song temp= tempSong.next;
						Song temp2= temp.next;
						current.next=temp;
						temp.next=tempSong;
						tempSong.next=temp2;
						
					}
				current=current.next;
				tempSong=current.next;
				}
				
			}System.out.println("Playlist Sorted");
				
		}
		
		
			
		
				
}
