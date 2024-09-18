package _0918_resetTv_Lg_and_Samsung;

import java.util.*;

public class Lg_tv extends UniversalRemote implements Tv {
    // 필드 부분
    private boolean power;
    private int channel_number;
    private final String tv_name;
    // 생성자 부분
    Lg_tv(UniversalRemote ur){
        pairing = false;
        boolean power = false;
        channel_number = 1;
        tv_name = "LGTV";
    }

    // interface 메서드 부분
    @Override
    public boolean Tv_on_and_off() { // Tv 전원 세팅 메서드
        power = !power;
        return power;
    }

    @Override
    public int change_channel() { // 체널 변경 메서드
        Scanner scan = new Scanner(System.in);
        System.out.print("change channel number ? >");
        channel_number = scan.nextInt();
        System.out.println();
        return channel_number;
    }

    @Override
    public void check_channel() { // 체널 확인 메서드
        if (channel_number == 1) System.out.println("default channel number : 1");
        else System.out.println("check channel number : " + channel_number);
    }

    @Override
    public boolean pairing_setting() { // 페어링 상태 확인 메서드
        System.out.println();
        return false;
    }

    @Override
    public void tv_name_print() {
        System.out.println("tv name is : " + tv_name);
    }

    void youtube(){
        Scanner scan = new Scanner(System.in);
        String [][] arr = {
                {"개그", "런닝맨", "신서유기", "코빅"},{"영화 요약", "보스톤", "범죄도시1", "범죄도시2", "범죄도시3"}
        };
        System.out.println(arr[0][0]+" "+arr[1][0]+" pick > ");
        String pick = scan.next();
        if(pick.equals(arr[0][0]))
            for(int i = 1; i < 4; i++) System.out.print(arr[0][i]+" ");
        else
            for(int i = 1; i < 4; i++) System.out.print(arr[1][i]+" ");
        System.out.println();
    }
}
