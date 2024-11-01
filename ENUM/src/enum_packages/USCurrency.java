package enum_packages;

public enum USCurrency {

	PENNY(0.01f),NICKLE(0.05f),DIME(0.1f),QUARTER(0.25f);
	
	float value;
	
	USCurrency(float value){
		this.value = value;
	}
	
	
}
