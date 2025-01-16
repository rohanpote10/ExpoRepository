class Student{

public void studentInfo()
{
  System.out.println("Name- Yash Kumbhar, Address- Sainagar, RollNumber- 21");
  System.out.println("Name- Aniket Nangare, Address- Sainagar, RollNumber- 36");
  System.out.println("Name- Rohan Pote, Address- Ravet, RollNumber- 69");
}

public void studentMarks()
{
  System.out.println("RollNumber- 21, Percentage- 90%");
  System.out.println("RollNumber- 36, Percentage- 70%");
  System.out.println("RollNumber- 69, Percentage- 80%");
}

public static void main(String[] args )
{
  System.out.println("main method");
  Student S = new Student();
  S.studentInfo();
  S.studentMarks();
}

}
