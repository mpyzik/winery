package dbapi;

import java.util.Arrays;
import java.util.LinkedList;

public class Wine {

	private int id;
	private String name;
	private String grapes;
	private String color;
	private int produced;
	private int sold;
	private int basePrice;
	private int productionCost;
	private int year;
	private int protectedOrigin;
	private int forSale;

	public Wine(int id, String name, String grapes, String color, int produced,
			int sold, int basePrice, int productionCost, int year,
			int protectedOrigin, int forSale) {

		this.id = id;
		this.name = name;
		this.grapes = grapes;
		this.color = color;
		this.produced = produced;
		this.sold = sold;
		this.basePrice = basePrice;
		this.productionCost = productionCost;
		this.year = year;
		this.protectedOrigin = protectedOrigin;
		this.forSale = forSale;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrapes() {
		return grapes;
	}

	public void setGrapes(String grapes) {
		this.grapes = grapes;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getProduced() {
		return produced;
	}

	public void setProduced(int produced) {
		this.produced = produced;
	}

	public int getSold() {
		return sold;
	}

	public void setSold(int sold) {
		this.sold = sold;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public int getProductionCost() {
		return productionCost;
	}

	public void setProductionCost(int productionCost) {
		this.productionCost = productionCost;
	}

	public int getId() {
		return id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getForSale() {
		return forSale;
	}

	public void setForSale(int forSale) {
		this.forSale = forSale;
	}

	public int getProtectedOrigin() {
		return protectedOrigin;
	}

	public void setProtectedOrigin(int protectedOrigin) {
		this.protectedOrigin = protectedOrigin;
	}

	public LinkedList<String> getData() {
		return new LinkedList<String>(Arrays.asList(name,
				Integer.toString(year), Integer.toString(produced),
				Integer.toString(sold), Integer.toString(forSale),
				Integer.toString(productionCost), Integer.toString(basePrice),
				color, grapes));
	}

}
