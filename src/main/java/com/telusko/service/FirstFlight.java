package com.telusko.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FirstFlight implements IDelivery {
	public FirstFlight() {
		System.out.println("FedEx bean created...");
	}
	@Override
	public Boolean deliveyTheProduct(Double amount) {
		System.out.println("product delivered with FirstFlight and amount paid is "+amount );
		return true;
	}

}
