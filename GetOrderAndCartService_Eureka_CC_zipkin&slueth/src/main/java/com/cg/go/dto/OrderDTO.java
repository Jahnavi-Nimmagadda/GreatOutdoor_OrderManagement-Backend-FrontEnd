package com.cg.go.dto;

import java.sql.Date;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="order_dto")
public class OrderDTO {

	
	@Id
private String orderId;
private String userId;
private String addressId;
private String orderDispatchStatus;
private Date orderInitiateTime;
private Date orderDispatchTime;

//
//@OneToOne
//@PrimaryKeyJoinColumn(name="userId")
//CartDTO cartDTO;
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public String getUserId() {
	return userId;
}
public OrderDTO(String orderId, String userId, String addressId, String orderDispatchStatus, Date orderInitiateTime,
		Date orderDispatchTime) {
	super();
	this.orderId = orderId;
	this.userId = userId;
	this.addressId = addressId;
	this.orderDispatchStatus = orderDispatchStatus;
	this.orderInitiateTime = orderInitiateTime;
	this.orderDispatchTime = orderDispatchTime;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getAddressId() {
	return addressId;
}
public void setAddressId(String addressId) {
	this.addressId = addressId;
}
public String getOrderDispatchStatus() {
	return orderDispatchStatus;
}
public void setOrderDispatchStatus(String orderDispatchStatus) {
	this.orderDispatchStatus = orderDispatchStatus;
}
public Date getOrderInitiateTime() {
	return orderInitiateTime;
}
public OrderDTO() {
	super();
}
public void setOrderInitiateTime(Date orderInitiateTime) {
	this.orderInitiateTime = orderInitiateTime;
}
public Date getOrderDispatchTime() {
	return orderDispatchTime;
}
public void setOrderDispatchTime(Date orderDispatchTime) {
	this.orderDispatchTime = orderDispatchTime;
}


}
