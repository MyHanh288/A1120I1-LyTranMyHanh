package repository;

import model.Customer;
import model.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if( connection != null)
        {
            try{
                statement = connection.prepareStatement("select CustomerId,CustomerName,CustomerBir,Gender,CusIdNum,CusTelNum,CusEmail,Address,Customer.CustomerTypeId,CustomerTypeName from Customer left join CustomerType on CustomerType.CustomerTypeId = Customer.CustomerTypeId");
                resultSet = statement.executeQuery();
                Customer customer = null;
                while (resultSet.next())
                {
                    int customerId = resultSet.getInt("CustomerId");
                    String customerName = resultSet.getString("CustomerName");
                    String customerBir = resultSet.getString("CustomerBir");
                    String gender = resultSet.getString("Gender");
                    int cusIdNum = resultSet.getInt("CusIdNum");
                    int cusTelNum = resultSet.getInt("CusTelNum");
                    String cusEmail = resultSet.getString("CusEmail");
                    String address = resultSet.getString("Address");
                    String customerTypeId = resultSet.getString("CustomerTypeId");
                    String customerTypeName = resultSet.getString("CustomerTypeName");
                    customer = new Customer( customerId,customerName,customerBir,gender,cusIdNum,cusTelNum,cusEmail,address, new CustomerType(customerTypeId,customerTypeName));
                    customerList.add(customer);
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
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement("insert into Customer(CustomerName, CustomerBir, Gender, CusIdNum, CusTelNum, CusEmail, Address, CustomerTypeId) values (?,?,?,?,?,?,?,?) ;");
                statement.setString(1,customer.getCustomerName());
                statement.setString(2,customer.getCustomerBir());
                statement.setString(3, customer.getGender());
                statement.setInt(4,customer.getCusIdNum());
                statement.setInt(5,customer.getCusTelNum());
                statement.setString(6,customer.getCusEmail());
                statement.setString(7,customer.getAddress());
                statement.setString(8,customer.getCustomerType().getCustomerTypeId());
                System.out.println("da them " + statement);
                statement.executeUpdate();
                System.out.println("da them 2 " + statement);
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
    public List<Customer> findByName(String customerName) {
        List<Customer> customerList = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement("select CustomerId,CustomerName,CustomerBir,Gender,CusIdNum,CusTelNum,CusEmail,Address,CustomerTypeName,CustomerType.CustomerTypeId from Customer left join CustomerType on CustomerType.CustomerTypeId = Customer.CustomerTypeId where Customer.CustomerName= ?");
                statement.setString(1, customerName);
                resultSet = statement.executeQuery();
                Customer customer = null;
                while (resultSet.next())
                {
                    int customerId = resultSet.getInt("CustomerId");
                    String customerName1 = resultSet.getString("CustomerName");
                    String customerBir = resultSet.getString("CustomerBir");
                    String gender = resultSet.getString("Gender");
                    int cusIdNum = resultSet.getInt("CusIdNum");
                    int cusTelNum = resultSet.getInt("CusTelNum");
                    String cusEmail = resultSet.getString("CusEmail");
                    String address = resultSet.getString("Address");
                    String customerTypeId = resultSet.getString("CustomerTypeId");
                    String customerTypeName = resultSet.getString("CustomerTypeName");
                    customer = new Customer(customerId,customerName1,customerBir,gender,cusIdNum,cusTelNum,cusEmail,address, new CustomerType(customerTypeId,customerTypeName));
                    customerList.add(customer);
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
        return customerList;

    }

    @Override
    public Customer update(int customerId, Customer customer) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection!=null) {
            try {
                statement = connection.prepareStatement("update Customer set CustomerName =?,CustomerBir=?,Gender=?,CusIdNum=? ,CusTelNum=? ,CusEmail=? ,Address=?  ,CustomerTypeId=? where CustomerId=? ;");
                statement.setString(1, customer.getCustomerName());
                statement.setString(2, customer.getCustomerBir());
                statement.setString(3, customer.getGender());
                statement.setInt(4, customer.getCusIdNum());
                statement.setInt(5, customer.getCusTelNum());
                statement.setString(6, customer.getCusEmail());
                statement.setString(7, customer.getAddress());
                statement.setString(8, customer.getCustomerType().getCustomerTypeId());
                statement.setInt(9, customerId);
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
        return customer;
    }

    @Override
    public void remove(int customerId) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement("delete from Customer where CustomerId=?");
                statement.setInt(1, customerId);
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
    public Customer findById(int customerId) {
        Customer customer = null;
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement("select CustomerId,CustomerName,CustomerBir,Gender,CusIdNum,CusTelNum,CusEmail,Address,CustomerTypeName,CustomerType.CustomerTypeId from Customer inner join CustomerType on CustomerType.CustomerTypeId = Customer.CustomerTypeId where Customer.CustomerId= ?;");
                statement.setInt(1, customerId);
                System.out.println("id truyen sang:"+ customerId);
                resultSet = statement.executeQuery();
                while (resultSet.next())
                {
                    int customerId1 = resultSet.getInt("CustomerId");
                    String customerName1 = resultSet.getString("CustomerName");
                    String customerBir = resultSet.getString("CustomerBir");
                    String gender = resultSet.getString("Gender");
                    int cusIdNum = resultSet.getInt("CusIdNum");
                    int cusTelNum = resultSet.getInt("CusTelNum");
                    String cusEmail = resultSet.getString("CusEmail");
                    String address = resultSet.getString("Address");
                    String customerTypeName = resultSet.getString("CustomerTypeName");
                    String customerTypeId = resultSet.getString("CustomerTypeId");

                    System.out.println("id dang chinh sua la :" + customerId1);
                    customer = new Customer(customerId1,customerName1,customerBir,gender,cusIdNum,cusTelNum,cusEmail,address, new CustomerType(customerTypeId,customerTypeName));
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
        }return customer;
    }
}
