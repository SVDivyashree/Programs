package com.bridgelabz.stockaccountinterface;

public interface StockAccountInterface 
{
	public void createStockAccount();
	public double valueOf();
	public void buy(int amount,String symbol);
	public void sell(int amount,String symbol);
	public void save();
	public void printReport();
	

}
