package com.qualified.io.vanhack.sushinori;

import java.util.ArrayList;

/**
*
* brunolima on Apr 30, 2021
* 
*/

public class SushiOrder {
	
	private int seatId;
	private ArrayList<String> menuItemIds;
	
    public SushiOrder(int seatId, ArrayList<String> menuItemIds) {
    	this.seatId = seatId;
    	this.menuItemIds = menuItemIds;
    }
    
    public int getSeatId() {
    	return this.seatId;
    }
    
    public ArrayList<String> getMenuItemIds() {
    	return this.menuItemIds;
    }

	@Override
	public String toString() {
		return "SushiOrder [seatId=" + seatId + ", menuItemIds=" + menuItemIds + "]";
	}

}

