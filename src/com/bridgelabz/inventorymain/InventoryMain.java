package com.bridgelabz.inventorymain;

import java.io.FileNotFoundException;
import java.util.Scanner;
import com.bridgelabz.inventoryImpl.InventoryImpl;
import com.bridgelabz.inventoryinterface.InventoryInterface;

public class InventoryMain
{
	public static void main(String[] args) 
	{
		InventoryInterface inventoryImp = new InventoryImpl();
		InventoryImpl imp=new InventoryImpl();
		{
			
			imp.fileRead();
//			imp.addInventory("lentils", 12, 54);
			imp.calculateInventory();
			imp.removeInventory();
			imp.writeFile();
		}
	}
}