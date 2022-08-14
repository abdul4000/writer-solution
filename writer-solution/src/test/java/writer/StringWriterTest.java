package writer;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StringWriterTest extends TestCase {


    public void testLowercase() {
        StringWriter sw = new StringWriter();
        sw.setData("HELLO");
        WrtierHelper lowercase = sw.lowercase();
        Assert.assertEquals("hello",lowercase.getData());
    }

    public void testUpperCase() {
        StringWriter sw = new StringWriter();
        sw.setData("hello");
        WrtierHelper upperCase = sw.upperCase();
        Assert.assertEquals("HELLO",upperCase.getData());
    }

    public void testDuplicateRemove() {

        StringWriter sw = new StringWriter();
        sw.setData("hello hello how are you");
        WrtierHelper duplicateRemove = sw.duplicateRemove();
        Assert.assertEquals("hello how are you",duplicateRemove.getData());
    }

    public void testStupidRemove() {
        StringWriter sw = new StringWriter();
        sw.setData("hello how are you stupid");
        WrtierHelper stupidRemove = sw.stupidRemove();
        Assert.assertEquals("hello how are you s*****",stupidRemove.getData());
    }

    public void testStupidRemoveWithDuplicate() {
        StringWriter sw = new StringWriter();
        sw.setData("hello hello how are you stupid");
        WrtierHelper stupidRemoveWithDuplicate = sw.lowercase().duplicateRemove().stupidRemove();
        Assert.assertEquals("hello how are you s*****",stupidRemoveWithDuplicate.getData());
    }


}