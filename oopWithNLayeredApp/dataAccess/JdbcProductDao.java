package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Added to database with JDBC");
    }
    
}
