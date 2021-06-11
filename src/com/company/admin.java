package com.company;

import java.io.IOException;
import java.util.List;

public class admin {
    public void DeleteDocument(Catalog catalog,Document document) throws IOException {
        List<Document> targetItem = catalog.getSubFiles();
        int len = targetItem.size();
        for (int i = 0; i < len; i++) {
            if (targetItem.get(i).equals(document)) {
                targetItem.remove(i);
            }
        }
    }

    public void DeleteCatalog(String title) throws IOException {
        Catalog Catalog = new Catalog(title);
        Catalog.delete();


    }
    public void MoveDocument(Catalog catalog_src,Catalog catalog_dest,Document document) throws IOException {
        catalog_src.deleteDocument(document);
        catalog_dest.addDocument(document);
    }
}
