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
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String productname;

	private double mrp;

	private int qty;

	private int boxqty;

	private boolean instock;

	private double creditrate;

	private double cashrate;

	private double gstpercentage;

	// Data jpa mapping
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productcat_id")
	@JsonIgnore
	private ProductCategories productcategories;

	@OneToOne(mappedBy = "products")
	@JsonIgnore
	private QuotationDetails quotationDetails;

	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getBoxqty() {
		return boxqty;
	}

	public void setBoxqty(int boxqty) {
		this.boxqty = boxqty;
	}

	public boolean isInstock() {
		return instock;
	}

	public void setInstock(boolean instock) {
		this.instock = instock;
	}

	public double getCreditrate() {
		return creditrate;
	}

	public void setCreditrate(double creditrate) {
		this.creditrate = creditrate;
	}

	public double getCashrate() {
		return cashrate;
	}

	public void setCashrate(double cashrate) {
		this.cashrate = cashrate;
	}

	public double getGstpercentage() {
		return gstpercentage;
	}

	public void setGstpercentage(double gstpercentage) {
		this.gstpercentage = gstpercentage;
	}

	public ProductCategories getProductcategories() {
		return productcategories;
	}

	public void setProductcategories(ProductCategories productcategories) {
		this.productcategories = productcategories;
	}

	public QuotationDetails getQuotationDetails() {
		return quotationDetails;
	}

	public void setQuotationDetails(QuotationDetails quotationDetails) {
		this.quotationDetails = quotationDetails;
	}

	
}
