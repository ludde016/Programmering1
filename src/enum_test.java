
public class enum_test {
	
	public static void main(String[] args) {
		
		System.out.println(heat(Fluidtable.WATER) + " J");
	}

	public static String heat(Fluidtable fluid) {
	
		String str = "Energin som kr�vs f�r att v�rma 1 kg 1 grad "+ fluid.name() + " �r inte: ";
		return str + fluid.heatcapacity * 1 * fluid.density; 
		
	}
	
}
