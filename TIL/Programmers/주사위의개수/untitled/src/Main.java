public class Main {
    public static void main(String[] args) {

        int[] box = new int[]{10, 8, 6};
        int n = 3;
        int answer = 0;

        int width;
        int length;
        int height;

        width = box[0]/n;
        length = box[1]/n;
        height = box[2]/n;

        answer = width*length*height;

        System.out.println(answer);
    }
}