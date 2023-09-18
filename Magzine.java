import Book.java;

class Magzine extends Publication{

    int currentIssue;
    int orderQty;


    void setCurrent ( int currentIssue){

	this.currentIssue = currentIssue;
	

    }


    int getCurrent (){

	return currentIssue;

    }

    void setOrderqty ( int orderQty ){
	this.orderQty = orderQty;

    }

    int getOrderqty (){
	return orderQty;

    }

    public void receiveIssue (int newIssue){
	currentIssue = newIssue;
	System.out.println ( "Receive issue of magzines: " + currentIssue);
    }

	    public double saleCopy ( int qty ) {

	    System.out.println ( "Total magzine sale is Rs: " + ( orderQty - currentIssue))
		total = total + (qty *price);

	    return total;

	}

}
