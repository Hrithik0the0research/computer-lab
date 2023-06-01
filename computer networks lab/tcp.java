import java.net.*;
import java.io.*;
class tcp{
    public static void main(String[] args)throws IOException{
        String cmsg="",smsg="";
        ServerSocket welcome=new ServerSocket(1024);
        while(true){
            Socket connection=welcome.accept();
            BufferedReader infclient=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            DataOutputStream otc=new DataOutputStream(connection.getOutputStream());
            cmsg=infclient.readLine();
            smsg=cmsg.toUpperCase()+'\n';
            otc.writeBytes(smsg);

        }
    }
}