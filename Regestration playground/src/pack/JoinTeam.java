package pack;

/**
 * This class to player can join a team 
 * @author 
 *
 */
public class JoinTeam extends BookingPlayground {
	private String TeamName ;
	private String response ;
	
	/**
	 * Using getTeamName ( ) function from class BookingPlayground
	 */
	
	/**
	 * Using getTeamMemberNum ( ) function from class BookingPlayground
	 */

	/**
	 * @param TeamName
	 */
	public void setTeamName (String TeamName) {
		this.TeamName = TeamName;
	}
	
	/**
	 * @param response
	 */
	public void setResponse (String response) {
		this.response = response;
	}
	
	/**
	 * @return
	 */
	public String getResponse () {
		return response ;
	}
	
}
