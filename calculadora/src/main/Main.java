package main;
import suma.Suma;
public class Main {
    private  int number1;
    private  int number2;
    public Main() {
		number1=1;
		number2=2;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   int resultado=0;
	   Suma sum=new Suma(number1,number2);
       resultado=sum.getResultado();
      System.out.println("prueba");
      //hola andreita linda
	}

}
