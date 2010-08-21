package br.sistcomp.sar.dominio;

import br.sistcomp.sar.servico.AlunoDAO;
import br.sistcomp.sar.servico.AlunoTurmaDAO;
import br.sistcomp.sar.servico.PessoaDAO;
import java.lang.String;


public class principal {
  

  
   
    public static void main(String[] args) {

        System.out.println(AlunoTurmaDAO.getInstance().turmasDoAluno(40810).get(0));
        
    }
}
 