package com.taters.bm.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * Title: DrinkList.java
 * </p>
 * <p>
 * Description: You need to declare a wrapper class for the Employee collection. The wrapper class is needed for JAXB 2
 * because it can't marshal the java.util.List class properly.
 * 
 * </p>
 * <p>
 * Nov 23, 2010
 * </p>
 * 
 * @author RHOLLAND DRS Technologies Inc.
 * 
 * 
 */
@XmlRootElement(name = "drinks")
public class DrinkList {
	private int count;
	
	
	private List<Drink> drinks;

	
	/**
	 * 
	 */
	public DrinkList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DrinkList(List<Drink> drinks) {
		this.drinks = drinks;
		this.count = drinks.size();
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param Set count
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the drinks
	 */
	@XmlElement(name = "drink")
	public List<Drink> getDrinks() {
		return drinks;
	}

	/**
	 * @param Set drinks
	 */
	public void setDrinks(List<Drink> drinks) {
		this.drinks = drinks;
	}
}
