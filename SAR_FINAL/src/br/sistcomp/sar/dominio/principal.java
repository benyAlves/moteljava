package br.sistcomp.sar.dominio;

import br.sistcomp.sar.servico.CaixaDAO;
import java.lang.String;
import javax.swing.JOptionPane;


public class principal {
  

  
   
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,CaixaDAO.getInstance().verificaStatus());
        
    }
}
 