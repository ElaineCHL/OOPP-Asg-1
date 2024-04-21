package application;

public abstract class Product {

	private String name;
	private double price;
	private int qty;
	private int item_num;
	private boolean status;

	public Product() {
	}

	public Product(int i, String n, int q, double p) {
		item_num = i;
		name = n;
		qty = q;
		price = p;
		status = true;
	}

	public int getItemNum() {
		return item_num;
	}

	public void setItemNum(int item_num) {
		this.item_num = item_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getTotalInventoryValue() {

		return price * qty;
	}

	public void addQty(int quantityInStock) {

		if (status)
			qty += quantityInStock;
		else
			System.out.println("Not allow to add stock to a discontinued product line.");

	}

	public void deductQty(int quantityInStock) {

		if (status)
			qty -= quantityInStock;
		else
			System.out.println("Not allow to add stock to a discontinued product line.");

	}

	@Override
	public String toString() {
		return "Item number : " + getItemNum() + "Product name : " + getName() + "Quantity available :" + getQty()
				+ "Price (RM) : " + getPrice() + "Inventory value (RM) : " + getTotalInventoryValue()
				+ "Product status: " + status;
	}

}