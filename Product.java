class Product {

public void displayProductDetails()
{
  System.out.println("101 Bike 89000");
}

public void displayProductAddress()
{
  System.out.println("12 PCMC PUNE");
}

public void displayOrderDetails()
{
  System.out.println("oid date time");
}

public static void main(String[] args)
{
  System.out.println("main method");
  Product P = new Product();
  P.displayProductDetails();
  P.displayProductAddress();
  P.displayOrderDetails();
}

}