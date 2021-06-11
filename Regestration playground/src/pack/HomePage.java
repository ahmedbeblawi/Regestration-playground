package pack;
/**
 * This class to represent the information of the user
 * @author 
 *
 */
public class HomePage extends SignUp{
	/**
	 * Using getName ( ) function from SignUp class
	 */
	
	String Choosen ;
	
	/**
	 * 
	 * @param Choosen
	 */
	public void setChoosen (String Choosen) {
		this.Choosen = Choosen ;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getChoosen ()
	{ 
		return Choosen ;
	}

}
