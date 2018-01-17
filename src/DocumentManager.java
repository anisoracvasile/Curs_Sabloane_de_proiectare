
public class DocumentManager {
	
	private static  DocumentManager instance = null;
	
	public Element book;
	
	protected DocumentManager() {
		
	}

	public static DocumentManager getInstance () {
		
		 if(instance == null) {
	         instance = new DocumentManager();
		 }
		return instance;
		
	}
	
	public Element getBook () {
		
	
	return book;
	}

}
