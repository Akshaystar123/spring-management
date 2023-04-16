package com.seleniumexpress.di;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Shop {

	private int shopid;
	
	private List<String> books;
	
	private Set<String> mobiles;
	
	private Map<String, String> pens;

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public Set<String> getMobiles() {
		return mobiles;
	}

	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}

	public Map<String, String> getPens() {
		return pens;
	}

	public void setPens(Map<String, String> pens) {
		this.pens = pens;
	}

	@Override
	public String toString() {
		return "Shop [shopid=" + shopid + ", books=" + books + ", mobiles=" + mobiles + ", pens=" + pens + "]";
	}
}
