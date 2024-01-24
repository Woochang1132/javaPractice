public class Main {
    public static void main(String[] args){
        int [] scroes = {83, 90, 87};

        System.out.println("scroes[0] = " + scroes[0]);
        System.out.println("scroes[1] = " + scroes[1]);
        System.out.println("scroes[2] = " + scroes[2]);

        int sum = 0;
        for(int i =0; i<3; i++){
            sum += scroes[i];
        }
        System.out.println("총합 = " + sum);
    }
}
