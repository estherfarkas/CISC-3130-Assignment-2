# CISC-3130-Assignment-2
For this assigment I created a program that would read the CSV Files into an array of files
Then, each file would be read into a queue from the QueuePlaylists class
The queue is a double-ended linked lists made up of nodes from the Songs class
Then I attempted to sort each queue before putting it in an ArrayList of other queues. 
I had a lot of trouble with this and could not quite figure out how to get the queue to get into alphabetical order
Then I created a method to merge the sorted queues into one large playlist. 
Unfortunately, I cannot figure out why my merging method is throwing an index out of bounds exception
I also created a class for a stack of Song History. Whenever a song is played, it is put on top of the stack of histories. 
The last-listened method returns the first item in the stack. 
