class player
{
 String name,type;
 int age;
 void play(String n,String t,int a)
 {
  name=n;
  type=t;
  age=a;
  System.out.println("Name :"+n+"\nType :"+t+ "\nAge :"+a);
 }
}

class cricket_player extends player
{
 void cp()
 {
  System.out.println("\nCricket player");
  super.play("sachin tendulkar","batter",48);
 }
}

class football_player extends player
{
 void fp()
 {
  System.out.println("\nFootball player");
  super.play("cristiano ronaldo","forwards",37);
 }
}

class hockey_player extends player
{
 void hp()
 {
  System.out.println("\nHockey player");
  super.play("Dhayan chand","centre forward",74);
 }
}

class details
{
 public static void main(String args[])
 {
  cricket_player c = new cricket_player();
  football_player f = new football_player();
  hockey_player h = new hockey_player(); 
  c.cp();
  f.fp();
  h.hp();
 }
}