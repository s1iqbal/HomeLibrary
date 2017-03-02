//Coded by Drew Cornfield and Saad Iqbal
//Class that defines the Media Object


public class Media {
 
 //Local Variables for the Media object	
 Boolean available = true;
 String Title, Type, Author, Location, BorrowerName;
 int Year;
 int Availibility;
 
 //Constructor for a Media Object
 public Media(String type, String title , String author, int year, String location, String borrowername){
	 
	  this.Title = title;
	  this.Author = author;
	  this.Year = year;
	  this.Location = location;
	  this.Type = type;
	  this.BorrowerName = borrowername;
	  Availibility = 1;
 }
 
 //The functions below return the corresponding information for the Media object
 public String getTitle()
 {
	 	return Title;
}
 
public String getType()
 {
	   return Type;
 }

public String getAuthor()
{
	   return Author;
}
public String getBorrowerName() {
	return BorrowerName;
}
public String getItemLocation() {
	return Location;
}

 
 public void changeAvailablity()
 {
  if (Availibility == 0) Availibility = 1;
  else Availibility = 1; 
 }

}
