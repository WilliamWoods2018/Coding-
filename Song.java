
/*
 *File Name: Song.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Nov 19, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <Hold the attributes for the songs>
 *
 * @author wwoods
 *
 */
public class Song
{
	private String title;
	private String artist;
	/**
	 * @param title accepts the title for the song in the constructor
	 * @param artist accepts the artist for the song in the constructor
	 */
	public Song(String title, String artist)
	{
		
		this.title = title;
		this.artist = artist;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getArtist()
	{
		return artist;
	}
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	@Override
	public String toString()
	{
		return "Title: " + title + ", Artist: " + artist;
	}
	
	
	
}
