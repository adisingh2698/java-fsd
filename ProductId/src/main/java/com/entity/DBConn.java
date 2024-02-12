package com.entity;



import java.sql.*;

public class DBConn {
    public static void main(String[] args) {
        try {
            // driver loading
            Class.forName("com.mysql.cj.jdbc.Driver");
            // make connection
            Connection conObj = DriverManager.getConnection("jdbc:mysql://Localhost:3306/productinfo", "root", "Adisingh8381@");
            if (conObj != null)
                System.out.println("DB Connected...");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://Localhost:3306/productinfo", "root", "Adisingh8381@");
    }

    public static Product getProductDetails(int productId) {
        try (Connection connection = getConnection()) {
            String sql = "SELECT * FROM products WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, productId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return new Product(
                                resultSet.getInt("id"),
                                resultSet.getString("name"),
                                resultSet.getString("description"),
                                resultSet.getDouble("price")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

		
		    
		    