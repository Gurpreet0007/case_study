package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Ipo {
	@Id
	@GeneratedValue
	private long id;
	@OneToOne(mappedBy="ipo")
	private Company company;
	@ManyToMany
	private List<StockExchange> stockExchange=new ArrayList<>();
	
	private int price;
	
private int number;

	private String date;
	private String time;
	public List<StockExchange> getStockExchange()
	{
		return stockExchange;
	}
	public void addStockExchange(StockExchange stockExchange)
	{
		this.stockExchange.add(stockExchange);
	}
	public void removeStockExchange(StockExchange stockExchange)
	{
		this.stockExchange.remove(stockExchange);
	}
	
	public Company getcompany() {
		return company;
	}
	public void setcompany(Company company) {
		this.company = company;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}


}
