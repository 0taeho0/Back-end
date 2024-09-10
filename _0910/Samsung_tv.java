import java.util.*;

public class Samsung_tv implements Tv {
    // 필드 부분
    private int channel_number; // 변경된 체널 값을 저장할 변수
    private boolean power = false;

//    @Override
//    public boolean onandoff(boolean a) {
//        if(a==fasle){
//            System.out.println("Tv 전원이 켜집니다.");
//            a = true;
//            return a;
//        }
//        else if(a) {
//            System.out.println("Tv 전원이 꺼집니다.");
//            a = false;
//            return a;
//        }
//    }

    // 메서드 부분
    @Override
    public void TV_ON() {
        power = true;
    }

    @Override
    public void TV_OFF() {
        power = false;
    }

    @Override
    public void check_channel() {
        System.out.println("현재 체널: "+channel_change());
    }

    @Override
    public int channel_change() {
        Scanner scan = new Scanner(System.in);
        if(power) {
            System.out.println("Tv 전원 확인");
            System.out.println("몇 번으로 변경을 하시겠습니까?");
            while (true) {
                int channel_number = scan.nextInt();
                if(channel_number < 0)
                    System.out.println("다시 입력하여 주십시오");
                else break;
            }
        }else{
            System.out.println("TV의 전원이 켜져있지 않습니다.");
        }
        return channel_number;
    }

    void Netflix_streaming(){
        String [] NETFLIX = {"해리포터 : 1시간 20분", "오징어 게임 : 1시간 30분"};
        for(String n : NETFLIX){
            System.out.println(n);
        }

        if(power)
            System.out.println("start NETFLIX streaming");
        else{
            System.out.println("streaming error");
            System.out.println("power not found");
        }
    }
}
