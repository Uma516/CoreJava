import java.util.ArrayList;

public class Template {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add("ratan");
        a1.add('c');
        a1.add("pinku");
        a1.add(null);
        System.out.println("Arraylist=" + a1);
        System.out.println("Arraylist-->"+a1.size());
        a1.add(1,"A1");
      a1.remove(1);
      a1.remove("A");
      a1.clear();

    }
}