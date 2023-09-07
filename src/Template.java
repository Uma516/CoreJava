import java.util.ArrayList;

public class Template {
    public static void main(String[] args){
        ArrayList a1=new ArrayList();
        Integer i=new Integer(10);
        Character c=new Character('5');
        Double d=new Double("10.5");
        a1.add(i);
        a1.add(c);
        a1.add(d);
        System.out.println(a1);
    }

}
