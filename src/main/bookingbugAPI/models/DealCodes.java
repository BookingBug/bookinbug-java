package bookingbugAPI.models;

import helpers.HttpServiceResponse;


public class DealCodes extends BBRoot {

    public DealCodes(HttpServiceResponse httpServiceResponse){
        super(httpServiceResponse);
    }


    public DealCodes(HttpServiceResponse httpServiceResponse, String auth_token){
        super(httpServiceResponse, auth_token);
    }


    public DealCodes() {}

}
