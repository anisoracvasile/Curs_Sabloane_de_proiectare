
import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	
	 protected List<Observer> observers = new ArrayList<Observer>();
	    protected int state;
	    
	    public int getState(){
	        return state;
	    }
	    
	    public void setState(int state){
	        this.state = state;
	        notifyAllObservers();
	    }
	    
	    public abstract void attach(Observer observer);
	    
	    public abstract void detach(Observer observer);
	    
	    public void notifyAllObservers(){
	        for(Observer observer : observers){
	            observer.update();
	        }
	    }

}
