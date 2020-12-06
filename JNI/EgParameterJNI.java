import java.util.*;

public class EgParameterJNI {
    // for JNI ///////////////////////////////////////////////////////////////////
    // c or c++ function
    public native int CalParameter(int a, int b, String strOpr);
    public native String Message(String msg);
    // .so file
    static { System.loadLibrary("jniegpara"); }
    
    public static void main(String args[]) {
        EgParameterJNI myJNI = new EgParameterJNI();
        System.out.println(myJNI.Message("Test Program"));
        int Res = myJNI.CalParameter(10, 20, "*");
        System.out.println(Res);
    }
}

