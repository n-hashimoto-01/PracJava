package test;

public class ApplicationException extends Throwable {

	
	private Throwable innerException;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ApplicationException(Throwable ex) {
		innerException = ex;
	}
	public Throwable getInnerException() {
		return innerException;
	}
}
