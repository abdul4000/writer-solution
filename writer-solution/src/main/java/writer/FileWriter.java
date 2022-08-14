package writer;

import writer.StringWriter;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileWriter extends StringWriter {

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    String fileName;

    public FileWriter(){
        super();
        fileName ="default.txt";

    }

    @Override
    public boolean close() throws IOException {

        if (!isClosed) {
            System.out.println("file name is "+ fileName);
            File f = new File(fileName);

            if(!f.exists()){
                f.createNewFile();
            }
            if(f.canWrite()){
                System.out.println("cam write");
                System.out.println("writing to file at path  "+ f.getAbsolutePath());
            }
            java.io.FileWriter javaFileWriter = new java.io.FileWriter(fileName);
            javaFileWriter.write(this.data);
            javaFileWriter.close();
        }
        this.data="";
        this.isClosed = true;
        return true;
    }



}
