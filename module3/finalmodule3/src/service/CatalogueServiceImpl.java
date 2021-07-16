package service;

import model.Catalogue;
import repository.CatalogueRepository;
import repository.CatalogueRepositoryImpl;

import java.util.List;

public class CatalogueServiceImpl implements CatalogueService{
    private CatalogueRepository catalogueRepository = new CatalogueRepositoryImpl();

    @Override
    public List<Catalogue> findAll() {
        return catalogueRepository.findAll();
    }

    @Override
    public Catalogue findById(String catalogueId) {
        return catalogueRepository.findById(catalogueId);
    }
}
