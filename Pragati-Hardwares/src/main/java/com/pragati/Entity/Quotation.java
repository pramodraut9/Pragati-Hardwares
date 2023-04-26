package com.pragati.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "quotations")
public class Quotation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String date;

	private String quotationtype;

	private boolean instock;

	private double discountamount;

	private double gstamount;

	private double sobtotal;

	private double total;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dealer_id")
	@JsonIgnore
	private Dealers dealers;

	@OneToOne(mappedBy = "quotation")
	@JsonIgnore
	private QuotationDetails quotationDetails;

	

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getQuotationtype() {
		return quotationtype;
	}

	public void setQuotationtype(String quotationtype) {
		this.quotationtype = quotationtype;
	}

	public boolean isInstock() {
		return instock;
	}

	public void setInstock(boolean instock) {
		this.instock = instock;
	}

	public double getDiscountamount() {
		return discountamount;
	}

	public void setDiscountamount(double discountamount) {
		this.discountamount = discountamount;
	}

	public double getGstamount() {
		return gstamount;
	}

	public void setGstamount(double gstamount) {
		this.gstamount = gstamount;
	}

	public double getSobtotal() {
		return sobtotal;
	}

	public void setSobtotal(double sobtotal) {
		this.sobtotal = sobtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Dealers getDealers() {
		return dealers;
	}

	public void setDealers(Dealers dealers) {
		this.dealers = dealers;
	}

	public QuotationDetails getQuotationDetails() {
		return quotationDetails;
	}

	public void setQuotationDetails(QuotationDetails quotationDetails) {
		this.quotationDetails = quotationDetails;
	}

	
}
