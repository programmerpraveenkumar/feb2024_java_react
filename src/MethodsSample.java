public class MethodsSample {
    public static void main(String[] args) {
        MethodsSample obj = new MethodsSample();
        obj.add();//calling method using object
    }

    /*
            method should return value.if not  ,mention as void
     */
    void add(){
        int num1 = 12;
        int num2 = 2;
        System.out.println(num1+num2);
    }
}
