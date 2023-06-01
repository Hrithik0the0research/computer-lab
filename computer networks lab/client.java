import java.net.*;
import java.io.*;
class client{
    public static void main(String[] args)throws IOException{
        String sentence="",reply="";
        Socket cs=new Socket("127.0.0.1",1024);
        DataOutputStream ofc=new DataOutputStream(cs.getOutputStream());
        BufferedReader infserver=new BufferedReader(new InputStreamReader(cs.getInputStream()));
        BufferedReader fromuser=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter msg ");
        sentence=fromuser.readLine();
        ofc.writeBytes(sentence+'\n');
        reply=infserver.readLine();
        System.out.println("server reply "+"" +reply);
        cs.close();
    }
}