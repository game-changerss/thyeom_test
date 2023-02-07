import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class test{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                star(x,y,n);
            }
            System.out.println();
        }
    }
    public static void star(int x, int y, int n){
        //1 1 13 ==1 2
        if((x/n)%3 == 1 && (y/n)%3 == 1){
            System.out.print(" ");
        }else{
            if(n/3==0){
                System.out.print("*");
            }else{
                star(x,y,n/3);
            }
        }
    }
}
