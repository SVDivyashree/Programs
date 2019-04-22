package com.bridgelabz.stockaccountmain;

import java.util.Scanner;

import com.bridgelabz.stockData.StockData;
import com.bridgelabz.stockImpl.StockImpl;
import com.bridgelabz.stockaccountimpl.StockAccountServiceImpl;
import com.bridgelabz.stockaccountinterface.StockAccountService;
import com.bridgelabz.util.FunctionalUtil;

public class MyStockAccount {

	public static void main(String[] args) {

		StockAccountService stockImp = new StockAccountServiceImpl();
	        {
            stockImp.createStockAccount();
		    System.out.println("Input choice");
			int input = FunctionalUtil.inputinteger();
			switch (input) {
			
            case 1:
            	System.out.println("Choose a stock Company you want to buy");
    			String StockCompany= FunctionalUtil.inputString();
    			System.out.println("Enter the amount you are buying for:");
    			double sharePrice= FunctionalUtil.inputDouble();
    			stockImp.buy(StockCompany,sharePrice);
    			stockImp.save();
    			break;
    		case 2:
                System.out.println("Choose a stock Company you want to sell");
    			String SellCompany= FunctionalUtil.inputString();
    			System.out.println("Enter the amount you are selling for:");
    			double sharePrice1= FunctionalUtil.inputDouble();
    			stockImp.sell(SellCompany,sharePrice1);
    			stockImp.save();
    			break;
       	  case 3:
                stockImp.valueOf();
                break;
       	  case 4:
       		    stockImp.printReport();
       		    break;
			}

			
			
	
             
			}
	

	}

}
