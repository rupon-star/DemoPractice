package basic;

public class MobileMobile {
	
	String mobileBrand;
	String mobileModel;
	double price;
	int ramSize;
	
	
	public MobileMobile() {
		
	}

	public MobileMobile(String mobileBrand) {
		super();
		this.mobileBrand = mobileBrand;
	}

public MobileMobile(String mobileBrand, String mobileModel) {
		super();
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
	}

	public MobileMobile(String mobileBrand, String mobileModel, double price) {
	super();
	this.mobileBrand = mobileBrand;
	this.mobileModel = mobileModel;
	this.price = price;
    }

	public MobileMobile(String mobileBrand, String mobileModel, double price, int ramSize) {
		super();
		this.mobileBrand = mobileBrand;
		this.mobileModel = mobileModel;
		this.price = price;
		this.ramSize = ramSize;
	}

	public static void main(String[]args) {
		MobileMobile mobile = new MobileMobile();
		
	}


}
