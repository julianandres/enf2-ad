package main;
import Resta.Resta;
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
	   int result=0;
	   Suma sum=new Suma(number1,number2);
       resultado=sum.getResultado();
       Resta rest= new Resta(number1,number2);
       result=rest.getResult();
      System.out.println("prueba");
	}

}
