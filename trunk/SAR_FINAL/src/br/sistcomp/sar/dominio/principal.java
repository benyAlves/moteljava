package br.sistcomp.sar.dominio;

import br.sistcomp.sar.servico.AlunoDAO;
import br.sistcomp.sar.servico.PessoaDAO;
import java.lang.String;


public class principal {
  

  
   
    public static void main(String[] args) {

//
        String nome = "Thiago Ramalho Pacheco";
        String[] conjunto = nome.split(" ");
        String teste = AlunoDAO.getInstance().pesquisarPorNome("THIAGO").get(0).getNascimento();
        System.out.println(teste.substring(3,5));

        
    }
}
 