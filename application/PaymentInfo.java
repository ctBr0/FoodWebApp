package application;
/*
 * Copyright (C), FoodWebApp
 * FileName: PaymentInfo
 * Author:   Ailun Pei
 * Date:     
 * Description: Payment information
 * History: Version_1
 */

import java.util.Random;
//https://www.konakart.com/javadoc/server/com/konakart/bl/modules/payment/PaymentInfo.html
import java.lang.String;
import java.util.Locale;
//import com.commercetools.api.models.order.PaymentInfoImpl;


public class PaymentInfo {
	
	//class uml diagram
	public String customerID;
	
	//private card information
	private String cardType;
	private int [] cardId;
	private String holderName;
	private String bankName;
	private String cardExpireDate;
	private int [] cvcCode;
	
	//order create
	private String orderId;
	private Date createOrderTime;
	//order payed
	private String paymentId;
	private Date paymentTime;
	
	//class
    //the constructor
    public PaymentInfo(String customerID,String cardType,int [] cardId,String holderName,String bankName,Date cardExpireDate,
    		int [] cvcCode,String orderId, Date createOrderTime, String paymentId, Date paymentTime) {
    	this.customerID=customerID;
    	this.cardType = cardType;
    	this.cardId= cardId;
    	this.holderName=holderName;
    	this.bankName=bankName;
    	this.cardExpireDate=cardExpireDate;
    	this.cvcCode=cvcCode;
    	this.orderId = orderId;
    	this.createOrderTime = createOrderTime;
    	this.paymentId = paymentId;
    	this.paymentTime = paymentTime;
}
	//getter
    public String getCustomerID() {
    	return customerID;
    }
	public String getCardType() {
		return cardType;
	}
	public int[] getCardId() {
        return cardId;
    }
	public String getHolderName() {
		return holderName;
	}
	public String getBankName() {
		return bankName;
	}
    public Date getCardExpireDate() {
        return cardExpireDate;
    }
    public int[] getCvcCode() {
        return cvcCode;
    }
        
	public String getOrderId() {
        return orderId;
    }
	
    public Date getCreateOrderTime() {
        return createOrderTime;
    }
    public String getPaymentId() {
        return paymentId;
    }
    
    public Date getPaymentTime() {
        return paymentTime;
    }
    
    //setter
    public String getCustomerID(String customerID) {
    	this.customerID = customerID;
    }
	public String setCardType(String cardType) {
    	this.cardType = cardType;
	}
    public void setCardId(int[] cardId) {
        this.cardId = cardId;
    }
	public String setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String setbankName(String bankName) {
		this.bankName = bankName;
	}
    public Date setCardExpireDate(Date cardExpireDate) {
       this.cardExpireDate = cardExpireDate;
    }
    public void setCvcCode(int[] cvcCode) {
        this.cvcCode = cvcCode;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setCreateOrderTime(Date createOrderTime) {
        this.createOrderTime = createOrderTime;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }
	
	

}
