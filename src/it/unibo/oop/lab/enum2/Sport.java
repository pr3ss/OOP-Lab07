/**
 * 
 */
package it.unibo.oop.lab.enum2;

enum Place{
	INDOOR,OUTDOOR
}

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET(Place.INDOOR,5,"Basket"),
	VOLLEY(Place.OUTDOOR,5,"Volley"),
	TENNIS(Place.OUTDOOR,4,"Tennis"),
	BIKE(Place.OUTDOOR,1,"Bike"),
	F1(Place.OUTDOOR,1,"Formula1"),
	MOTOGP(Place.OUTDOOR,1,"MotoGP"),
	SOCCER(Place.OUTDOOR,15,"Soccer");
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final Place place;
	private final int Nteams;
	private final String name;

    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport(final Place place, final int nTeams, final String name) {
		this.name = name;
		this.place = place;
		this.Nteams = nTeams;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	
	public boolean isIndividualSport() {
		return this.Nteams==1 ? true:false;
	}
	
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR ? true:false;
	}
	
	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return "Sport: "+this.name+" nMembers= "+this.Nteams+" Place: "+this.place.name();
	}
	
}
