package com.castelo;

import com.castelo.dao.PessoaDao;
import com.castelo.dao.PessoaPojo;
import com.castelo.modelo.Pessoa;

public class App 
{
    public static void main( String[] args )
    {

        Pessoa pessoa =new Pessoa();

        pessoa.setId(1);
        pessoa.setNome("Júlia");
        pessoa.setCpf("000.111.222-33");
        pessoa.setIdade(15);

        PessoaPojo pessoaPojo =new PessoaPojo();
        pessoaPojo.setId(1);
        pessoaPojo.setNome("Júlia");
        pessoaPojo.setCpf("000.111.222-33");
        pessoaPojo.setIdade(15);

        PessoaDao pessoaDao= new PessoaDao();        
        pess

    }
}