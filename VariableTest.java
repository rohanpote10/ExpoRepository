class VariableTest {

int rollNo = 11;
String name = "Yash";
String address = "Sainagar";

public void m1()
{
  System.out.println("m1 method");
  int divid = 100;
  String lastName = "abc";
  System.out.println(divid);
  System.out.println(lastName);
}

public void m2()
{
  System.out.println("m2 method");
  VariableTest vt = new VariableTest();
  System.out.println(rollNo+" "+name+" "+address);
}

public static void main(String[] args)
{
  System.out.println("Varialble Test Program");
  VariableTest vt1 = new VariableTest();
  System.out.println(vt1.rollNo);
  System.out.println(vt1.name);
  System.out.println(vt1.address);
  vt1.m1();
  vt1.m2();
}

}