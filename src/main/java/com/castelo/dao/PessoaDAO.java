package com.castelo.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.castelo.conexao.Conexao;

public class PessoaDao {


     public void cadastrarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "insert into pessoa(id, nome, cpf, idade) value (?, ?, ?, ?)";

        PreparedStatement ps = null;


        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, pessoaPojo.getId());
            ps.setString(2, pessoaPojo.getNome());
            ps.setString(3, pessoaPojo.getCpf());
            ps.setInt(4, pessoaPojo.getIdade());
          

            ps.execute();
            ps.close();

            System.out.println("Produto salvo com exito!");

         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println( "Não foi possivel fornecer aprovação, revise o produto!");
        }
    } 

/* 
    public void deletarPessoa(ProdutoPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "DELETE FROM pessoa WHERE id = (?)";

        PreparedStatement ps = null;


        try {

            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, pessoaPojo.getId());
            
           

            ps.execute();
            ps.close();

            System.out.println("Dados deletados com sucesso!");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

           
        
    }  
*/
}