package it.Twitter.FollowersAnalyzer.Exceptions;

public class NullDataException extends Exception{
	final static String message="Data is null, wrong or inexistent Id";
	private static final long serialVersionUID = 5L;
	
	public NullDataException(String mex) {
		super(message+mex);
	}
	
	public String getError() {
		return "{\"error message\":\""+ getMessage()+"\"}";
	}
	
}
