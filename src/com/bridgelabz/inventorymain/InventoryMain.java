package com.bridgelabz.inventorymain;

import com.bridgelabz.inventoryImpl.InventoryImpl;

public class InventoryMain
{
	public static void main(String[] args) 
	{
		InventoryImpl imp=new InventoryImpl();
		{
			
			imp.readfile();
			imp.addInventory("lentils", 12, 54);
			imp.calculateInventory();
			imp.removeInventory();
			imp.writeFile();
		}
	}
}