package com.pragati.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="quotationdetails")
public class QuotationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int qty;
	
	private double rate;
	
	private double discountpercentage;
	
	private double discountamount;
	
	private double gstpercentage;
	
	private double gstamount;
	
	private double subtotal;
	
	private double total;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="products_id")
	private Products products;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="quotation_id")
	private Quotation quotation;

	//Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getDiscountpercentage() {
		return discountpercentage;
	}

	public void setDiscountpercentage(double discountpercentage) {
		this.discountpercentage = discountpercentage;
	}

	public double getDiscountamount() {
		return discountamount;
	}

	public void setDiscountamount(double discountamount) {
		this.discountamount = discountamount;
	}

	public double getGstpercentage() {
		return gstpercentage;
	}

	public void setGstpercentage(double gstpercentage) {
		this.gstpercentage = gstpercentage;
	}

	public double getGstamount() {
		return gstamount;
	}

	public void setGstamount(double gstamount) {
		this.gstamount = gstamount;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public Quotation getQuotation() {
		return quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}
	
	
	
}
