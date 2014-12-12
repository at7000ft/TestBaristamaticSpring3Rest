package com.taters.bm.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <p> Title: InventoryEntryList.java </p>
 * <p> Description:   
 *
 * </p>
 * <p> Nov 23, 2010</p>
 * @author RHOLLAND
 * DRS Technologies Inc.
 *
 *
 */
@XmlRootElement(name = "items")
public class InventoryEntryList {
	private int count;
	private List<InventoryEntry> items;
	
	public InventoryEntryList(List<InventoryEntry> items) {
		this.items = items;
		this.count = items.size();
	}

	/**
	 * 
	 */
	public InventoryEntryList() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the items
	 */
	@XmlElement(name = "items")
	public List<InventoryEntry> getItems() {
		return items;
	}

	/**
	 * @param Set items  
	 */
	public void setItems(List<InventoryEntry> items) {
		this.items = items;
	}
	
	
}
