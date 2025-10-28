package pack;

public class Event {
	private String eventName;
	private String venue;
	private int maxAttendance;
	private int attendance;
	private double budget;
	private String notes;
	
	//constructor
	Event(String eventName, String venue, int maxAttendance, int attendance, double budget, String notes){
		this.eventName = eventName;
		this.venue = venue;
		this.maxAttendance = maxAttendance;
		this.attendance = attendance;
		this.budget = budget;
		this.notes = notes;
	}
	
	//getters and setters
	public String getEventName() {return eventName;}
	public void setEventName(String eventName) {this.eventName = eventName;}
	public String getVenue() {return venue;}
	public void setVenue(String venue) {this.venue = venue;}
	public int getMaxAttendance() {return maxAttendance;}
	public void setMaxAttendance(int maxAttendance) {this.maxAttendance = maxAttendance;}
	public int getAttendance() {return attendance;}
	public void setAttendance(int attendance) {this.attendance = attendance;}
	public double getBudget() {return budget;}
	public void setBudget(double budget) {this.budget = budget;}
	public String getNotes() {return notes;}
	public void setNotes(String notes) {this.notes = notes;}
	
	
}
