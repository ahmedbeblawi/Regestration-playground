package pack;
/**
 * This class to player can book a playground
 * @author 
 *
 */
public class BookingPlayground extends RegestringNewPlayground {
	private String PlaygroundName;
    private String sloat;
    private float money;
    private String response;
    private int teamMemberNum ;
	private String TeamName ;
   
    
    /**
     * Using getLocation ( ) function from class RegestringNewPlayground
     * @param TeamName
     */
	/**
	 * Using getSize ( ) function from class RegestringNewPlayground
	 * @param TeamName
	 */
   
    /**
     * Using getPrice ( ) function from class RegestringNewPlayground
     * @param TeamName
     */
    /**
     * Using getFreeSlots ( ) function from class RegestringNewPlayground
     * @param TeamName
     */
    
    /**
     * 
     * @param TeamName
     */
    public void setTeamName (String TeamName) {
		this.TeamName = TeamName;
	}
	
    /**
     * 
     * @param teamMemberNum
     */
	public void setTeamMemberNum (int teamMemberNum) {
		this.teamMemberNum = teamMemberNum;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getTeamName () {
		return TeamName ;
	}
	
	public int getTeamMemberNum () {
		return teamMemberNum ;
	}
	
	/**
	 * 
	 * @param PlaygroundName
	 */
    public void SetPlaygroundName(String PlaygroundName)
    {
        this.PlaygroundName=PlaygroundName;
    }
    
    /**
     * 
     * @return
     */
    public String getPlaygroundName()
    {
        return PlaygroundName;
    }
    
    /**
     * 
     * @param sloat
     */
    public void setsloat(String sloat)
    {
        this.sloat=sloat;
    }
    
    /**
     * 
     * @param money
     */
    public void payMoney(float money){
        this.money=money;
    }
    
    /**
     * 
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
