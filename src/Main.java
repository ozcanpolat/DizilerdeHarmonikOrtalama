public class Main {
    public static void main(String[] args) {
        int[] numbers= {34,55,67,44,200,55,84};
        double sum=0;
        for(int i=0; i<numbers.length; i++){
            sum+=1.0/(numbers[i]);
        }

        //ha=harmonic avarage
        double ha= numbers.length/sum;
        System.out.println("Harmonik Ortalama :"+ha);

    }
}
