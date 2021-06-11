package pack;

/**
 * This class to player can cancel a booking
 * @author 
 *
 */

public class CancelingBooking extends BookingPlayground {
	private String MyRequest;             
    private String response;
    
    
   /**
  * = all reservations of player in class BookingPlayground
  * @return
  */
    
    /**
     * 
     * @param MyRequest
     */
    public void setMyRequest (String MyRequest) {  
    	this.MyRequest = MyRequest;
    }
    
    /**
     * 
     * @return
     */
    public String getMyRequest(){  
            return MyRequest;
    }
    
    /**
     * Using setPlaygroundName ( ) function in BookingPlayground class
     * (user will set a playground which he want to will be canceled
     */
    
    /**
     * 
     * @param response
     */
    public void setresponse(String response)
    {
        this.response=response;
    }
    
    /**
     * 
     * @return
     */
    public String getresponse()
    {
       return response;
    }

}
