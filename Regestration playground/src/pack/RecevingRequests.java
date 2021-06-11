package pack;

/**
 * This class to playground owner can receive all requests
 * @author 
 *
 */
public class RecevingRequests extends BookingPlayground {
	private String response;
    
    /**
     * Using getPlaygroundName() function which is in BookingPlayground class
     */
    /**
     * Using getTeamName() function which is in BookingPlayground class
     */
    
	/**
	 * @param response
	 */
    public void setResponse(String response)
    {
        this.response=response;
    }
    
    /**
     * @return
     */
    public String getResponse()
    {
        return response;
    }

}
