package service;

import model.Catalogue;

import java.util.List;

public interface CatalogueService {
    List<Catalogue> findAll();
    Catalogue findById(String catalogueId);
}
