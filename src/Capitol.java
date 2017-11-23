import java.util.*;


public class Capitol implements Element {
	String titluCapitol;
	
	public ArrayList<Subcapitol>subcapitole;
	
public Capitol(String titluCapitol) {
	this.titluCapitol=titluCapitol;
}


public void setSubcapitol(ArrayList<Subcapitol> subcapitol) {
    this.subcapitole = subcapitol;
}

public void print() {
	System.out.println(titluCapitol);
}


@Override
public void addElement(Element elem) throws Exception {
	// TODO Auto-generated method stub
	
}


@Override
public void remove(Element elem) {
	// TODO Auto-generated method stub
	
}


@Override
public void getChild(int index) {
	// TODO Auto-generated method stub

}



public void acceptVisitor(Visitor s) {
	// TODO Auto-generated method stub
	
}





public String toString()
{
    StringBuilder sb = new StringBuilder();
    for(byte i=1; i < subcapitole.size(); i++)
    {
        sb.append(subcapitole.get(i)).append(" ");
    }
    return sb.toString();
}











}
