package com.bridgelabz.inventorymanagementmain;



import java.io.FileNotFoundException;

import com.bridgelabz.inventorymanagementimpl.InventoryManagerImpl;
import com.bridgelabz.inventorymanagementinterface.InventoryManager;

public class InventoryManagement {

	public static void main(String[] args) throws FileNotFoundException {
		InventoryManager imp = new InventoryManagerImpl();
		imp.calculateInventoryPrice();
		
	}

}
