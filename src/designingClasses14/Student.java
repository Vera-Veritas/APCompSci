package designingClasses14;

public class Student
{
   private static int masterID = 999;
   private int myID;  
   //other fields

Student()
   {
	 myID = masterID;
	masterID-=2;
   	//finish the initialization of the state of the object
   }

   //rest of the class
}

