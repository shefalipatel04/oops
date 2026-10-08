class Vehicle {
    private int numberoftyer;
    private String Engine_no;
    private String bodycolour;
    private String RTOname;
    private static int count = 0;
    Vehicle(int numberoftyer , String Engine_no , String bodycolour){
        this.numberoftyer = numberoftyer;
        this.Engine_no = Engine_no;
        this.bodycolour = bodycolour;
        count++;

    }
    {
        RTOname = "Ahmedabad";
        System.out.println("Till now the object created are " + (count +1 ));
    }
    public void setRTOname(String RTOname){
        this.RTOname = RTOname;
    }
    public String getRTOname () {
        return RTOname;

    }
    public String toString() {
        return "Number of tyer" + numberoftyer +" \n Engine_no " + Engine_no + "\nBody colour" + bodycolour + "\nTotal object created" + count;

    }

}
public class Main{
    public static void main(String[] args){
        Vehicle v1 = new Vehicle(4 , "ENG101" , "RED");
        Vehicle v2 = new Vehicle(3, "ENG102" , "GREEN");
        Vehicle v3 = new Vehicle(2 , "ENG103" , "YELLOW");
        v1.setRTOname("Ahmedabad");
          v2.setRTOname("vadodara");
            v3.setRTOname("surat");
            System.out.println("\n ---vehicle 1");
            System.out.println(v1.toString());

            System.out.println("\n ---vehicle 2");
            System.out.println(v2.toString());

            System.out.println("\n ---vehicle 3");
            System.out.println(v3.toString());



}
}