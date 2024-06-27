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

        pessoa.setNome("Júlia");
        pessoa.setCpf("000.111.222-33");
        pessoa.setIdade(15);

        PessoaPojo pessoaPojo =new PessoaPojo();
        pessoaPojo.setNome("Júlia");
        pessoaPojo.setCpf("000.111.222-33");
        pessoaPojo.setIdade(15);

        PessoaDAO pessoaDAO = new PessoaDAO();        
        pessoaDAO.cadastrarPessoa(pessoaPojo);
        

    }
}