package jdbcStaff;

public class Staff {
	private int sid;
	private String lname;
	private String fname;
	private String dob;
	private String address;
	private String mobile;
	private int job_id;
	
	public Staff(int sid,String lname,String fname,String dob,String address,String mobile,int job_id) {
		this.sid=sid;
		this.lname=lname;
		this.fname=fname;
		this.dob=dob;
		this.address=address;
		this.mobile=mobile;
		this.job_id=job_id;
	}
	public Staff() {
		
	}
	
	public int getsid() {
		return sid;
	}
	public void setsid(int sid) {
		this.sid=sid;
	}
	
	public String getlname() {
		return lname;
	}
	public void setlname(String lname) {
		this.lname=lname;
	}
	
	public String getfname() {
		return fname;
	}
	public void setfname(String fname) {
		this.fname=fname;
	}
	
	public String getdob() {
		return dob;
	}
	public void setdob(String dob) {
		this.dob=dob;
	}
	
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address=address;
	}
	
	public String getmobile() {
		return mobile;
	}
	public void setmobile(String mobile) {
		this.mobile=mobile;
	}
	
	public int getjob_id() {
		return job_id;
	}
	public void setjob_id(int job_id) {
		this.job_id=job_id;
	}
}
