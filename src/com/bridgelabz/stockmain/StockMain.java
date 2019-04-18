package com.bridgelabz.stockmain;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import com.bridgelabz.stockData.StockData;
import com.bridgelabz.stockImpl.StockImpl;

public class StockMain {
	public static void main(String[] args) throws ParseException, FileNotFoundException {

		StockData stockImp = new StockImpl();
		StockImpl imp = new StockImpl();
		{
			Scanner sc = new Scanner(System.in);
			stockImp.readfile();
			
             
			}
		stockImp.calculateStock();
		stockImp.totalStockValue();
		
			//imp.writeFile();

		}

	}
