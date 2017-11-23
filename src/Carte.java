import java.util.ArrayList;




public class Carte {
	
	private String titluCarte;

	public Cuprins cuprins;
	
	private ArrayList<Autor> aTeam;
	private ArrayList<Element> content ;
	public ArrayList<Capitol> capitol;

	
	
	
	public Carte(String titluCarte,  ArrayList<Autor> autor, ArrayList<Capitol> capitol) {
		this.aTeam=autor;
		this.titluCarte=titluCarte;
	    this.capitol=capitol;
	}
	
	
	 public ArrayList<Capitol> getCapitol() {
	        return capitol;
	    }

	    public Cuprins getCuprins() {
	        return cuprins;
	    }
	
	    
	    public String getTitlu() {
	        return titluCarte;
	    }
	    
	    public void setAutor(ArrayList<Autor> x)
	    {
	        this.aTeam = x;
	        }    
	    public ArrayList<Autor> getAutor()
	    {
	        return aTeam;
	    }    
	    
public void addCapitol (Element elem) {
	this.content.add(elem);
	
}




public void print () {
	System.out.println(titluCarte);
	 for(int i=0; i< content.size(); i++)
	   {
		   content.get(i).print();
		
	   }
}

public void acceptVisitor (Visitor v) {
	for (Element s :  content) {
		s.acceptVisitor(v);
	}
}

}
