package com.telusko.service;

import org.springframework.stereotype.Service;


@Service
public class FedEx implements IDelivery {
	public FedEx() {
		System.out.println("FedEx bean created...");
	}

	@Override
	public Boolean deliveyTheProduct(Double amount) {
		System.out.println("product delivered with FedEx and amount paid is "+amount );
		return true;
	}
	
}
