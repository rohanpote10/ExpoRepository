class Garage{

String carModel = "Baleno";
int carNumber = 8789;
String carColor = "Grey";

public void carInfo()
{
  System.out.println("---Car Info---");
  Garage g1 = new Garage();
  System.out.println("Car Model- "+carModel+"\nCar Number- "+carNumber+"\nCar Color- "+carColor);
}

public void customerInfo()
{
  System.out.println("---Customer Info---");
  Garage g2 = new Garage();
  String customerName = "Shubham";
  String customerAddress = "Kharadi";
  String customerMobileNo = "9012345678";
  System.out.println("Customer Name- "+ customerName+"\nCustomer Address- "+customerAddress+"\nCustomer Mobile Number- "+customerMobileNo);
  System.out.println("Car Model- "+g2.carModel+"\nCar Number- "+carNumber+"\nCar Color- "+carColor);
}

public static void main(String[] args)
{
  Garage g3 = new Garage();
  g3.carInfo();
  g3.customerInfo();
}

}