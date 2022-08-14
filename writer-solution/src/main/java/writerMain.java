
import writer.FileWriter;
import writer.StringWriter;

import java.io.IOException;


public  class writerMain {

    public static void main(String[] args) throws IOException {


        StringWriter s = new StringWriter();
        s.write("HELLO HI HI THIS IS GOOD STUPID HELLO!!!").duplicateRemove().lowercase().stupidRemove();
        s.close();
        FileWriter f = new FileWriter();
        f.write("Hello HI HI THIS IS GOOD STUPID no way you").lowercase().duplicateRemove();
        f.close();




    }

}
