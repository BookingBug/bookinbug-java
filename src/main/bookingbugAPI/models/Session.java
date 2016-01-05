package bookingbugAPI.models;

import helpers.HttpServiceResponse;


public class Session extends BBRoot {


    public Session(HttpServiceResponse httpServiceResponse){
        super(httpServiceResponse);
    }


    public Session(HttpServiceResponse httpServiceResponse, String auth_token){
        super(httpServiceResponse, auth_token);
    }


    public Session() {}

}
