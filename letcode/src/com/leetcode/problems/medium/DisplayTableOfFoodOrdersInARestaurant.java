package com.leetcode.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * brunolima on May 20, 2021
 * 
 * Given the array orders, which represents the orders that customers have done
 * in a restaurant. More specifically orders[i]=[customerNamei,tableNumberi,foodItemi] where:
 *  - customerNamei is the name of the customer, 
 *  - tableNumberi is the table customer sit at,
 *  - foodItemi is the item customer orders.
 *  
 * Return the restaurant's “display table”. The “display table” is a table whose
 * row entries denote how many of each food item each table ordered. 
 * 
 * The first column is the table number and the remaining columns correspond to each food
 * item in alphabetical order. 
 * 
 * The first row should be a header whose first column is “Table”, followed by the names of the food items. 
 * 
 * Note that the customer names are not part of the table. Additionally, the rows should be
 * sorted in numerically increasing order.
 * 
 * Example 1:
 * Input: orders = [
 * 	["David","3","Ceviche"],
 * 	["Corina","10","Beef Burrito"],
 * 	["David","3","Fried Chicken"],
 * 	["Carla","5","Water"],
 * 	["Carla","5","Ceviche"],
 * 	["Rous","3","Ceviche"]]
 * 
 * Output: [
 * ["Table"	,"Beef Burrito","Ceviche",	"Fried Chicken"	,"Water"],
 * ["3"		,"0"			,"2"		,"1"			,"0"],
 * ["5"		,"0"			,"1"		,"0"			,"1"],
 * ["10"	,"1"			,"0"		,"0"			,"0"]]
 * 
 * Explanation: The displaying table looks like: 
 * Table,	Beef Burrito,	Ceviche, Fried Chicken,	Water 
 * 3 	,	0 				,2 		,1 		,		0 
 * 5 	,	0 				,1 		,0 		,		1 
 * 10 	,	1 				,0 		,0		,		0 
 * 
 * For the table 3: David orders "Ceviche" and "Fried Chicken", and Rous
 * orders "Ceviche". 
 * 
 * For the table 5: Carla orders "Water" and "Ceviche". 
 * For the table 10: Corina orders "Beef Burrito". 
 * 
 * Example 2:
 * 
 * Input: orders = [
 * 	["James","12","Fried Chicken"],
 * 	["Ratesh","12","Fried Chicken"],
 * 	["Amadeus","12","Fried Chicken"],
 * 	["Adam","1","Canadian Waffles"],
 * 	["Brianna","1","Canadian Waffles"]] 
 * 
 * Output: [
 * ["Table",	"Canadian Waffles"	,"Fried Chicken"],
 * ["1"			,"2"				,"0"],
 * ["12"		,"0"				,"3"]] 
 * 
 * Explanation: 
 * For the table 1: Adam and Brianna order "Canadian Waffles". 
 * For the table 12: James, Ratesh and Amadeus order "Fried Chicken". 
 * 
 * Example 3:
 * Input: orders = [
 * 	["Laura","2","Bean Burrito"],
 * 	["Jhon","2","Beef Burrito"],
 * 	["Melissa","2","Soda"]] 
 * 
 * Output: [
 * ["Table"	, "Bean Burrito", "Beef Burrito","Soda"],
 * ["2"		, "1"			, "1"			,"1"]]
 * 
 * Constraints:
 * 1 <= orders.length <= 5 * 10^4 
 * 
 * orders[i].length == 3 
 * 
 * 1 <= customerNamei.length, foodItemi.length <= 20 customerNamei and foodItemi
 * consist of lowercase and uppercase English letters and the space character.
 * 
 * tableNumberi is a valid integer between 1 and 500.
 */

public class DisplayTableOfFoodOrdersInARestaurant {
	
	public static void main(String[] args) {
		List<List<String>> orders = new ArrayList<List<String>>();
		
		orders.add(Arrays.asList("David", "3", "Ceviche"));
		orders.add(Arrays.asList("Corina", "10", "Beef Burrito"));
		orders.add(Arrays.asList("David", "3", "Fried Chicken"));
		orders.add(Arrays.asList("Carla", "5", "Water"));
		orders.add(Arrays.asList("Carla", "5", "Ceviche"));
		orders.add(Arrays.asList("Rous","3","Ceviche"));
		
		DisplayTableOfFoodOrdersInARestaurant dt = new DisplayTableOfFoodOrdersInARestaurant();
		dt.displayTable(orders);
	}
	
    public List<List<String>> displayTable(List<List<String>> orders) {
    	System.out.println(orders);
    	
    	Set<String> tables = new HashSet<String>();
    	orders.forEach(order -> tables.add(order.get(1)));
    	System.out.println(tables);
    	
    	List<String> columns = new ArrayList<String>();
    	columns.add("Table");
    	
    	for (List<String> order : orders) {
			if (!columns.contains(order.get(2))) {
				columns.add(order.get(2));
			}
		}
    	
    	System.out.println(columns);
    	
    	
    	
//    	HashMap<String, Integer> mapFoodItem = new HashMap<String, Integer>();
//    	
//    	for (List<String> order : orders) {
//			System.out.println("Client : "+ order.get(0) + ", Table: " + order.get(1) + ", Order Item: " + order.get(2));
//			
//			if (!mapFoodItem.containsKey(order.get(1))) {
//				System.out.println("Adding table: " + order.get(1) + ", foodItem: " + order.get(2));
//				mapFoodItem.put(order.get(1), 1);
//			} else {
//				Integer totalFoodItem = mapFoodItem.get(order.get(1));
//				mapFoodItem.put(order.get(1), totalFoodItem + 1);
//			}
//		}
//    	
//    	System.out.println(mapFoodItem);
    	
    
     
    	return null;
    }

}
