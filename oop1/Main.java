package oop1;

public class Main{
    public static void main(String[] args) {
        Product product1 = new Product();
		product1.setName("Delongi Coffee Machine");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product();
		product2.setName("Smeg Coffee Machine");
		product2.setDiscount(8);
		product2.setUnitPrice(8500);
		product2.setUnitsInStock(2);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Kitchen Aid Coffee Machine");
		product3.setDiscount(9);
		product3.setUnitPrice(4500);
		product3.setUnitsInStock(6);
		product3.setImageUrl("image3.jpg");
		
		Product[] products = {product1,product2,product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getDiscount());
			System.out.println(product.getUnitPrice());
			System.out.println(product.getUnitsInStock());
			System.out.println(product.getImageUrl());
			System.out.println("-------------------");
		}

        IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0533333333");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer };
		
		for (Customer customer : customers) {
			System.out.println(customer.getId());
			System.out.println(customer.getPhone());
			System.out.println(customer.getCustomerNumber());
		}
    }
}