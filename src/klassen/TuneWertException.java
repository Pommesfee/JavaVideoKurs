package klassen;

public class TuneWertException extends RuntimeException {

	public TuneWertException() {
		
	}
	
	public TuneWertException(String msg) {
		super(msg);
	}
	
	public TuneWertException(Throwable t) {
		super(t);
	}
	
	public TuneWertException(String msg, Throwable t) {
		super(msg, t);
	}
	
}
