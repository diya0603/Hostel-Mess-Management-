package jdbcWorks;

public class Works {
	private int sid;
	private int hid;
	private String wday;
	private String wtime;
	
	public Works(int sid,int hid,String wday,String wtime) {
		this.sid=sid;
		this.hid=hid;
		this.wday=wday;
		this.wtime=wtime;
	}
	public Works() {
		
	}
	
	public int getsid() {
		return sid;
	}
	public void setsid(int sid) {
		this.sid=sid;
	}
	
	public int gethid() {
		return hid;
	}
	public void sethid(int hid) {
		this.hid=hid;
	}
	
	public String getwday() {
		return wday;
	}
	public void setwday(String wday) {
		this.wday=wday;
	}
	
	public String getwtime() {
		return wtime;
	}
	public void setwtime(String wtime) {
		this.wtime=wtime;
	}
}
