import java.util.ArrayList;

public class Carte {
	
	public String titluCarte;
	
	public  Autor autor;
	
	public Cuprins cuprins;
	
	public ArrayList<Capitol> parte=new  ArrayList<Capitol>();
	
	public Carte(Autor autor, String titluCarte) {
		this.autor=autor;
		this.titluCarte=titluCarte;
	
	}

}
