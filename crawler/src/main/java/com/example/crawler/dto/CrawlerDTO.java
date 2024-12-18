package com.example.crawler.dto;

import java.util.HashMap;
import java.util.Map;

public class CrawlerDTO {
	private int stockId;
	private String stockRank;
	private String stockName;
	private String stockPrice;
	private String stockPrevPrice;
	private String fluctuationRate;
	private String tradingVolume;
	private String stockOpen;
	private String stockHigh;
	private String stockLow;
	private String stockDay;
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockRank() {
		return stockRank;
	}
	public void setStockRank(String stockRank) {
		this.stockRank = stockRank;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(String stockPrice) {
		this.stockPrice = stockPrice;
	}
	public String getStockPrevPrice() {
		return stockPrevPrice;
	}
	public void setStockPrevPrice(String stockPrevPrice) {
		this.stockPrevPrice = stockPrevPrice;
	}
	public String getFluctuationRate() {
		return fluctuationRate;
	}
	public void setFluctuationRate(String fluctuationRate) {
		this.fluctuationRate = fluctuationRate;
	}
	public String getTradingVolume() {
		return tradingVolume;
	}
	public void setTradingVolume(String tradingVolume) {
		this.tradingVolume = tradingVolume;
	}
	public String getStockOpen() {
		return stockOpen;
	}
	public void setStockOpen(String stockOpen) {
		this.stockOpen = stockOpen;
	}
	public String getStockHigh() {
		return stockHigh;
	}
	public void setStockHigh(String stockHigh) {
		this.stockHigh = stockHigh;
	}
	public String getStockLow() {
		return stockLow;
	}
	public void setStockLow(String stockLow) {
		this.stockLow = stockLow;
	}
	public String getStockDay() {
		return stockDay;
	}
	public void setStockDay(String stockDay) {
		this.stockDay = stockDay;
	}
	public Map<String, Object> topStock() {
	    Map<String, Object> params = new HashMap<>();
	    params.put("stockRank", stockRank);
	    params.put("stockName", stockName);
	    params.put("stockPrice", stockPrice);
	    params.put("stockPrevPrice", stockPrevPrice);
	    params.put("fluctuationRate", fluctuationRate);
	    params.put("tradingVolume", tradingVolume);
	    params.put("stockOpen", stockOpen);
	    params.put("stockHigh", stockHigh);
	    params.put("stockLow", stockLow);
	    return params;
	}
}