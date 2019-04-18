package com.bridgelabz.inventoryImpl;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.common.exception.CustomException;
import com.bridgelabz.inventoryinterface.InventoryInterface;
import com.bridgelabz.inventorymodel.Inventory;
import com.bridgelabz.util.FunctionalUtil;
import com.google.gson.Gson;

public class InventoryImpl implements InventoryInterface {

	List<Inventory> inventories = new ArrayList<>();

	public InventoryImpl() {
		fileRead();
	}

	public void fileRead() {
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new FileReader("C:\\Users\\Divya\\Desktop\\d\\inventory.json"));
			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(jsonObject);
			JSONArray jsonArray = (JSONArray) jsonObject.get("listOfInventories");
			for (Object obj1 : jsonArray) {
				Inventory inventory = new Inventory((JSONObject) obj1);
				inventories.add(inventory);
			}
		} catch (Exception e) {
			throw new CustomException("Error reading inventory ", e);
		}
	}

	@Override
	public void addInventory(String name, int weight, double price) {
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setWeight(weight);
		inventory.setPrice(price);
		inventories.add(inventory);
		inventories.forEach(inventory1 -> System.out.println(inventory1.toString()));
	}

	@Override
	public void calculateInventory() {
		
		inventories.forEach(inventory -> {
			System.out.println(
					"Total price of " + inventory.getName() + " is " + (inventory.getPrice() * inventory.getWeight()));
		});
	}

	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(inventories);
		try {
			FileWriter file = new FileWriter("C:\\Users\\Divya\\Desktop\\d\\inventory.json");
			file.write("{\"listOfInventories\":" + json + "}");
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void removeInventory() {
		System.out.println("Enter the element to be removed");
		String removekey = FunctionalUtil.inputString();
		inventories.removeIf(inventory -> inventory.getName().equals(removekey));
		writeFile();
		System.out.println("Element successfully removed");
	}
}
