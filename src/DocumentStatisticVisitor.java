
public class DocumentStatisticVisitor implements Visitor {

    private int numarTabele = 0;
    private int numarParagrafe = 0;
    private int numarImagini = 0;
    private int numarSectiuni = 0;
    
	
	public void visitimagineProxy(ImaginePorxy img) {
	System.out.println(img);
		
	}


	public void visitImagine(Imagine img) {
		System.out.println(img);
		
	}


	public void visitParagraf(Paragraf parag) {
		System.out.println(parag);
		
	}


	public void visitTabel(Tabel tabl) {
		System.out.println(tabl);
		
	}


	public void visitSectiune(Sectiune sect) {
		System.out.println(sect);
		
	}

}
