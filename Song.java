//Assignment #: Arizona State University Spring 2023 CSE205 #9
//Name: Arthur Dickson
//StudentID: 1225056560
//Lecture: 10:25 Tue Thur
//Description: This is the song class which defines the song with a title and an artist.
// 

public class Song {
    private String title;
    private String artist;
    public Song next;
    public static final Song END = new Song();

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        next = END;
    }

    // This is used to construct the END Table.
    private Song() {
        title = "";
        artist = "";
        next = this;
    }

    public boolean equals(Song other) {
        if (this.title.equals(other.title) 
         && this.artist.equals(other.artist))
            return true;
        return false;
    }

    public String toString(){
        return "Title: " + title + "\tArtist: " + artist;
    }
}
