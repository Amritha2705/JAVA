class Box
{
 double width;
 double height;
 double depth;
}
class ClassDemo1
{
 public static void main(String args[])
 {
  Box boxobj1=new Box();
  Box boxobj2=new Box();
  double vol;
  boxobj1.width = 10;
  boxobj1.height = 20; 
  boxobj1.depth = 15;
  
  boxobj2.width = 20;
  boxobj2.height = 10; 
  boxobj2.depth = 25;
  
  double vol1 = boxobj1.width*boxobj1.height*boxobj1.depth;
  double vol2 = boxobj2.width*boxobj2.height*boxobj2.depth;
  System.out.println("Volume of 1: " + vol1);
  System.out.println("Volume of 2: " + vol2);
 }
}
