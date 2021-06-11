package com.company;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Catalog> subCatalog;
    private List<Document> subFiles;
    private boolean parent_catalog;
    public Catalog(String catalogName, List<Catalog> subCatalog, List<Document> subFiles, boolean parent_catalog){
        this.name = catalogName;
        this.subCatalog = subCatalog;
        this.subFiles = subFiles;
        this.parent_catalog = parent_catalog;
    }
    public Catalog(String catalogName){
        this.name = catalogName;
        this.subCatalog = new ArrayList<Catalog>();
        this.subFiles = new ArrayList<Document>();
        this.parent_catalog = false;
    }
    public void addDocument(Document document){
        this.subFiles.add(document);

        }
    public void deleteDocument(Document document){
        this.subFiles.remove(document);
    }
    public void addCatalog(Catalog catalog){
        this.subCatalog.add(catalog);
    }
    public void deleteCatalog(Catalog catalog){
        this.subCatalog.remove(catalog);
    }
    public void setName(String name){this.name=name;}
    public void setParent_catalog(boolean parent_catalog){this.parent_catalog = parent_catalog;}
    public void setSubFiles(List<Document> subFiles){this.subFiles = subFiles;}
    public List<Document> getSubFiles(){return subFiles;}


    public void delete() {
        this.subFiles.clear();
        this.subCatalog.clear();
    }
}