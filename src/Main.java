import java.util.*;





public class Main {
	

    private static void visitorDemo()
    {
    	ArrayList<Element> lista2=null;
       Element[] list1 = {new Paragraf("Bere"), new Paragraf("Tuica"), new Paragraf("Alcool"),
    		   							new Tabel("1, 4, 2, 3"), new Tabel("grn"), new Imagine("poza"), new Sectiune(lista2)};
       DocumentStatisticVisitor visitor = new DocumentStatisticVisitor();
       
       for(Element i : list1)
       {
           i.acceptVisitor(visitor);
       }
       
       System.out.println("Numar paragrafe " + visitor.getNumarParagrafe());
       System.out.println("Numar tabele " + visitor.getNumarTabele());
       System.out.println("Numar imagini " + visitor.getNumarImagini());
       System.out.println("Numar sectiuni " + visitor.getNumarSectiuni());
    }

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("merge");

		
		 final AlignStrategy a1 = new ColumnAlign();
	        final AlignStrategy a2 = new LineAlign();
	        final AlignStrategy a3 = new RaptorAlign();
	        
	        Sectiune s1 = new Sectiune();
	        
	        Paragraf p1 = new Paragraf("Paragraf 1");
	        p1.setAlign(a1);
	        p1.print();
	        s1.addElement(p1);
	        
	        Paragraf p2 = new Paragraf("Paragraf 2");
	        p2.setAlign(a2);
	        p2.print();
	        s1.addElement(p2);
	        
	        
	        //Visitor demo
	        visitorDemo();
	        
	        
	        Command nscnd = new NewCommand();
	        nscnd.execute ();
	        Element book = DocumentManager.getInstance().getBook();
	        book.print();
		
	}
	

    
    //Builder builder= new JsonBuilder ("book.json");
    
    
 
	

}
