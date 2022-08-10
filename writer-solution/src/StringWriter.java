import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

class StringWriter {

    String data;
    boolean isClosed;

    public StringWriter(){
        data = "";
        isClosed = false;
    }
    public StringWriter write(String data){

        this.data += data;
        return this;

    }

    public StringWriter lowercase() {
        this.data = data.toLowerCase();

        return this;

    }

    public StringWriter upperCase() {

        this.data = data.toUpperCase();
        return this;
    }
//
//    public StringWriter duplicateRemove() {
//
//        LinkedHashMap<String,String> finalData = new LinkedHashMap<>();
//
//        String[] arr = data.split(" ");
//
//        int count = 0;
//        for (String temp : arr) {
//            finalData.put(temp,temp);
//
//        }
//        String temp = "";
//        for (Map.Entry<String,String> s: finalData.entrySet()){
//
//            temp+=s.getValue() +" ";
//        }
//
//        this.data=temp;
//
//        return this;
//    }

    public StringWriter duplicateRemove() {

        LinkedHashMap<Integer,String> finalData = new LinkedHashMap<>();

        String[] arr = data.split(" ");

        int count = 0;
        String repeat="";
        for (String temp : arr) {
            if(!temp.equals(repeat)) {
                repeat = temp;
                finalData.put(count++, temp);
            }

        }
        String temp = "";
        for (Map.Entry<Integer,String> s: finalData.entrySet()){

            temp+=s.getValue() +" ";
        }

        this.data=temp;

        return this;
    }

    public StringWriter stupidRemove() {
        LinkedHashMap<Integer,String> finalData = new LinkedHashMap<>();

        String[] arr = data.split(" ");

        int count = 0;
        for (String temp : arr) {
            if(temp.equals("stupid")){
                temp="s*****";
            }
            finalData.put(count++,temp);

        }
        String temp = "";
        for (Map.Entry<Integer,String> s: finalData.entrySet()){

            temp+=s.getValue() +" ";
        }

        this.data=temp;

        return this;
    }

    public boolean close() throws IOException {

        if (!isClosed)
            System.out.println(data);
        data="";
        isClosed = true;
        return true;
    }

    public void stringMethod(){

    }


}
