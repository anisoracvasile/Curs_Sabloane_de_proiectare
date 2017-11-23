

public class LineAlign implements AlignStrategy {

    @Override
    public void printAligned(String text) {
        System.out.println("Printez pe linie " + "*" + text + "**");
    }
    
}
