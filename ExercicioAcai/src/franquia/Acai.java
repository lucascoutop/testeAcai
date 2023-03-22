package franquia;

public class Acai {
	public double tamanho;
	public double valor;
	public boolean acrescimo = false;
	
	public Acai() {
		
	}
	
	public double calculaValor(double total) {
		if(tamanho==300){
            valor = 8.0;
        }else if(tamanho==500){
            valor = 10.0;
        }else if(tamanho == 700){
            valor = 12.0;
        }else{
            System.out.printf("Não temos essa opção de tamanho.");
        }

        if(acrescimo){
            this.valor += 2.0;
            return this.valor;
        }else
            return this.valor;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(boolean acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	
}
