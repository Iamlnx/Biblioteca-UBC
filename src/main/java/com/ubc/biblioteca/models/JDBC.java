package com.ubc.biblioteca.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("ALL")
public class JDBC {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/biblioteca" /*Ajuste de acordo com o banco de dados*/;
        String usuario = "" /*Digite aqui o nome de usuario do seu banco de dodos*/;
        String senha = "" /*Digite aqui a senha de acesso do banco de dados*/;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection con = DriverManager.getConnection(url, usuario, senha);
            Statement statement = con.createStatement();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
