package ie.atu.oop.week1;

public class BookExceptionCheck
{
    public static void main(String[] args)
    {
        try
        {
            Book invalid = new Book("Dune", "Frank Hebrert", 412);
            System.out.println(invalid.getTitle());
        }
        catch (IllegalArgumentException error)
        {
            System.out.println("Book rejected: " + error.getMessage()); // line 12 of book.java
        }
    }
}
