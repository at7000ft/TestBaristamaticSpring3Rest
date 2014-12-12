package com.taters.bm.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taters.bm.domain.Drink;
import com.taters.bm.domain.DrinkList;
import com.taters.bm.domain.InventoryEntry;
import com.taters.bm.domain.InventoryEntryList;
import com.taters.bm.services.IBaristaService;

/**
 * <p>
 * Title: BarisatmaticController.java
 * </p>
 * <p>
 * Description: Access Drinks and InventoryEntries using REST, results can be returned as XML or HTML depending
 * on value in HTTP Accept Header, (application/xml or html/text). Must use curl to send xml rest requests as browsers
 * don't allow setting accept headers.
 * 
 * </p>
 * <p>
 * Nov 18, 2010
 * </p>
 * 
 * @author RHOLLAND DRS Technologies Inc.
 * 
 * 
 */
// Make this class a SpringMvc controller
@Controller
@RequestMapping("/barista")
public class BarisatmaticController {

	private IBaristaService baristaService;

	/**
	 * @param baristaService
	 */
	@Autowired
	public BarisatmaticController(IBaristaService baristaService) {
		super();
		System.out.println("BarisatmaticController>>const: called, baristaService - " + baristaService);
		this.baristaService = baristaService;
	}


	// Invoked at http://localhost:8080/TestBaristamaticSpring3Mvc/barista/restock
	@RequestMapping(value = "/restock", method = RequestMethod.GET)
	public void restock() {
		System.out.println("BarisatmaticController>>restockYY: called");
		baristaService.reStockInventory();
		 
	}

	// Invoked using curl with:  
	//  curl -H 'Accept: application/xml' http://localhost:8080/TestBaristamaticSpring3Rest/barista/drinks
	@RequestMapping(value = "/drinks", method = RequestMethod.GET)
	public String drinks(Model model) {
		System.out.println("BarisatmaticController>>drinksXX: called");
		List<Drink> drinks = baristaService.getDrinks();
		DrinkList dlist = new DrinkList(drinks);
		model.addAttribute("drinks", dlist);
		return "drinklist";
	}
	
	// Invoked at http://localhost:8080/TestBaristamaticSpring3Mvc/barista/inventory
	//Call with curl -H 'Accept: application/xml' http://localhost:8080/TestBaristamaticSpring3Rest/barista/inventory
	@RequestMapping(value = "/inventory", method = RequestMethod.GET)
	public String inventory(Model model) {
		System.out.println("BarisatmaticController>>inventory: called");
 
		List<InventoryEntry> inventory = baristaService.getInventoryAvailable();
		InventoryEntryList ieList = new InventoryEntryList(inventory);
		model.addAttribute("inventory", ieList);
		return "inventorylist";
	}

	//Invoked at http://localhost:8080/TestBaristamaticSpring3Mvc/barista/2
	@RequestMapping(value = "{drinkNumber}", method = RequestMethod.GET)
	public void orderDrink(@PathVariable("drinkNumber")
	String drinkNumber) {
		System.out.println("BarisatmaticController>>orderDrink: called with " + drinkNumber);
		baristaService.orderDrink(drinkNumber);
	}
}
