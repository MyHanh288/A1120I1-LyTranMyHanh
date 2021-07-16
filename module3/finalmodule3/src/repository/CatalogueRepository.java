package repository;

import model.Catalogue;

import java.util.List;

public interface CatalogueRepository {
    List<Catalogue> findAll();
    Catalogue findById(String catalogueId);

}
