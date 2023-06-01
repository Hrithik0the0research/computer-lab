import java.io.*;
class ip{
    public static void main(String[] args)throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter 4 segments");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
int d=Integer.parseInt(br.readLine());
int arr[]=new int[8];
String s="";
int r=0,k=7,cnt=0,a1=a,z=0;
while(a>0){
    r=a%2;
    arr[k]=r;
    a=a/2;
    k--;
    cnt++;
}
if(cnt<8)
z=8-cnt;
for(int i=0;i<z;i++){
arr[k--]=0;
}
System.out.println("dn? again");
for(int i=0;i<8;i++)
s=s+arr[i];
if(s.charAt(0)=='0')
System.out.println("class A");
if(s.substring(0,2).equals("10"))
System.out.println("class b");
if(s.substring(0, 3).equals("110"))
System.out.println("class c");
if(s.substring(0, 4).equals("1110"))
System.out.println("class d");
if(s.substring(0, 4).equals("1111"))
System.out.println("class e");
    }
}