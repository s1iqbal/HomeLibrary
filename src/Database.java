 
//Coded by Drew Cornfield and Saad Iqbal
import java.util.LinkedList;

public class Database {
	//creates a linkedlist to store all the media objects
 LinkedList<Object> storage = new LinkedList<Object>();

 //initializes the media objects and places them inside storage
public Database() {
  Media element1 = new Media("Tape", "A new Moon", "john", 1995, "Being Lended", "Saad");
  Media element2 = new Media("Tape", "Dogs bark", "simon todd", 2004, "Being Lended", "Drew");
  Media element3 = new Media("Vinyl", "Chads Worst Christmas Tunes", "Chad morrison", 2011, "Being Lended", "Will");
  Media element4 = new Media("Vinyl", "Doesnt Seem too bad", "Sandman Doug", 1983, "Bookshelf C", "Saad");
  Media element5 = new Media("CD", "KidsBop 13", "KidsBop Inc", 2004, "Bookshelf B", "In Library");
  Media element6 = new Media("CD", "Elvis Best Of'", "Elvis", 1969, "Bookshelf A", "In Library");
  Media element7 = new Media("DVD", "The Simpsons season 5", "Fox", 1994, "Bookshelf C", "In Library");
  Media element8 = new Media("DVD", "The Big Bang Theory season 1", "Warner Bros", 2008, "Bookshelf C", "Saad");
  Media element9 = new Media("Blu-Ray", "Fish", "Marine Experts", 2016, "Bookshelf C", "Sarah");
  Media element10 = new Media("Blu-Ray", "Stand up Comedy", "House of Laughs", 2013, "Bookshelf C", "Saad");
  storage.add(element1);
  storage.add(element2);
  storage.add(element3);
  storage.add(element4);
  storage.add(element5);
  storage.add(element6);
  storage.add(element7);
  storage.add(element8);
  storage.add(element9);
  storage.add(element10);
 }

//function to initialize a new media object
 public void addMedia(String type, String name, String Artist, int year, String location, String borrower) {
 //int incrementer = 11;
  Media element11 = new Media(type, name, Artist, year, location, borrower);
  storage.add(element11);
 }
 
 //function to find the location for the media searched
 public String findLocation(String name) { 
	for (int i = 0; i < storage.size(); i++) {
		if ( (((Media) storage.get(i)).getTitle()).equalsIgnoreCase(name)) {
		return ((Media) storage.get(i)).getItemLocation();
		}
	}
	return null;
 }

 //function to find the title of the media searched based on the person borrowing it
public String findItem(String name) {
	for (int i = 0; i < storage.size(); i++) {
		if ( (((Media) storage.get(i)).getBorrowerName()).equalsIgnoreCase(name)) {
		return ((Media) storage.get(i)).getItemLocation();
		}
	}
	return null;
}

//function to find the person borrowing the media
public String findBorrowerName(String name) {
for (int i = 0; i < storage.size(); i++) {
	if ( (((Media) storage.get(i)).getTitle()).equalsIgnoreCase(name)) {
	return ((Media) storage.get(i)).getBorrowerName();
	}
}
return null;

}

//Function to find the borrowedItems based on the person searched
//It will return a array of strings. It checks for the person, and finds all the media
//inside storage to see if that media is being borrowed by that person.
//Then it stores that media that the person is borrowing to the array, then returns that array
public String[] findBorrowedItems(String name) {
	String list[] = new String[storage.size()];
	for (int i = 0; i < list.length; i++) {
		if ((((Media) storage.get(i)).getBorrowerName()).equalsIgnoreCase(name)) {
			list[i]=(((Media) storage.get(i)).getTitle());
		}
		else {
			continue;
		}
	}
	return list;
}

//function to get the size of the linkedlist storage
public int getSize() {
	return storage.size();
}


//testing ground for loaning media
 public void loanMedia(Media takeaway) {
  takeaway.changeAvailablity();
 }

}
