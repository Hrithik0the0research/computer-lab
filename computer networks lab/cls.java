import java.io.*;
class cls{
    public static void main(String[] args)throws IOException{
        String sc="";
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter 4 segments");
        int a=Integer.parseInt(bf.readLine());
        int b=Integer.parseInt(bf.readLine());
        int c=Integer.parseInt(bf.readLine());
        int d=Integer.parseInt(bf.readLine());
        int arr[]=new int[8];
        int z=0,r,k=7,a1=a,cnt=0; 
        while(a>0){
            r=a%2;
            arr[k]=r;
            a=a/2;
            k--;
            cnt++;
        }
        if(cnt<8){
            z=8-cnt;
        }
        for(int i=0;i<z;i++){
            arr[k]=0;
            k--;
        }
        for(int i=0;i<8;i++){
            sc=sc+arr[i];
        }
        if(sc.charAt(0)=='0'){
            System.out.println("Class A");
        }
        if(sc.substring(0,2).equals("10")){
            System.out.println("Class B");
        }
        if(sc.substring(0,3).equals("110")){
            System.out.println("Class C");
        }
        if(sc.substring(0,4).equals("1110")){
            System.out.println("Class D");
        }
        if(sc.substring(0,4).equals("1111")){
            System.out.println("Class E");
        }


    }
}