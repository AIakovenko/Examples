package com.github.aiakovenko.solar;


public class GeoPoint {
	/*
	 * Calculations defines what data would be calculated;
	 * yd[0] - Incident;
	 * yd[1] - Power (kWh/m2/day). It describes value of electricity which may be produced
	 * by the panel lying in horizontally.
	 * yd[2] - Power on the Horizontal (kWh/m2/day) or Module Power (kWh/m2/day) (depends on panel tilt). 
	 */
	private final static int CALCULATION = 3;
	private double latitude;
	private double panelTilt;
	private int points;
	//Days of the year
	private Integer[] xd;
	private Double[][] yd;
	
	public GeoPoint(double latitude, double panelTilt, int points) {
		this.latitude = latitude;
		this.panelTilt = panelTilt;
		this.points = points;
		xd = new Integer[points];
		yd = new Double[3][points];
	}

	/**
	 * @return the latitude
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the panelTilt
	 */
	public double getPanelTilt() {
		return panelTilt;
	}

	/**
	 * @param panelTilt the panelTilt to set
	 */
	public void setPanelTilt(double panelTilt) {
		this.panelTilt = panelTilt;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}
	
	public void setXd(Integer[] xd) {
		this.xd = xd;
	}
	public Integer[] getXd(){
		return xd;
	}
	
	public void setYd(Double[][] yd) {
		this.yd = yd;
	}
	public Double[][] getYd(){
		return yd;
	}
	
}
