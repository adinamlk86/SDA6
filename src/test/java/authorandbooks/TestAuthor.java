package authorandbooks;


import org.junit.Assert;
import org.junit.Test;

public class TestAuthor {

    @Test
    public void testIfAuthorWords(){

        Author a1= new Author("John Smith","john.smith@gmail.com",'m');

        System.out.println(a1.toString());

        Assert.assertEquals("John Smith",a1.getName());
        Assert.assertEquals("john.smith@gmail.com",a1.getEmail());
        Assert.assertEquals('m',a1.getGender());

        a1.setEmail("john@yahoo.com");

        Assert.assertEquals("john@yahoo.com",a1.getEmail());
        System.out.println(a1.toString());


    }
}
