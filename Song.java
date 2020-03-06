
public class Song {
		public String songTitle;
		public String artistName;
		public Song next;
		
		public Song (String title, String name) {
			songTitle=title;
			artistName=name;
			next=null;
			}
		
		public Song(Song temp) {
			songTitle=temp.songTitle;
			artistName=temp.artistName;
			next=temp.next;
		}
		
		
		public String getInfo() {
			return songTitle + " by " + artistName;
		}
		
}
