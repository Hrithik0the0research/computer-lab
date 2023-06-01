import java.net.*;
import java.io.*;
class tcp{
    public static void main(String[] args)throws IOException{
        String user="",sc1="";
        ServerSocket sc=new ServerSocket(1024);
        while(true){
            Socket welcome=sc.accept();
            
            DataOutputStream dt=new DataOutputStream(welcome.getOutputStream());
            BufferedReader bf=new BufferedReader(new InputStreamReader(welcome.getInputStream()));
            sc1=bf.readLine();
            user=sc1.toUpperCase()+'\n';
            dt.writeBytes(user);
            
        }
    }
}