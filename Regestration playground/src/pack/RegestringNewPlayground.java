package pack;

public class RegestringNewPlayground extends HomePage{
	private String location ; 
	private float size ; 
	private float price ; 
	private float freeSlots ;
	private String message ;
	private String choosen ;
	private String response ;
	
	
	public void setLocation (String location) {
		this.location = location ;
	}
	
	public String getLocation ()
	{
		return location ;
	}
	
    public void setSize (float size) {
		this.size = size ;
	}
    
    public float getSize () {
    	return size ;
    }
    
    public void setPrice (float price ) {
    	this.price = price ;
    }
    
    public float getPrice () {
    	return price ;
    }
    
    public void setFreeSlots (float freeSlots) {
    	this.freeSlots = freeSlots ;
    }
    
    public float getFreeSloats (){
    	return freeSlots ;
    }
    public void setMessage (String message ) {
    	this.message = message ;
    }
    
    /**
     * To choose if he want to modeifiy or regeist a playground
     */
    public void setChoosen (String choosen) {
    	this.choosen = choosen ;
    }
    
    public void setResonse (String response) {
    	this.response = response ;
    }
    
    public String getMessage () {
    	return message;
    }
    
    public String getResponse () {
    	return response ;
    }
    

}
