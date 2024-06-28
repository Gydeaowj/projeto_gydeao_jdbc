package com.castelo;


import com.castelo.conexao.Conexao;
import com.castelo.dao.PessoaDAO;
import com.castelo.dao.PessoaPojo;
import com.castelo.modelo.Pessoa;

public class App 
{
    public static void main( String[] args )
    {
        /*
        Conexao conexao = new Conexao();
        conexao.getConexao();
         */

        Pessoa pessoa =new Pessoa();

        //inserir pessoa 
        /*
        pessoa.setNome("Caio");
        pessoa.setCpf("666.333.777-77");
        pessoa.setIdade(45);

        PessoaPojo pessoaPojo =new PessoaPojo();
        pessoaPojo.setNome("Caio");
        pessoaPojo.setCpf("666.333.777-77");
        pessoaPojo.setIdade(45);
        pessoaPojo.setId(1);

        PessoaDAO pessoaDAO = new PessoaDAO();        
        pessoaDAO.deletarPessoa(pessoaPojo);
        */ 

        //deletar pessoa
        /*
        PessoaPojo pessoaPojo =new PessoaPojo();
        pessoaPojo.setId(1);

        PessoaDAO pessoaDAO = new PessoaDAO();        
        pessoaDAO.deletarPessoa(pessoaPojo);
        */

        //consultar pessoa

        PessoaPojo pessoaPojo =new PessoaPojo();

        PessoaDAO pessoaDAO = new PessoaDAO();        
        pessoaDAO.consultarPessoa(pessoaPojo);

    }
}