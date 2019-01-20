package authorandbooks;

import org.junit.Assert;
import org.junit.Test;

public class TestBook {

    @Test
    public void testIfBookWorks() {

        Author a1 = new Author("John Smith", "john.smith@gmail.com", 'm');

        Book b1 = new Book("My First Novel", a1, 19.99, 1000);
        Book b2 = new Book("Another Novel", new Author("David Jones", "dave@yahoo.com", 'm'), 15.99, 888);
        Book b3 = new Book("Last Book", a1, 12.57);

        Assert.assertEquals("David Jones", b2.getAuthor().getName());
        Assert.assertEquals("dave@yahoo.com", b2.getAuthor().getEmail());
        Assert.assertEquals("My First Novel", b1.getTitle());
        Assert.assertEquals(19.99, b1.getPrice(), 0.1);
        Assert.assertEquals(15.99, b2.getPrice(), 0.1);
        Assert.assertEquals(1000, b1.getQtyInStock());
        Assert.assertEquals(888, b2.getQtyInStock());

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());

        b3.setQtyInStock(1000);
        Assert.assertEquals(1000,b3.getQtyInStock());

        Assert.assertEquals("John Smith", b1.getAuthorName());
        Assert.assertEquals("john.smith@gmail.com", b1.getAuthorEmail());
        Assert.assertEquals('m', b1.getAuthorGender());

        b1.setPrice(21.55);
        b1.setQtyInStock(550);
        Assert.assertEquals(21.55, b1.getPrice(), 0.1);
        Assert.assertEquals(550, b1.getQtyInStock());

        b2.setPrice(17.39);
        b2.setQtyInStock(330);
        Assert.assertEquals(17.39, b2.getPrice(), 0.1);
        Assert.assertEquals(330, b2.getQtyInStock());


    }
}
