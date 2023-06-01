//finding_network_address_ip_default_mask


import java.io.*;
public class finding_network_address_ip_default_mask {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[4], p = 0;
        String ipbin[] = new String[4];
        System.out.println("Enter 4 segments of ip");
        for(int i = 0;i<4;i++)
        arr[i] = Integer.parseInt(br.readLine());
        int cls = ipclass(arr[0]);
        for(int i = 0;i<4;i++)
        {
            String z = binconvert(arr[i]);
            ipbin[p++] = z;
        }
        System.out.println("Ip Address");
        for(int i = 0;i<p;i++)
        System.out.println(ipbin[i]+" ");
        System.out.println();
        String zero = "00000000";
        String one = "11111111";
        String mask[] = new String [4];
        for(int i = 0;i<4;i++)
        {
            mask[i] = zero;
        }
        if(cls==1)
        mask[0] = one;
        else if(cls==2)
        mask[0] = mask[1] = one;
        else if(cls == 3)
        mask[0] = mask[1] = mask[2] = one;
        else
        mask[0] = mask[1] = mask[2] = mask[3] = one;
        System.out.println("Default Mask");
        for(int i = 0;i<4;i++)
        System.out.println(mask[i]+" ");
        System.out.println();
        netadd(ipbin, mask);


    }
    public static int ipclass(int a)
    {
        int ipclass[] =new int[8], r = 0,k=7,cnt=0,z=0,clsval = 0;
        String s = "";
        while(a>0)
        {
            r = a%2;
            ipclass[k--] = r;
            a = a/2;
            cnt++;
        }
        if(cnt<8)
        z = 8-cnt;
        for(int i = 0;i<z;i++)
        {
            ipclass[k--] = 0;
        }
        for(int i = 0;i<8;i++)
        {
            s += ipclass[i];
        }
        if(s.charAt(0)=='0')
        clsval =1;
        else if(s.substring(0, 2).equals("10"))
        clsval =2;
        else if(s.substring(0, 3).equals("110"))
        clsval =3;
        else if(s.substring(0, 4).equals("1110"))
        clsval =4;
        else if(s.substring(0, 4).equals("1111"))
        clsval =5;
        return clsval;
    }
    public static String binconvert(int a)
    {
        int r = 0, temp[] = new int [8];
        for(int i = 0;i<8;i++)
        {
            temp[i] = 0;
        }
        int k = 7;
        String s = "";
        while(a>0)
        {
            r = a%2;
            temp[k--] = r;
            a = a/2;
        }
        for(int i = 0;i<8;i++)
        {
            s+= s.valueOf(temp[i]);
        }
        return s;
    }
    public static void netadd(String ipbin[], String mask[])
    {
        System.out.println("Network Address");
        for(int i = 0;i<4;i++)
        {
            String q = "";
            for(int j = 0;j<8;j++)
            {
                char ip = ipbin[i].charAt(j);
                char df = mask[i].charAt(j);
                if(df=='1')
                q+=ip;
                else if(df=='0')
                q+='0';
            }
            System.out.println(q+" ");
        }
        System.out.println();
    }
}