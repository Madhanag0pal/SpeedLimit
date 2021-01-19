import java.util.Scanner;
class speedlimit{  
  public static void main(String args[]) { 
    Scanner kbd = new Scanner(System.in);
    int n = kbd.nextInt();
    while(n != -1){
        if(1<=n && n<=10){
            int s,tc,tp=0,m=0;
            for(int i=0;i<n;i++){
                s = kbd.nextInt();
                tc = kbd.nextInt();
                if((1<=s && s<=90) && (1<=tc && tc<=12)){
                    m += s * (tc - tp);
                    tp = tc;
                }
            }
            System.out.println(m+" miles"); 
        }   
        n = kbd.nextInt();
    }
  }
}