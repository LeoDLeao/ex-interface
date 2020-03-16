package model.services;

public class BrazilTaxService {
	
	public double tax (double amouth) {
		if (amouth <= 100.0) {
			return amouth * 0.20;
		}else {
			return amouth * 0.15;
		}
	}

}
