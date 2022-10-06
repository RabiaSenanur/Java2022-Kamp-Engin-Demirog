package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
    }

    public void add(Product product) throws Exception{
       if(product.getUnitPrice()<10){
        throw new Exception("The product price cannot be less than 10.");
       } 

       for (Logger logger : loggers) {
        logger.log(product.getName());
       }
       productDao.add(product);
    }
    
}