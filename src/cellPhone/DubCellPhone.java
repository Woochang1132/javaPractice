package cellPhone;

public class DubCellPhone extends CellPhone{
    //필드
    int channel;

    DubCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    // 메소드
    void turnOnDmb(){
        System.out.println("채널" + channel + "번 방송을 수신합니다." );
    }
    void changeChannelDmb(int channel){
        this.channel = channel; // data 업데이트
        System.out.println("채널 " + channel + "번으로 바꿉니다");
    }
    void turnOffDmb(){
        System.out.println("방송 수신을 멈춥니다.");
    }
}
