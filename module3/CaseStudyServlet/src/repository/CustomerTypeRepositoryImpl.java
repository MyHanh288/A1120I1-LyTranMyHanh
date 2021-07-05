package repository;

import model.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository{

    @Override
    public List<CustomerType> findAll() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if( connection != null)
        {
            try{
                statement = connection.prepareStatement("select * from customertype");
                resultSet = statement.executeQuery();
                CustomerType customerType = null;
                while (resultSet.next())
                {
                    String customerTypeId = resultSet.getString("CustomerTypeId");
                    String customerTypeName = resultSet.getString("CustomerTypeName");
                    customerType = new CustomerType(customerTypeId, customerTypeName);
                    customerTypeList.add(customerType);
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
        return customerTypeList;
    }

    @Override
    public CustomerType findById(String customerTypeId) {
        CustomerType customerType = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection!=null){
            try {
                statement = connection.prepareStatement("select * from customertype where CustomerTypeId = ?");
                statement.setString(1, customerTypeId);
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    String customerTypeName = resultSet.getString("CustomerTypeName");
                    customerType = new CustomerType(customerTypeName);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return customerType;
    }
}
