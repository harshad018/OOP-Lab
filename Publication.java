import java.util.*;

class Publication {

    String title;
    int price;
    int copies;
    static double total = 0;


    void setTitle ( String title ) {

	this.title = title;

    }

    String getTitle (){

	return title;


    }

    void setPrice ( int price ) {

	this.price = price;

    }

    int  getPrice (){

	return price;


    }

    void setCopies ( int copies ) {

	this.copies = copies;

    }

    int  getCopies (){

	return copies;


    }

    public double saleCopy ( int qty){


	System.out.println("Total publication sale is: Rs " + ( qty * price));

	return qty*price;



    }
















}
