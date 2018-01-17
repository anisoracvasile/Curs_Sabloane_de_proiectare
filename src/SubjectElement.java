
public class SubjectElement extends Subject implements Element {

	    public void attach(Observer observer) {
	        observers.add(observer);
	    }

	  
	    public void detach(Observer observer) {
	        observers.remove(observer);
	    }
	    
	
	    public void notifyAllObservers(){
	        observers.forEach((observer) -> observer.update());
	    }

	
	    public void addElement(Element x) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }


	    public void remove(Element x) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	
	    public void getChild(int x) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	
	    public void print() {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }

	
	    public void acceptVisitor(Visitor v) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }
	    

}
