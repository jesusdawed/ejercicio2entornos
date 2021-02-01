package ejercicios;

public class Salario {
	private int sueldo;
	Salario(){
		this.sueldo=0;
	}
	Salario(int s){
		this.sueldo=s;
	}
	public float calculaSalarioBruto(String tipo,float ventasMes,float horasExtra) {
		float total=0;
		float totalHorasExtra=0;
		if(tipo.equals("Vendedor")) {
			total=1000;
		}else {
			total=1500;
		}
		if(ventasMes>=1000 && ventasMes<1500) {
			total=total+100;
		}
		if(ventasMes>=1500) {
			total=total+200;
		}
		totalHorasExtra=20*horasExtra;
		total=total+totalHorasExtra;
		return total;
	}
	
	public float calculaSalarioNeto(float salarioBruto) {
		float total=salarioBruto;
		if(total>=1000 && total<1500) {
			total=(total*84)/100;
		}
		if(total>=1500) {
			total=(total*82)/100;
		}
		return total;
	}
	
}
