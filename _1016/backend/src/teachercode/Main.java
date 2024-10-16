package teachercode;

public class Main {
    public static void main(String[] args) {
        Tv samsungTv = new SamsungTv();
        Tv lgtv = new LgTv();
        Tv appletv = new AppleTv();
        UniversalRemote remote = new UniversalRemote();

        // 삼성
        remote.pairWith(samsungTv);
        remote.setPower(true); // 전원 켜기
        remote.setChannel(5); // 5번 채널 변경
        remote.watchStreaming(); // 고유 스트리밍
        remote.setPower(false);

        System.out.println("======================");

        // Lg Tv 페어링
        remote.pairWith(lgtv);
        remote.setPower(true); // 전원 켜기
        remote.setChannel(5); // 5번 채널 변경
        remote.watchStreaming(); // 고유 스트리밍
        remote.setPower(false);

        System.out.println("======================");
        remote.pairWith(samsungTv);
        remote.setPower(true);
        remote.adjustVolume(5);
        remote.setPower(false);

        remote.pairWith(lgtv);
        remote.setPower(true); // 전원 켜기
        remote.setChannel(5); // 5번 채널 변경
        remote.watchStreaming(); // 고유 스트리밍

        remote.setPower(false);
    }
}
