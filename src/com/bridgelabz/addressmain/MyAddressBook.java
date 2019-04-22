package com.bridgelabz.addressmain;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.addressImpl.AddressManagerImpl;
import com.bridgelabz.addressinterface.AddressManager;
import com.bridgelabz.util.FunctionalUtil;

public class MyAddressBook {

	public static void main(String[] args) {
		AddressManager adressImp = new AddressManagerImpl();
		AddressManagerImpl imp = new AddressManagerImpl();
		{ 
			try {
				imp.readfile();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Input choice");
			int input = FunctionalUtil.inputinteger();
			switch (input) {
			case 1:

				imp.addPerson("Brad", "Flynn", "St.Marks", "Phoenix", "Arizona", 276621l, 4375431620l);
				break;

			case 2:

				imp.deletePerson();
				break;

			case 3:

				imp.sortByLastName();
				break;

			case 4:

				imp.sortByZipCode();
				break;

			}
			imp.writeFile();

		}

	}
}
