package pack;

public class SignUp extends RegestrationPage {
	private String name ;
	private String mobileNumber ;
	
	public void setName (String name)
	{
		this.name = name ;
	}
	
	public void setMobileNumber (String mobileNumber)
	{
		this.mobileNumber = mobileNumber ;
	}
	
	public String getName ()
	{
		return name ;
	}
	
	public String getMobileNumber()
	{
		return mobileNumber ;
	}

}
