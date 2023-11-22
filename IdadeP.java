package prog2_aula5;

public class IdadeP {
	private int idade;
	private int dia, diaNasc;
	private int mes, mesNasc;
	private int ano, anoNasc;
	
	
	public IdadeP ( int idade, int dia, int mes, int ano, int diaNasc,int mesNasc, int anoNasc) {
		this.idade = idade;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
		this.anoNasc = anoNasc;
		
		if (this.dia < this.diaNasc && this.mes < this.mesNasc || this.mes == this.mesNasc) {
			this.idade = (this.ano - this.anoNasc) - 1;
		} else {
			this.idade = this.ano - this.anoNasc;
		}
		if(this.idade > 18) { 
			System.out.println("Acesso liberado, maior de 18 anos.");
			} else {
				System.out.println("Acesso negado, você possui: " + this.idade + ".");
			}
		
	}

	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getDiaNasc() {
		return diaNasc;
	}


	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getMesNasc() {
		return mesNasc;
	}


	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getAnoNasc() {
		return anoNasc;
	}


	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public String toString (){
		return "Idade: " + idade + "\nData atual: " + dia + "/" + mes + "/" + ano + "\nDia do nascimento: " + diaNasc + "/" + mesNasc + "/" + anoNasc;
				
	}

}
