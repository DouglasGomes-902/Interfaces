package mondel.services;

import model.entites.CarRental;

public class RentalServices {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private BrazilTaxServices taxServices;

	public RentalServices(Double pricePerDay, Double pricePerHour, BrazilTaxServices taxServices) {
		super();
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxServices = taxServices;
	}
	
	
	public void processInvoice(CarRental carRental) {
		
	}
	
}
