package OOP.Encapsulation;

public class Book {
    private String name;
    private int pageNumber;
    public Book(String name, int pageNumber) {
        this.name = name;
        if(pageNumber<0)
        {
            pageNumber=0;
        }
        this.pageNumber = pageNumber;
    }

    public int getPageNumber()
    {
        return pageNumber;
    }
    public void setPageNumber(int pageNumber)
    {
        if(pageNumber<0)
        {
            pageNumber=0;
        }
        this.pageNumber=pageNumber;
    }public String getName()
    {
        return name;
    }
    public void setName(String name)
    {

        this.name=name;
    }




}
