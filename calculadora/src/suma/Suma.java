package suma;

public class Suma {
    private int sumando1=0;
    private int sumando2;
    private int resultado;
	public int getSumando1() {
		return sumando1;
	}
	public void setSumando1(int sumando1) {
		this.sumando1 = sumando1;
	}
	public int getSumando2() {
		return sumando2;
	}
	public void setSumando2(int sumando2) {
		this.sumando2 = sumando2;
	}
    public Suma(int s1,int s2){
    	this.setResultado(s1+s2);
    }
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
    
	
}
