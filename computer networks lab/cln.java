import java.net.*;
import java.io.*;
class cln{
    public static void main(String[] args)throws IOException{
        String user="",reply="";
        Socket sc=new Socket("127.0.0.1",1024);
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bf1=new BufferedReader(new InputStreamReader(sc.getInputStream()));
        DataOutputStream dt=new DataOutputStream(sc.getOutputStream());
        System.out.println("enter msg");
        user=bf.readLine();
        dt.writeBytes(user+'\n');
        reply=bf1.readLine();
        System.out.println(reply);
        sc.close();
    }
}