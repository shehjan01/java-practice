package day1_Classobject;

public class mainVehicle {
	
	public static void main(String arc[]) {
		Vehicle ao=new Vehicle();
		ao.setColor("White");
		ao.setModel("Bmd 5x");
		ao.setRegno("Gj06ab1945");
		System.out.println(ao);
		Vehicle ab=new Vehicle();
		System.out.println(ao);
		Vehicle as=new Vehicle("Activa 5G","Light Grey","GJ09DB1696");
		System.out.println(as);
	}
}
