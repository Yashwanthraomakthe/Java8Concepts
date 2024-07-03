package stream_Task08;

public class Product {
	private String name;
	private int price;
	private String category;
	private int grade;

	public Product(String name, int price, String category, int grade) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.grade = grade;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	 @Override
	    public String toString() {
	        return "Product{" +
	                "name='" + name + '\'' +
	                ", price=" + price +
	                ", category='" + category + '\'' +
	                ", grade='" + grade + '\'' +
	                '}';
	    }
}