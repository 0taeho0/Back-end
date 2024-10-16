package teachercode;

public interface Tv {
    void setPower(boolean power); // power가 true면 켜고, false면 끈다.
    void changeChannel(int channel); // 인자로 전달 받은 채널 번호로 변경한다.
    int getCurrentChannel(); // 현재 채널을 확인하는 메서드
    boolean isPowerOn(); // Tv의 전원이 켜져 있는지 여부를 확인하는 메서드
    boolean isPaired(); // Tv가 리모콘과페어링 되어 있는지 여부를 반환하는 메서드
    void setPair(boolean pair); // Tv와 리모컨의 페어링 상태를 설정하는 메서드
    String getTvName(); // Tv의 이름을 반환하는 메서드
    void adjustVolume(int level);
}
