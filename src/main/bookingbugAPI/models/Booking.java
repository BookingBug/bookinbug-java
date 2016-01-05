package bookingbugAPI.models;

import bookingbugAPI.services.HttpService;
import com.damnhandy.uri.template.UriTemplate;
import helpers.HttpServiceResponse;

import java.io.IOException;
import java.net.URL;


public class Booking extends BBRoot {

    /*
    private String updated_at;
    private String company_id;
    private String session_id;
    private String settings;
    private String questions;
    private String on_waitlist;
    private String duration;
    private String client_email;
    private String id;
    private String slot_id;
    private String is_cancelled;
    private String client_name;
    private String client_mobile;
    private String attended;
    private String full_describe;
    private String channel;
    private String notes;
    private String service_id;
    private String client_id;
    private String service_name;
    private String status;
    private String multi_status;
    private String created_at;
    private String price;
    private String datetime;
    private String resource_name;
    private String slot_settings;
    private String quantity;
    private String booking_updated;
    private String client_phone;
    private String resource_id;
    private String purchase_id;
    private String member_id;
    private String paid;
    private String purchase_ref;
    */

    public Booking(HttpServiceResponse httpServiceResponse, String auth_token) {
        super(httpServiceResponse, auth_token);
    }

    public Booking(HttpServiceResponse response) {
        super(response);
    }


    public BBRoot getSchema() throws IOException {
        String link = getRep().getLinkByRel("edit").getHref();
        URL url = new URL(UriTemplate.fromTemplate(link).expand());
        return new BBRoot(HttpService.api_GET(url, auth_token));
    }


    public String getFirstName() {
        return get("first_name");
    }

    public String getLastName() {
        return get("last_name");
    }

    public String getEmail() {
        return get("email");
    }

    public String getAddress1() {
        return get("address1");
    }

    public String getAddress2() {
        return get("address2");
    }

    public String getAddress3() {
        return get("address3");
    }

    public String getAddress4() {
        return get("address4");
    }

    public String getPostCode() {
        return get("postcode");
    }


    public String getDuration() {
        return get("duration");
    }

    public String getUpdated_at() {
        return get("updated_at");
    }

    public String getCompany_id() {
        return get("company_id");
    }

    public String getSession_id() {
        return get("session_id");
    }

    public String getSettings() {
        return get("settings");
    }

    public String getQuestions() {
        return get("questions");
    }

    public String getOn_waitlist() {
        return get("on_waitlist");
    }

    public String getClient_email() {
        return get("client_email");
    }

    public String getId() {
        return get("id");
    }

    public String getSlot_id() {
        return get("slot_id");
    }

    public String getIs_cancelled() {
        return get("is_cancelled");
    }

    public String getClient_name() {
        return get("client_name");
    }

    public String getClient_mobile() {
        return get("client_mobile");
    }

    public String getAttended() {
        return get("attended");
    }

    public String getFull_describe() {
        return get("full_describe");
    }

    public String getChannel() {
        return get("channel");
    }

    public String getNotes() {
        return get("notes");
    }

    public String getService_id() {
        return get("service_id");
    }

    public String getClient_id() {
        return get("client_id");
    }

    public String getService_name() {
        return get("service_name");
    }

    public String getStatus() {
        return get("status");
    }

    public String getMulti_status() {
        return get("multi_status");
    }

    public String getCreated_at() {
        return get("created_at");
    }

    public String getPrice() {
        return get("price");
    }

    public String getDatetime() {
        return get("datetime");
    }

    public String getResource_name() {
        return get("resource_name");
    }

    public String getSlot_settings() {
        return get("slot_settings");
    }

    public String getQuantity() {
        return get("quantity");
    }

    public String getBooking_updated() {
        return get("booking_updated");
    }

    public String getClient_phone() {
        return get("client_phone");
    }

    public String getResource_id() {
        return get("resource_id");
    }

    public String getPurchase_id() {
        return get("purchase_id");
    }

    public String getMember_id() {
        return get("member_id");
    }

    public String getPaid() {
        return get("paid");
    }

    public String getPurchase_ref() {
        return get("purchase_ref");
    }
}
