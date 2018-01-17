
public class MementoTest {

	public static void main(String[] args){
        Originator o = new Originator();
        CareTaker ct = new CareTaker();
        
        o.setState("Partea #1");
        o.setState("Partea #2");
        ct.add(o.saveStateToMemento());
        
        o.setState("Partea #3");
        ct.add(o.saveStateToMemento());
        
        o.getStateFromMemento(ct.get(0));
        System.out.println("First : " + o.getState());
        
        o.getStateFromMemento(ct.get(1));
        System.out.println("Second : " + o.getState());
    }
}
