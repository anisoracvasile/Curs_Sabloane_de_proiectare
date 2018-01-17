

public class Paragraf extends  SubjectElement {
private	String textParagraf;

private AlignStrategy as = null;

Paragraf (String text){
	this.textParagraf=text;
}

public void setAlign(AlignStrategy as)
{
    this.as = as;
    notifyAllObservers();
}




@Override
public void addElement(Element elem) {
	 notifyAllObservers();
	
}
@Override
public void remove(Element elem) {
	// TODO Auto-generated method stub
	
}
@Override
public void getChild(int index) {
	// TODO Auto-generated method stub
	
}
@Override
public void print() {
	   if(as != null)
           as.printAligned(textParagraf);
       else 
           System.out.println(textParagraf);
	
}

public void acceptVisitor(Visitor v)
{
    v.visitParagraf(this);
    notifyAllObservers();
}

public void add(Element e){
    notifyAllObservers();
}
public String toString()
{
    return textParagraf;
}

}
