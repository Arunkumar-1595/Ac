package ac;

public class UseAc {
	public static void main(String[]args) {
		Motor m1=new Motor();
		m1.setBrand("Vitto");
		m1.setModel("V3");
		m1.setCc(500);
		
		Ac ac1=new Ac();
		ac1.setBrand("Croma");
		ac1.setModel("zen5");
		ac1.setPrice(35000);
		ac1.setMotor(m1);
		
		System.out.println(ac1.getBrand()+", "+ac1.getModel()+", "+ac1.getPrice()+", "+ac1.getMotor().getBrand()+", "+ac1.getMotor().getModel()+", "+ac1.getMotor().getCc());
	}

}
