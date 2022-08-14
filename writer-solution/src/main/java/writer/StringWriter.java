package writer;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringWriter extends WrtierHelper  {

//    String data;
//    boolean isClosed;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }



    public StringWriter(){
        data = "";
        isClosed = false;
    }
    public StringWriter write(String data){

        this.data += data;
        return this;

    }

//    public StringWriter lowercase() {
//        this.data = data.toLowerCase();
//
//        return this;
//
//    }
//
//    public StringWriter upperCase() {
//
//        this.data = data.toUpperCase();
//        return this;
//    }
//
//    public StringWriter duplicateRemove() {
//
//        LinkedHashMap<Integer,String> finalData = new LinkedHashMap<>();
//
//        String[] arr = data.split(" ");
//
//        int count = 0;
//        String repeat="";
//        for (String temp : arr) {
//            if(!temp.equals(repeat)) {
//                repeat = temp;
//                finalData.put(count++, temp);
//            }
//
//        }
//        String temp = "";
//        for (Map.Entry<Integer,String> s: finalData.entrySet()){
//
//            temp+=s.getValue() +" ";
//        }
//
//        this.data=temp.trim();
//
//        return this;
//    }
//
//    public StringWriter stupidRemove() {
//        LinkedHashMap<Integer,String> finalData = new LinkedHashMap<>();
//
//        String[] arr = data.split(" ");
//
//        int count = 0;
//        for (String temp : arr) {
//            if(temp.equals("stupid")){
//                temp="s*****";
//            }
//            finalData.put(count++,temp);
//
//        }
//        String temp = "";
//        for (Map.Entry<Integer,String> s: finalData.entrySet()){
//
//            temp+=s.getValue() +" ";
//        }
//
//        this.data=temp.trim();
//
//        return this;
//    }

    public boolean close() throws IOException {

        if (!isClosed)
            System.out.println(data);
        data="";
        isClosed = true;
        return true;
    }




}
