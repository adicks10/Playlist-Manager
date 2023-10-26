//Assignment #: Arizona State University Spring 2023 CSE205 #9
//Name: Arthur Dickson
//StudentID: 1225056560
//Lecture: 10:25 Tue Thur
//Description: This is the Play list class which defines various operations to perform on a playlist.
// 

public class Playlist {
    String name;
    Song first;
    public Playlist(){
        name = "library";
        first = Song.END;
    }

    public Playlist(String name) {
        this.name = name;
        first = Song.END;
    }

    public String getName() {
        return name;
    }

    public void add(Song song){ //This takes input from the user and stores it as a song [needs to be entered: (title) by (artist)]
    	Song temp = first;
    	if(first == Song.END) {
    		first = song;
    	}
    	else {
    		while(temp.next != Song.END) {
    			temp = temp.next;
    		}
    		temp.next = song;
    		song.next = song.END;
    	}
    }

    public int size() { //This method returns the number of songs in the current playlist.
        int count = 0;
        Song temp = first;
        //System.out.print("Starting size calculation");
        if(first != Song.END) {
        	count++;
        }
        while(temp.next != Song.END) {
        	temp = temp.next;
        	count++;
        	
        }
        return count;
    }

    public Song removeFirst() { //This method removes the very first element in the list.
        Song temp = first;
    	first = first.next;
        if(size() == 0) {
        	return temp;
        }
        else { 
        	return temp;
        }
    	
        
    }
 
    public int remove(Song song) { //Searches for a song and removes it
        Song temp = first;
        int count = 0;
        int numSongs = size();
        while(temp != Song.END) {
        	
        	count++;
        	//System.out.println("Interation: " + count);
        	if(temp.next.toString().equals(song.toString())) {
        		temp.next = temp.next.next;
        		
        		return count;
        	}
        	temp = temp.next;
        }
        
    	
    	return -1;
    }

    public Song head() {		//Gets head or first element
        return first;
    }

    public int getPosition(Song song) {
    	Song temp = first;
    	int count = 0;
    	//System.out.println("Starting search");
        while(temp.next != Song.END) {//Iterates through list
        	temp = temp.next;
        	count++;
        	if(temp.toString().equals(song.toString())) {
        		//System.out.println("Iteration:" + count);
        		return count;
        		
        	}
        }
        //System.out.println("Failed condition");
        return -1;
        /*if(temp.next == Song.END) {				//Checks very last element
        	if(temp.toString().equals(song.toString())) {
        		count = size();
        		return count;
        	}
        	else {
        		return -1;
        	}
        }
        else { 
        	return -1;
        }*/
        						//This happens if no song is detected to be a match
    }

    public String listSongs() {			//This lists out current songs in the current play list, and prints the total number;
        if(first != Song.END) {
        	String listString = "";
        	Song temp = first;
        	while(temp != Song.END) {
        		listString+=(temp.toString() + "\n");
        		temp = temp.next;
        	}
        	listString+="\nTotal songs: " + size() + "."; 
        	return listString;
        }
        else { 
        	return "No songs in playlist";
        }
    }
}
