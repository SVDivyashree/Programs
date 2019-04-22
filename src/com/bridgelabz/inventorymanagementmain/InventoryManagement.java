package com.bridgelabz.inventorymanagementmain;



import java.io.FileNotFoundException;

import com.bridgelabz.inventorymanagementimpl.InventoryManagerImpl;
import com.bridgelabz.inventorymanagementinterface.InventoryManager;
import com.bridgelabz.util.FunctionalUtil;

public class InventoryManagement {

	public static void main(String[] args) {
		InventoryManager imp = new InventoryManagerImpl();
		
		
		imp.calculateInventoryPrice();
		
	}

}
