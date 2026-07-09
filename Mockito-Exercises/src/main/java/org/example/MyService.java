package org.example;

public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public String fetchUser(int id) {
        return api.getUserById(id);
    }

    public void save(String data) {
        api.saveData(data);
    }

    public void delete() {
        api.deleteData();
    }
}