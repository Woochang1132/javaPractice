package person;

public class Anonymous {
    //필드 초기값으로 대입

    Person field = new Person(){
    void work(){
        System.out.println("출근합니다.");
    }
    @Override
    void wake(){
        System.out.println("6시에 일어납니다.");
        work();
    }
   };

    void method01(){
        //로컬 변수값으로 대입
        Person localVar = new Person(){
            void walk(){
                System.out.println("산책을 합니다.");
            }
            @Override
            void wake(){
                System.out.println("8시에 일어납니다.");
                walk();
            }
        };
        localVar.wake();
    }
    void method2(Person person){
        person.wake();
    }
}
