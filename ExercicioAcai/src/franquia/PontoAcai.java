package franquia;

import javax.swing.JOptionPane;

public class PontoAcai {

	public static void main(String[] args) {
		
		Acai testaAcai = new Acai();
		
		float tamanho = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o tamanho desejado? \n 300ml \n 500ml \n 700ml"));

		testaAcai.setTamanho(tamanho);
		
		 String acrescimo = JOptionPane.showInputDialog("Deseja acrescimo de sorvete? \n S = sim \n N = não");
	        if(acrescimo.equals("S")){
	            testaAcai.setAcrescimo(true);
	        }

	        testaAcai.calculaValor(tamanho);

	       JOptionPane.showMessageDialog(null,"O seu açai ficou no valor de: " + testaAcai.getValor());

	}

}
