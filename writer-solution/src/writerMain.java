import org.omg.CORBA.WrongTransaction;

import java.io.IOException;
import java.util.Locale;


public  class writerMain {

    public static void main(String[] args) throws IOException {


        StringWriter s = new StringWriter();
        s.write("HELLO HI HI THIS IS GOOD STUPID HELLO!!!").duplicateRemove().lowercase().stupidRemove();
        s.close();
//        FileWriter f = new FileWriter();
//        f.write("Hello HI HI THIS IS GOOD STUPID hello").lowercase().duplicateRemove();
//        f.close();




    }

}
