package com.telusko.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Amazon {
	private IDelivery service;

	public Amazon(IDelivery service) {
		System.out.println("Amazon constructor executed..");
		this.service=service;
	}
	@Autowired
	@Qualifier("fedEx")
	public void setServiceD(IDelivery service) {
		this.service= service;
	}

	public Boolean deliverProduct(Double amount) {
		System.out.println("Amazon deliverProduct method executed..");
		return service.deliveyTheProduct(amount);
	}
}
