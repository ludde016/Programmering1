
public enum Fluidtable {
	
	WATER(0.998, 4.19, 0, 100, 2260),
	H2SO4(1.84, 1.38, 10, 336, 511);
	
	double density;
	double heatcapacity;
	double smeltpoint;
	double boilpoint;
	double steamEntalpy; 

	
	Fluidtable (double fi, double c, double m, double b, double py){
		density = fi;
		heatcapacity = c;
		smeltpoint = m;
		boilpoint = b;
		steamEntalpy = py; 
	}
}
