package draft;

public class BitValue {
	
	private Boolean status;
	
	public BitValue()
	{
		status = null;
	}
	
	 public void setBitValue(Boolean value)
	 {
	 status = value;
	 }
	 
	 public Boolean getBitValue()
	 {
	 return status;
	 }
	 
	 public String toString()
	 {
	 String result = Boolean.toString(status);
	 return result;
	 }

}
