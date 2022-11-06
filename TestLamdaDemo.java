interface Test{
    public void m1();
}
public class TestLamdaDemo {
    int x=10;
    public void m2(){
        int y=20;
        Test t= ()->{
            System.out.println("x is "+x);
            System.out.println("y is "+y);
            x=100;
            //y=200; as it is used in lamda expression it is final
        };
        t.m1();
    }

    public static void main(String[] args) {
        TestLamdaDemo testLamdaDemo =new TestLamdaDemo();
        testLamdaDemo.m2();
    }
}
