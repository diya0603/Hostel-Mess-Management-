package jdbcFood;

public class Food {
	private int fid;
	private String fname;
	private String V_N;
	
	public Food(int fid,String fname,String V_N) {
		super();
		this.fid=fid;
		this.fname=fname;
		this.V_N=V_N;
	}
	public Food() {
		
	}
	
	public int getfid(){
		return fid;
	}
	public void setfid(int fid) {
		this.fid=fid;
	}
	
	public String getfname() {
		return fname;
	}
	public void setfname(String fname) {
		this.fname=fname;
	}
	
	public String getV_N() {
		return V_N;
	}
	public void setV_N(String V_N) {
		this.V_N=V_N;
	}

}
