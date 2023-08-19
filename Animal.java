class Animal
{
 void noise()
 {
  System.out.println("some noise");
 }
}
class Cat extends Animal
{
 void noise()
 {
  System.out.println("meow meow");
 }
}
class Dog extends Animal
{
 void noise()
 {
  System.out.println("bhaw bhaw");
 }
}
class snake extends Animal
{
 void noise()
 {
  System.out.println("Bhus Bhus");
 }
}
class Stimulator
{
 static void ansim(animal a1)
 {
  a1.noise();
 }
}
class Mainclass
{
 public static void main(String[] args)
 {
   Dog d1=new Dog();
   Cat c1=new cat();
   Snake s1=new Snake();
   Stimulator.ansim(d1);
   Stimulator.ansim(c1);
   Stimulator.ansim(s1);
 }
}
