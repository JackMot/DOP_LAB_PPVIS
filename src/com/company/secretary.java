package com.company;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class secretary
{
    public Document FindDocumentByAuthor(Catalog catalog, String author) {
        List<Document> targetItem = catalog.getSubFiles();
        int len = targetItem.size();
        for (int i = 0; i < len; i++) {
            if (targetItem.get(i).getAuthor().equals(author)) {
                return targetItem.get(i);
            }
        }
        return null;
    }
    public Document FindDocumentByName(Catalog catalog, String name) {
        List<Document> targetItem = catalog.getSubFiles();
        int len = targetItem.size();
        for (int i = 0; i < len; i++) {
            if (targetItem.get(i).getName().equals(name)) {
                return targetItem.get(i);
            }
        }
        return null;
    }

    public void AddFileInCatalog(Catalog target_catalog,Document document) throws IOException {
        target_catalog.addDocument(document);
    }
}