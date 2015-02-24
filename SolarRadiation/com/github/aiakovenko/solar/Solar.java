package com.github.aiakovenko.solar;

public class Solar {
	
	public static double toRad(double value){
		return value * Math.PI / 180;
	}

	public static double toDeg(double value){
		return 180 * value / Math.PI;
	}

	public static double declination(double day){
		return 23.45 * Math.sin(toRad(360/365*(day-81)));
	}

	public static double am(double value,int day, double fi){
		double dec = toRad(declination(day));
		double hra = toRad(15 * (value - 12));
		double elevation = Math.asin(Math.sin(dec)*Math.sin(fi)+Math.cos(dec)*Math.cos(fi)*Math.cos(hra));
		double declination = toRad(90) - elevation;
		return 1 / (1E-4 + Math.cos(declination));
	}
	
	public static void calculate(GeoPoint point){
		
		double lat = toRad(point.getLatitude());
		int numberOfPoints = point.getPoints();
		double panelTilt = point.getPanelTilt();

		Integer[] xd = point.getXd();
		Double[][] yd = point.getYd();
		
		
		for (int i = 0; i < numberOfPoints; i++){
			int jDay = i+1;
			
			xd[i] = jDay; 
			double dec = toRad(declination(jDay));

			double x = - (Math.sin(lat) * Math.sin(dec));
			x = x / (Math.cos(lat) * Math.cos(dec));
			if (x > 1.0)
				x = 1.0;
			if (x < -1.0)
				x = -1.0;
			double fi = Math.acos(x);
			double h = toDeg(fi * 1 / 15.0);
			double sunrise = 12.0 - h;
			double sunset = 12.0 + h;	
				
			double stot = 0.0;
			double elevation = 0.0;
			if (h > 0){	
				for (double t = sunrise; t <= sunset; t++){
						 double am = am(t, jDay, lat);
						 double x1 = Math.pow(0.7, am);
						stot = stot + 1.353 * Math.pow(x1, 0.678);
				}
				elevation = Math.asin(Math.sin(dec) * Math.sin(lat) + Math.cos(dec) * Math.cos(lat));
				if (lat < 0) {
					elevation = toRad(90) + lat - dec;
				}
				else {
					elevation = toRad(90) - lat + dec;
				}
			}	
				yd[0][i] = stot;
				yd[1][i] = stot * Math.sin(toRad(90) - lat + dec);
				yd[2][i] = stot * Math.sin(toRad(panelTilt) + elevation);

		}	
			
			showResult(point);
			

		// drawGraph(ctxModuleIncident,g2);

		//add extra drawings here.
	} 
	private static void showResult(GeoPoint point){
			
		int numberOfPoints = point.getPoints();
		Integer[] xd = point.getXd();
		Double[][] yd = point.getYd();
			
		System.out.println("Latitude (degrees, South is negative) "+point.getLatitude());
		System.out.println("Array Tilt (degrees) "+point.getPanelTilt());
		System.out.printf("%5s		%s	%s	%s\n", "Day", "Incident","Power (kWh/m2/day)", "Power on the Horizontal (kWh/m2/day)/Module Power (kWh/m2/day)");
		

		for (int i = 0; i < numberOfPoints; i++){
			System.out.printf("  %d		 %.2f			%.2f					%.2f\n", xd[i], yd[0][i], yd[1][i], yd[2][i]);
		}	
	}

	public static void main(String[] args) {
		GeoPoint point = new GeoPoint(50, 45, 365);
		calculate(point);

	}

}
