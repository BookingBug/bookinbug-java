package bookingbugAPI.models;

import helpers.HttpServiceResponse;


public class Product extends BBRoot {


    public Product(HttpServiceResponse httpServiceResponse) {
        super(httpServiceResponse);
    }


    public Product(HttpServiceResponse httpServiceResponse, String auth_token) {
        super(httpServiceResponse, auth_token);
    }


    public Product() { }

}
