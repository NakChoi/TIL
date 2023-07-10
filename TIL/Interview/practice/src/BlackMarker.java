public class BlackMarker implements Marker{

    private boolean isCapOpened = false;
    int inkCapacity; // 마커 잉크 용량
    private final String color = "Black";

    int width; // 마커 바디 길이
    int length; // 마커 바디 두께
    int lineWidth; // 마커 심 두께

    public BlackMarker(int width, int length, int lineWidth, int inkCapacity) {
        this.width = width;
        this.length = length;
        this.lineWidth = lineWidth;
        this.inkCapacity = inkCapacity;
    }

    public int getInkCapacity() {
        return this.inkCapacity;
    }

    public String getColor() {
        return this.color;
    }

    public int getWidth() {
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    @Override
    public void isCapOpened() {
        if (this.isCapOpened) {
            System.out.println("뚜껑이 열려있습니다.");
        } else {
            System.out.println("뚜껑이 닫혀있습니다.");
        }
    }

    @Override
    public void openCap() {
        if(this.isCapOpened){
            System.out.println("이미 뚜껑이 열려있습니다.");
        }else {
            this.isCapOpened = true;
            System.out.println("마커 캡을 열었습니다.");
        }
    }

    @Override
    public void closeCap() {
        if(this.isCapOpened){
            this.isCapOpened = false;
            System.out.println("마커 캡을 닫았습니다.");
        }else {
            System.out.println("이미 뚜껑이 닫혀있습니다.");
        }

    }

    @Override
    public void refillInk() {
        if(this.inkCapacity == 10){
            System.out.println("잉크가 이미 가득차 있습니다.");
        }else{
            this.inkCapacity = 10;
            System.out.println("잉크를 가득 채웠습니다.");
        }
    }

    @Override
    public void write() {
        if(isCapOpened){
            if (this.inkCapacity <= 0){
                System.out.println("잉크가 없습니다.");
            }else {
                this.inkCapacity--;
                System.out.println("마커로 글씨를 썼습니다.");
                System.out.println("남은 용량은 " + this.inkCapacity + " 입니다.");
            }
        }else {
            System.out.println("뚜껑을 열어주세요.");
        }

    }

}
