import Publication.java;


public class Book extends Publication {

    private String author;

    void setAuthor ( String author){

	this.author = author;



    }

    String getAuthor (){
	return author;

    }


    public void orderCopies ( int bcopies) {

	System.out.println(getCopies() + bcopies);


    }
    public double saleCopy( int qty ) {

	System.out.println("Total book sale: Rs" + (qty * price));

	total = total + ( qty*price);
	return total;

    }



}
