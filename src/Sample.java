public class Sample {
    int age = 4;
    double price = 45.5;
    boolean isGood = true;
    char oneLetter = 'w';//only one character

    //main function
    public static void main(String args[]){
        Sample sm = new Sample();//obj creation
        System.out.println(sm.age);
        System.out.println(sm.price);//accessing the  variable using object
        System.out.println("your name");
    }
}
