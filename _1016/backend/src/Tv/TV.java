package Tv;

public interface TV {
    int port = 0; //디폴트 상태는 0.
    boolean tv_onandoff(boolean a); //tV 전원 온오프
    void check_port(); //채널 확인
    int change_port(int port); //채널 변경

    void return_tv_name(String tv_name); //문자열 TV이름 반환

    boolean connect_remote(boolean a); //페어링을 하거나 끊는 것.s

    void Streaming(); //OTT 서비스
}
