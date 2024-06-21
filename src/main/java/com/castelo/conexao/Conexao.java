package com.castelo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private String url = "jdbc:mysql://localhost:3306/caixa";
    private String user = "root";
    private String password = "";

    private Connection conn; 

    public Connection getConexao(){
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("CONEXÃO BEM SUCEDIDA!");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERRO NA CONEXÃO!");
        }
        return null;
    }
}