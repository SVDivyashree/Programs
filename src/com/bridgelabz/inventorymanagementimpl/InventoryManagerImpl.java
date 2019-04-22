package com.bridgelabz.inventorymanagementimpl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.common.exception.CustomException;
import com.bridgelabz.inventorymanagementinterface.InventoryManager;
import com.bridgelabz.inventorymanagementmodel.InventoryFactory;
import com.bridgelabz.inventorymodel.Inventory;
import com.google.gson.Gson;

public class InventoryManagerImpl implements InventoryManager {
	private List<Inventory> riceItems;
	private List<Inventory> wheatItems;
	private List<Inventory> pulseItems;

	private Gson gson;

	public InventoryManagerImpl() {
		fileRead();
		this.gson = new Gson();
	}

	private void fileRead() {
		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader("C:\\Users\\Divya\\Desktop\\d\\InventoryManagement.json");
			Object obj = parser.parse(reader);

			JSONObject jsonObject = (JSONObject) obj;
			JSONArray riceArray = (JSONArray) jsonObject.get("rice");
			riceItems = getInventories(riceArray);
			JSONArray wheatArray = (JSONArray) jsonObject.get("wheat");
			wheatItems = getInventories(wheatArray);
			JSONArray pulseArray = (JSONArray) jsonObject.get("pulses");
			pulseItems = getInventories(pulseArray);

		} catch (Exception e) {
			throw new CustomException("File Reading failed ", e);
		}
	}

	private List<Inventory> getInventories(JSONArray array) {
		List<Inventory> inventories = new ArrayList<>();
		for (Object object : array) {
			Inventory inventory = new Inventory((JSONObject) object);
			inventories.add(inventory);
		}
		return inventories;
	}
     
	
		
	@Override
	public void calculateInventoryPrice() {
		double totalValueOfRice = getTotalValue(riceItems);
		double totalValueOfWheat = getTotalValue(wheatItems);
		double totalValueOfPulses = getTotalValue(pulseItems);
		System.out.println("Total value of rice is :- " + totalValueOfRice);
		System.out.println("Total value of wheat is :- " + totalValueOfWheat);
		System.out.println("Total value of pulses is :- " + totalValueOfPulses);
		writeInventoryToFile();
		// rice.stream().map(Inventory::getCalculatedValue).reduce(0.0, Double::sum);
	}

	private double getTotalValue(List<Inventory> items) {
		double totalValueOfItem = 0.0;
		for (Inventory inventory : items) {
			totalValueOfItem += inventory.getCalculatedValue();
		}
		return totalValueOfItem;
	}

	private void writeInventoryToFile() {
		try {
			InventoryFactory factory = new InventoryFactory(riceItems, wheatItems, pulseItems);
			String json = gson.toJson(factory);
			FileWriter file = new FileWriter("C:\\Users\\Divya\\Desktop\\d\\InventoryManagement.json");
			file.write(json);
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
