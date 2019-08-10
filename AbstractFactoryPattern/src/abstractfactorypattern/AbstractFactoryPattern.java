/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorypattern;

import connection.Customer;
import connection.CustomerDAO;
import connection.DAOFactory;
import java.util.Collection;

/**
 *
 * @author Sergio Ramirez
 */
public class AbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");

        // create the required DAO Factory
        DAOFactory cloudscapeFactory = DAOFactory.getDAOFactory(DAOFactory.CLOUDSCAPE);

// Create a DAO
        CustomerDAO custDAO
                = cloudscapeFactory.getCustomerDAO();

// create a new customer
        int newCustNo = custDAO.insertCustomer();

// Find a customer object. Get the Transfer Object.
        Customer cust = custDAO.findCustomer();

// modify the values in the Transfer Object.
       // cust.setAddress();
       // cust.setEmail();
// update the customer object using the DAO
       // custDAO.updateCustomer(cust);

// delete a customer object
        custDAO.deleteCustomer();
// select all customers in the same city 
        Customer criteria = new Customer();
        criteria.setCity("New York");
        //Collection customersList = custDAO.selectCustomersTO(criteria);
// returns customersList - collection of Customer
// Transfer Objects. iterate through this collection to
// get values.
    }

}
