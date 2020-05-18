package com.cg.go.dto;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_product_map_dto")
public class OrderProductMapDTO {
	@Id
	private String orderId;
	private String productId;
	private String ProductUIN;
	private int productStatus;
	private int giftStatus;

	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public OrderProductMapDTO(String orderId, String productId, String productUIN, int productStatus, int giftStatus) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.ProductUIN = productUIN;
		this.productStatus = productStatus;
		this.giftStatus = giftStatus;
	}
	public String getProductUIN() {
		return ProductUIN;
	}
	public OrderProductMapDTO() {
		super();
	}
	public void setProductUIN(String productUIN) {
		ProductUIN = productUIN;
	}
	public int getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}
	public int getGiftStatus() {
		return giftStatus;
	}
	public void setGiftStatus(int giftStatus) {
		this.giftStatus = giftStatus;
	}
	

}
