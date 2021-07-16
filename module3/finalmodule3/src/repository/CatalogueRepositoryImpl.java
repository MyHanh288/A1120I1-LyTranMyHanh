package repository;

import model.Catalogue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CatalogueRepositoryImpl implements CatalogueRepository{
    @Override
    public List<Catalogue> findAll() {
        List<Catalogue> catalogueList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if( connection != null)
        {
            try{
                statement = connection.prepareStatement("select * from catalogue");
                resultSet = statement.executeQuery();
                Catalogue catalogue = null;
                while (resultSet.next())
                {
                    String catalogueId = resultSet.getString("CatalogueId");
                    String catalogueName = resultSet.getString("CatalogueName");
                    catalogue = new Catalogue(catalogueId,catalogueName);
                    catalogueList.add(catalogue);
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
        return catalogueList;
    }


    @Override
    public Catalogue findById(String catalogueId) {
        Catalogue catalogue = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        if(connection!=null){
            try {
                statement = connection.prepareStatement("select * from catalogue where catalogueid = ?");
                statement.setString(1, catalogueId);
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    String catalogueName = resultSet.getString("CatalogueName");
                    catalogue = new Catalogue(catalogueName);
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
        return catalogue;
    }
}
