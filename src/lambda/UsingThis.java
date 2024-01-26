package lambda;

public class UsingThis {
    public int outterField = 10;

    class Inner{
        int innerField = 20;

        void method(){
            //람다식
            MyFunctionInterface fi = () -> {
                System.out.println("outterField " + outterField);
                System.out.println("outerField " + UsingThis.this.outterField + "\n");

                System.out.println("innerField: " + innerField);
                System.out.println("innerField: " + this.innerField);
            };
            fi.method();
        }
    }
}
