package lambda;

public class UsingLocalVariable {
    void method(int arg){ // arg는 final 특성을 가짐
        int localVar = 40; // localVar는 final 특성을 가짐

        //람다식
        MyFunctionInterface fi = () -> {
            //로컬 변수 읽기
            System.out.println("arg: " + arg);
            System.out.println("localVar : " + localVar + "\n");
        };
        fi.method();
    }
}
