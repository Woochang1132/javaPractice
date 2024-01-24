class Car{
    private int carFiled;
    Car(String color , int cc){
    }
    // 다음과 같이 getter 연락을 할 수 있게 정리
    public int getCarFiled(){
        return carFiled;
    }
    //Setter
    public void setCarFiled(int carFiled){
        this.carFiled = carFiled;
    }
    
}

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car("검정", 3000);
    }
}
