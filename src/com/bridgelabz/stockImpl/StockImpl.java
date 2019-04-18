package com.bridgelabz.stockImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.addressmodel.AddressBook;
import com.bridgelabz.stockData.StockData;
import com.bridgelabz.stockModel.Stock;

import com.google.gson.Gson;

public class StockImpl implements StockData {
	List<Stock> stockDetails = new ArrayList<>();

	public void readfile() {

		JSONParser parser = new JSONParser();
		{
			try {
				Object obj = parser.parse(new FileReader("C:\\Users\\Divya\\Desktop\\d\\stock.json"));
				JSONObject jsonObject = (JSONObject) obj;
				System.out.println(jsonObject);
				JSONArray jsonArray = (JSONArray) jsonObject.get("ShareHolders");

				for (Object obj1 : jsonArray) {
					Stock parameters= new Stock();
                    String stockCompany = (String) ((JSONObject) obj1).get("stockCompany");
					double noOfShares = (long) ((JSONObject) obj1).get("noOfShares");
				    double sharePrice = (double) ((JSONObject) obj1).get("sharePrice");
				   
				    parameters.setStockCompany(stockCompany);
				    parameters.setNoOfShares(noOfShares);
				    parameters.setSharePrice(sharePrice);
					stockDetails.add(parameters);
					}
			}
		catch (FileNotFoundException e) {
			e.printStackTrace(); 
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}}
			}
	@Override
	public void calculateStock() {
		stockDetails.forEach(stocks -> {
			System.out.println(
					"Total price of " + stocks.getStockCompany() + " is " + (stocks.getNoOfShares() * stocks.getSharePrice()));
		});
	}

	@Override
	public void totalStockValue()
	{
		double sum = 0;
		for (Stock stock : stockDetails) {
			 sum = sum + (stock.getSharePrice() * stock.getNoOfShares());
		}
		System.out.println("Total Gain of a ShareHolder = " + sum);
	

	}
	public void writeFile() {
		Gson gson = new Gson();
		String json = gson.toJson(stockDetails);
		try {
			FileWriter file = new FileWriter("C:\\Users\\Divya\\Desktop\\d\\stock.json");
			file.write("{\"ShareHolders\":" + json + "}");
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}