package com.castelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.castelo.conexao.Conexao;

public class PessoaDAO {

    
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
    
    
    
    public void deletarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "DELETE FROM pessoa WHERE id = ?";

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
    

    public void consultarPessoa(PessoaPojo pessoaPojo) {

        Conexao conexao = new Conexao();

        String sql = "SELECT * FROM Pessoa WHERE id = ?";

        PreparedStatement ps = null;

        ResultSet rs = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, pessoaPojo.getId());
           
            rs = ps.executeQuery();            
                   
            while(rs.next()) {

            pessoaPojo.setNome( rs.getString(2));
            pessoaPojo.setCpf( rs.getString(3));
            pessoaPojo.setIdade(  rs.getInt(4));      
         }
         
         ps.close();

         System.out.println(pessoaPojo.toString());

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
    }
}