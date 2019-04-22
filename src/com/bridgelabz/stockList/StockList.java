package com.bridgelabz.stockList;

import java.util.List;

import com.bridgelabz.util.CustomLinkedList;

public class StockList 
{
	private String comapanyName;
	private Long noOfShare;
	private List<StockList> list;
	public List<StockList> getList() {
		return list;
	}
	public void setList(CustomLinkedList linkedList) {
		this.list = (List<StockList>) linkedList;
	}
	public String getComapanyName() {
		return comapanyName;
	}
	public String setComapanyName(String comapanyName) {
		return this.comapanyName = comapanyName;
	}
	public Long getNoOfShare() {
		return noOfShare;
	}
	public Long setNoOfShare(Long noOfShare2) {
		return this.noOfShare = noOfShare2;
	}
	public String toString() {
	    return   "name  : "+comapanyName+"\n"
	            +"number of share: "+noOfShare+"\n";
	}
}

