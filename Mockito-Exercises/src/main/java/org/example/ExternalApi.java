package org.example;

public interface ExternalApi {

    String getData();

    String getUserById(int id);

    void saveData(String data);

    void deleteData();
}