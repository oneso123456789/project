class FinalMember {
  final int a=10; // »ó¼ö
  public void setA(int a){
    this.a=a;
  }
}

public class FinalTest01{
  public static void main(String[] args) {
    FinalMember ft= new FinalMember();
	final int a=1000;
    ft.setA(100);
    System.out.println(a);
  }
}                                                    
