import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256_ex
{
    public static void main(String[] args)
    {
        System.out.println("입력값은 무엇입니까?");
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println("                1         2         3         4         5         6         7         8         9      ");
        System.out.println("       123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456");
        System.out.println("입력값:" + s);
        System.out.println("헥사값:" + toHexa(s));
        System.out.println("해쉬값:" + encryptSHA256(s) + " 32바이트를 헥사로 바꿨음");
    }

    public static String encryptSHA256(String str)
    {
        String sha = "";
        try
        {
            MessageDigest sh = MessageDigest.getInstance("SHA-256");
            sh.update(str.getBytes());
            sha = toHexa(sh.digest());
        }
        catch(NoSuchAlgorithmException e)
        {
            System.out.println("무슨 알고리즘입니까 이게!");
        }
        
        return sha;
    }

    public static String toHexa(String str)
    {
        String hs = "";
        byte byteData[] = str.getBytes();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++)
        {
//            System.out.println("1     :" + byteData[i]);
//            System.out.println("2     :" + Integer.toString((byteData[i]     )          )              + "\t" + 
//                                           Integer.toString((byteData[i]&0xff)          )              + "\t" + 
//                                           Integer.toString((byteData[i]&0xff)+0x100    )              + "\t" + 
//                                           Integer.toString((byteData[i]&0xff)+0x100, 16)              + "\t" + 
//                                           Integer.toHexString((byteData[i]&0xff)+0x100)               + "\t" + 
//                                           Integer.toString((byteData[i]&0xff)+0x100, 16).substring(1) );
            
            sb.append(Integer.toString((byteData[i]&0xff)+0x100, 16).substring(1));
        }
        hs = sb.toString();
        
        return hs;
    }

    public static String toHexa(byte[] byteData)
    {
        String hs = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < byteData.length; i++)
        {
//            System.out.println("1     :" + byteData[i]);
//            System.out.println("2     :" + Integer.toString((byteData[i]     )          )              + "\t" + 
//                                           Integer.toString((byteData[i]&0xff)          )              + "\t" + 
//                                           Integer.toString((byteData[i]&0xff)+0x100    )              + "\t" + 
//                                           Integer.toString((byteData[i]&0xff)+0x100, 16)              + "\t" + 
//                                           Integer.toHexString((byteData[i]&0xff)+0x100)               + "\t" + 
//                                           Integer.toString((byteData[i]&0xff)+0x100, 16).substring(1) );
            
            sb.append(Integer.toString((byteData[i]&0xff)+0x100, 16).substring(1));
        }
        hs = sb.toString();
        
        return hs;
    }


}

