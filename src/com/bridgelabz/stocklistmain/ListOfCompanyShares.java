package com.bridgelabz.stocklistmain;

import java.util.LinkedList;

import com.bridgelabz.stocklistimpl.CompanyShareImpl;
import com.bridgelabz.stocklistinterface.CompanyShareInterface;
import com.bridgelabz.stocklistmodel.CompanyShare;
import com.bridgelabz.util.AlgorithmsUtil;

public class ListOfCompanyShares {

	public static void main(String[] args) {

		CompanyShareInterface ref = new CompanyShareImpl();
		LinkedList<CompanyShare> shares = new LinkedList<>();
		ref.fileRead();
		ref.add();
		System.out.println("enter the name you want to delete");
		String name = AlgorithmsUtil.inputString();
		ref.remove(name);
		ref.writeFile();
	}
}
