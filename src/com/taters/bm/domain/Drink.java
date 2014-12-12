package com.taters.bm.domain;

import java.math.BigDecimal;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p>
 * Title: Drink.java
 * </p>
 * <p>
 * Description:
 * 
 * </p>
 * <p>
 * Oct 14, 2010
 * </p>
 * 
 * @author RHOLLAND DRS Technologies Inc.
 * 
 * 
 */
//Allow the JAXB marshaller (Jaxb2Marshaller) to detects this objects fields and convert to XML
@XmlRootElement
public class Drink {

	private int number;
	private String name;
	private String displayName;
	private Map<String, Integer> recipe;
	private BigDecimal cost;
	private boolean inStock;

	/**
	 * @return the inStock
	 */
	public boolean getInStock() {
		return inStock;
	}

	/**
	 * @param Set inStock
	 */
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param Set number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param Set name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the displayName
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * @param Set displayName
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the recipe
	 */
	public Map<String, Integer> getRecipe() {
		return recipe;
	}

	/**
	 * @param Set recipe
	 */
	public void setRecipe(Map<String, Integer> recipe) {
		this.recipe = recipe;
	}

	/**
	 * @return the cost
	 */
	public BigDecimal getCost() {
		return cost;
	}

	/**
	 * @param Set cost
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
}
