public class SumRecurs {
    static void f(int i,int sum){
        if(i <1){
            System.out.println(sum);
            return;
        }
        f(i-1, sum=sum+i);

    }
    public static void main(String[] args) {
        f(3,0);
    }
}
