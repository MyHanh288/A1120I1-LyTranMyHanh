package repository;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {

    public static final String SELECT_FROM_USERS = "SELECT * FROM users";
    public static final String INSERT_INTO_USERS_NAME_EMAIL_COUNTRY_VALUE = "INSERT INTO users(name, email, country) VALUE (?,?,?)";
    public static final String SELECT_FROM_USERS_WHERE_NAME = "select * from users where name =?";
    public static final String SELECT_FROM_USERS_WHERE_ID = "select * from users where id =?";
    public static final String UPDATE_USERS_SET_NAME_EMAIL_COUNTRY_WHERE_ID = "update users set name = ?,email=?,country=? where id =?";
    public static final String DELETE_FROM_USERS_WHERE_ID = "delete from users where id = ?";
    public static final String SELECT_FROM_USERS_WHERE_COUNTRY = "select  * from users where country=?";
    public static final String SELECT_FROM_USERS_ORDER_BY_NAME = "select * from users order by name";

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_FROM_USERS);
                resultSet = statement.executeQuery();
                User user = null;
                System.out.println(statement);
                while (resultSet.next())
                {
                    int id = resultSet.getInt(1);
                    System.out.println(resultSet.getInt(1));
                    String name= resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user= new User(id,name,email,country);
                    userList.add(user);
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
        return userList;
    }

    @Override
    public void save(User user) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        if (connection != null) {
            try {
                statement = connection.prepareStatement(INSERT_INTO_USERS_NAME_EMAIL_COUNTRY_VALUE);
                statement.setString(1, user.getName());
                statement.setString(2, user.getEmail());
                statement.setString(3, user.getCountry());

                statement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                DBConnection.close();
            }
        }
    }

    @Override
    public List<User> findByName(String name) {
        List<User> userList = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_FROM_USERS_WHERE_NAME);
                statement.setString(1,name);
                resultSet = statement.executeQuery();
                User user = null;
                while (resultSet.next())
                {
                    int id = resultSet.getInt(1);
                    String names = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user = new User(id,names,email,country);
                    userList.add(user);
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
        return userList;
    }

    @Override
    public User update(int id, User user) {
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(UPDATE_USERS_SET_NAME_EMAIL_COUNTRY_WHERE_ID);
                statement.setInt(4,id);
                statement.setString(1,user.getName());
                statement.setString(2,user.getEmail());
                statement.setString(3,user.getCountry());
                System.out.println("Id" +statement);
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            catch (NullPointerException e)
            {
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
        return user;
    }

    @Override
    public void remove(int id) {
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(DELETE_FROM_USERS_WHERE_ID);
                statement.setInt(1,id);
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
    public User findById(int id) {
        User user = null;
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_FROM_USERS_WHERE_ID);
                statement.setInt(1, id);
                resultSet = statement.executeQuery();
                while (resultSet.next())
                {
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user= new User(name,email,country);
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
        return  user;
    }

    @Override
    public List<User> findByCountry(String country) {
        List<User> userList = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_FROM_USERS_WHERE_COUNTRY);
                statement.setString(1,country);
                resultSet = statement.executeQuery();
                User user = null;
                while (resultSet.next())
                {
                    int id = resultSet.getInt(1);
                    String names= resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String countrys = resultSet.getString("country");
                    user= new User(id,names,email,countrys);
                    userList.add(user);
                    System.out.println("user"+user);
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
        return userList;
    }

    @Override
    public List<User> sort() {
        List<User> userList = new ArrayList<>();
        Connection connection= DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection != null)
        {
            try{
                statement = connection.prepareStatement(SELECT_FROM_USERS_ORDER_BY_NAME);
                resultSet = statement.executeQuery();
                User user = null;
                while (resultSet.next())
                {
                    int id = resultSet.getInt(1);
                    String name= resultSet.getString("name");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user= new User(id,name,email,country);
                    userList.add(user);
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
        return userList;
    }

    public User getUserById(int id) {
        Connection connection = DBConnection.getConnection();
        CallableStatement callableStatement = null;
        String name = "";
        String email = "";
        String country = "";
        User user = null;

        if (connection != null) {
            try {
                callableStatement = connection.prepareCall("call get_user_by_id(?)");
                callableStatement.setInt(1, id);
                callableStatement.executeQuery();
                name = callableStatement.getString(2);
                email = callableStatement.getString(3);
                country = callableStatement.getString(4);
                user = new User(id, name, email, country);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    callableStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }
        return user;
    }

    public void insertUser(User user){
        Connection connection = DBConnection.getConnection();
        CallableStatement callableStatement = null;
        if(connection!=null){
            try {
                callableStatement = connection.prepareCall("call insert_user(?,?,?)");
                callableStatement.setString(1,user.getName());
                callableStatement.setString(2,user.getEmail());
                callableStatement.setString(3,user.getCountry());
                callableStatement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    callableStatement.close();
                } catch (SQLException e) {
                     e.printStackTrace();
                }
                   DBConnection.close();
            }
        }
    }

    public void addUserTransaction(User user, int[] permisions) {
        
    }

}