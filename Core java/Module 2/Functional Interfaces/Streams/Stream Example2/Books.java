package FunctionalInterfaces;

class Books{
	private String Genre;
	private Integer year;
	private double price;
	private String name;
	
	public Books(String Genre, int year, double price, String name) {
		this.Genre = Genre;
		this.year = year;
		this.price = price;
		this.name = name;
	}

	public String getGenre() {
		return Genre;
	}

	public Integer getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
		
}
