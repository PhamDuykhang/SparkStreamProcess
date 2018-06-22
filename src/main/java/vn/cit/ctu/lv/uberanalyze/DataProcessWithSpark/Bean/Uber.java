package vn.cit.ctu.lv.uberanalyze.DataProcessWithSpark.Bean;

public class Uber {
	private String dt;
	private Double lat;
	private Double lon;
	private String base;
	public Uber(String dt, Double lat, Double lon, String base) {
		super();
		this.dt = dt;
		this.lat = lat;
		this.lon = lon;
		this.base = base;
	}
	public Uber() {
		
	}
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	
}
