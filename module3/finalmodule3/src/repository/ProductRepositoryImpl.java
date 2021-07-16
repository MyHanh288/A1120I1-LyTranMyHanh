package repository;

import model.Catalogue;
import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleBinaryOperator;

public class ProductRepositoryImpl implements ProductRepository {
    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if( connection != null)
        {
            try{
                statement = connection.prepareStatement("select productid, productname, price, quantity, color, description, catalogue.catalogueid, cataloguename from product left join catalogue on catalogue.catalogueid = product.catalogueid");
                resultSet = statement.executeQuery();
                Product product = null;
                while (resultSet.next())
                {
                    int productId = resultSet.getInt("productid");
                    String productName = resultSet.getString("productname");
                    int price = resultSet.getInt("price");
                    int quantity = resultSet.getInt("quantity");
                    String color = resultSet.getString("color");
                    String description = resultSet.getString("description");
                    String catalogueId = resultSet.getString("catalogueid");
                    String catalogueName = resultSet.getString("cataloguename");
                    product = new Product(productId, productName, price, quantity, color, description, new Catalogue(catalogueId, catalogueName));
                    productList.add(product);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
                e.printStackTrace();
            }
            finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return productList;
    }

    @Override
    public void save(Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement("insert into product(productname, price, quantity, color, description, catalogueid) values =(?,?,?,?,?,?)");
                statement.setString(1,product.getProductName());
                statement.setInt(2,product.getPrice());
                statement.setInt(3,product.getQuantity());
                statement.setString(4,product.getColor());
                statement.setString(5,product.getDescription());
                statement.setString(6,product.getCatalogue().getCalatogueId());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public List<Product> findByName(String productName) {
        List<Product> productList = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement("select productid, productname, price, quantity, description, catalogue.catalogueid, cataloguename from product left join catalogue on catalogue.catalogueid = product.catalogueid where product.productname= ?");
                statement.setString(1, productName);
                resultSet = statement.executeQuery();
                Product product = null;
                while (resultSet.next())
                {
                    int productId = resultSet.getInt("productid");
                    String productName1 = resultSet.getString("productname");
                    int price = resultSet.getInt("price");
                    int quantity = resultSet.getInt("quantity");
                    String color = resultSet.getString("color");
                    String dercription = resultSet.getString("dercription");
                    String catalogueId = resultSet.getString("catalogueid");
                    String catalogueName = resultSet.getString("cataloguename");
                    product = new Product(productId, productName1, price, quantity, color, dercription, new Catalogue(catalogueId, catalogueName));
                    productList.add(product);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return productList;

    }

    @Override
    public Product update(int productId, Product product) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection!=null) {
            try {
                statement = connection.prepareStatement("update product set productname =?,price=?,quantity=?,color=?,description=? where productid=?");
                statement.setString(1,product.getProductName());
                statement.setInt(2,product.getPrice());
                statement.setInt(3,product.getQuantity());
                statement.setString(4,product.getColor());
                statement.setString(5,product.getDescription());
                statement.setString(6,product.getCatalogue().getCalatogueId());
                statement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return product;
    }

    @Override
    public void remove(int productId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement("delete from product where productid=?");
                statement.setInt(1, productId);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }  finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public Product findById(int productId) {
        Product product = null;
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement("select productid, productname, price, quantity, description, catalogue.catalogueid, cataloguename from product left join catalogue on catalogue.catalogueid = product.catalogueid where product.productid= ?");
                statement.setInt(1, productId);
                resultSet = statement.executeQuery();
                while (resultSet.next())
                {
                    int productId1 = resultSet.getInt("productid");
                    String productName = resultSet.getString("productname");
                    int price = resultSet.getInt("price");
                    int quantity = resultSet.getInt("quantity");
                    String color = resultSet.getString("color");
                    String dercription = resultSet.getString("dercription");
                    String catalogueId = resultSet.getString("catalogueid");
                    String catalogueName = resultSet.getString("cataloguename");
                    product = new Product(productId1, productName, price, quantity, color, dercription, new Catalogue(catalogueId, catalogueName));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }return product;
    }
}
