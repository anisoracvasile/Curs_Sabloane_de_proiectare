import java.util.ArrayList;

public class NewCommand extends Command  {
	
	public NewCommand () {
		
	}
	
	public void execute () {
		
		ArrayList<Element> listaElemente = null;
		Element book = new Sectiune(listaElemente);
		try {
			book.addElement(new Paragraf ("labul 11"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			book.addElement(new Paragraf ("labul 11 partea a 2"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DocumentManager.getInstance().getBook();
	}

}
