package programacaopoo;



import java.util.Objects;

public class Conta implements Comparable<Conta> {

	private double saldo;
	private String codigo;

	Conta(double saldo, String codigo) {
		this.saldo = saldo;
		this.codigo = codigo;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public int compareTo(Conta Conta1) {
				
		if(this.saldo==Conta1.saldo) {
			return 0;
		}
		else if(this.saldo> Conta1.saldo) {
			return 1;
		}
		else {
			return -1;
		}
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return codigo == other.codigo;
	}
	
	


}
