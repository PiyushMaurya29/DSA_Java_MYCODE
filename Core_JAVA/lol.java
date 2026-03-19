package Core_JAVA;


class outer{
  static class inner{
    void display(){
      System.out.println("I am inner class");
    }
  }
}
public class lol {
  public static void main(String[] args) {
    outer.inner innerObj = new outer.inner();
    innerObj.display();

    outer.inner innerObj2 = new outer.inner();
    innerObj2.display();
  }
}
