package cellPhone;

public class DmbCellPhoneExample {
    public static void main(String[] args){
        // 자식 객체 생성
        DubCellPhone dubCellPhone = new DubCellPhone("자바폰", "검정", 10);

        System.out.println(dubCellPhone.model);
        System.out.println(dubCellPhone.color);
        System.out.println(dubCellPhone.channel);

        dubCellPhone.powerOn();
        dubCellPhone.powerOff();
    }
}
