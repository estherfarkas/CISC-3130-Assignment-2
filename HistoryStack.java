
public class HistoryStack {
			public Song first;
			
			public HistoryStack() {
				first=null;
				
			}
			
			public void addSong (Song song) {
				
				first=song;
			}
			
			public Song lastListened() {
				return first;
			}
}
