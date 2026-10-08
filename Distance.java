class Distance {
    int feet;
    int inch ;
    Distance(){
        this(5);
    }
    Distance(int feet){
        this.feet = feet;
        this.inch = 5;
    }
    Distance(int feet , int inch){
        this.feet = feet ;
        this.inch = inch ;
    }
    Distance(Distance d){
        this.feet = d.feet;
        this.inch = d.inch;
    }
    void display(){
        System.out.println("feet=" + feet + " ,inch=" + inch);
    }
    public static void main(String[] args){
        Distance d1 = new Distance();
        Distance d2 = new Distance(10);
        Distance d3 = new Distance(8,6);
        Distance d4 = new Distance(d3);
        d1.display();
        d2.display();
        d3.display();
        d4.display();
    }
}