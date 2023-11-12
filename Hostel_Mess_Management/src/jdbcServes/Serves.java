package jdbcServes;

public class Serves {
	private int fid;
	private int hid;
	private String fday;
	private String ftime;
	public Serves() {
	}
	public Serves(int fid, int hid, String fday, String ftime) {
		super();
		this.fid = fid;
		this.hid = hid;
		this.fday = fday;
		this.ftime = ftime;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getFday() {
		return fday;
	}
	public void setFday(String fday) {
		this.fday = fday;
	}
	public String getFtime() {
		return ftime;
	}
	public void setFtime(String ftime) {
		this.ftime = ftime;
	}
	
}
