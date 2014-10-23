package Resta;

public class Resta {
    private int num1=0;
    private int num2;
    private int result;
	public int getnum1() {
		return num1;
	}
	public void setnum1(int num1) {
		this.num1 = num1;
	}
	public int getnum2() {
		return num2;
	}
	public void setnum2(int num2) {
		this.num2 = num2;
	}
    public Resta(int n1,int n2){
    	this.setResult(n1-n2);
    }
	public int getResult() {
		return resultado;
	}
	public void setResult(int resultado) {
		this.result = result;
	}

}
