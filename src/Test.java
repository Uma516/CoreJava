public interface Test {
    public static void main(String[] args) {
    //constructor approach
        Integer i1=new Integer(10);
        Integer i2=new Integer("10");
        System.out.println(i1+i2);

        //value of()approach

        Integer x1=Integer.valueOf(10);
        Integer x2=Integer.valueOf("10");
        System.out.println(x1+x2);
    }


}
