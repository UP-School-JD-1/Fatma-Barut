package ch13q1;

public enum BookType {
	ADVENTURE("adventure"), CLASSICS("classics"), HORROR("horror"), FANTASY("fantasy");
	
	private String description;
	BookType(final String description) {
        this.description = description;
    }
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
