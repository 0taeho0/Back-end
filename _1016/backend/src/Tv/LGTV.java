package Tv;

import java.util.Scanner;

public class LGTV implements TV{
    Scanner sc = new Scanner(System.in);
    String Samsung_tv_name = "LG Ultra 4K Wide TV"; //tv 이름
    boolean onandoff = false; //아래 메소드에 사용될 전원 판단 여부
    boolean remote_connect = false;

    @Override
    public boolean tv_onandoff(boolean a) {
        if(a==false){
            System.out.println("LG code.Tv is On");
            a = true;
            return a;
        }
        else if(a=true) {
            System.out.println("LG code.Tv is Off");
            a = false;
            return a;
        }
        return a;
    }

    @Override
    public void check_port() {
        System.out.printf("현재 채널은 %d입니다!",port);
        System.out.println();
    }

    @Override
    public int change_port(int a) {
        System.out.println("변경할 채널을 입력해주세요.");
        a = sc.nextInt();
        return a;
    }

    @Override
    public void return_tv_name(String a) {
        System.out.printf("현재 TV의 모델은 '%s'입니다!\n");
    }

    @Override
    public boolean connect_remote(boolean a) {
        if(a==false){
            System.out.println("UniversalRemote is Connected");
            a = true;
            return a;
        }
        else if(a=true) {
            System.out.println("UniversalRemote is Disconnected.");
            a = false;
            return a;
        }
        return a;
    }

    @Override
    public void Streaming() {
        System.out.println("LG TV Original Service!");
        System.out.println("Youtube에 접속 중..");
        System.out.println("(엄청난볼거리)");
    }
}
