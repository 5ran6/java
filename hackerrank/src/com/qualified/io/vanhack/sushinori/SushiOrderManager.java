package com.qualified.io.vanhack.sushinori;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * brunolima on Apr 30, 2021
 * 
 */

public class SushiOrderManager {

	private int totalSeats;
	private ArrayList<Queue<SushiItem>> seats;
	private Queue<SushiItem> sushiSorteds;
	private boolean thereIsNewOrders = false;

	public SushiOrderManager() {
		totalSeats = 16;
		seats = new ArrayList<>();
		sushiSorteds = new LinkedList<SushiItem>();

		for (int i = 0; i < totalSeats; i++) {
			seats.add(new LinkedList<SushiItem>());
		}
	}

	public void addOrder(ArrayList<SushiOrder> request) {
		for (SushiOrder order : request) {
			for (String roll : order.getMenuItemIds()) {
				seats.get(order.getSeatId() - 1).offer(new SushiItem(order.getSeatId(), roll));

			}
		}

		thereIsNewOrders = true;
	}

	public SushiItem nextItem() {
		if (thereIsNewOrders) {
			sortSushiItems();
		}

		return sushiSorteds.poll();
	}

	private void sortSushiItems() {
		int currentSeat = 0;
		boolean thereIsMoreItems = false;

		while (currentSeat < totalSeats) {
			Queue<SushiItem> currentSeatQueue = seats.get(currentSeat);
			SushiItem item = currentSeatQueue.poll();
			currentSeat++;

			if (currentSeatQueue.size() > 0) {
				thereIsMoreItems = true;
			}

			if (item != null) {
				sushiSorteds.add(item);
			}

			if (thereIsMoreItems && currentSeat == 16) {
				currentSeat = 0;
				thereIsMoreItems = false;
			}
		}
	}

}
