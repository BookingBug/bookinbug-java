package bookingbugAPI2.services;

import bookingbugAPI2.api.PublicURLS;
import bookingbugAPI2.models.HttpException;
import bookingbugAPI2.services.Http.PlainHttpService;
import org.junit.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertNotNull;


/**
 * Testing that the urls are available and receiving requests (the response is not relevant).
  */
public class PlainHttpServiceTest {

    private static final int CompanyId = 10;


    @Test
    public void companyDetails(){
        try {
            URL url = new URL(PublicURLS.Details.companyDetails().set("companyId", CompanyId).expand());
            assertNotNull(PlainHttpService.api_GET(url, true));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (HttpException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void eventGroupList(){
        try {
            URL url = new URL(PublicURLS.EventGroup.eventGroupList().set("companyId", CompanyId).expand());
            assertNotNull(PlainHttpService.api_GET(url, true));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (HttpException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void eventList(){
        try {
            URL url = new URL(PublicURLS.Event.eventList().set("companyId", CompanyId).expand());
            assertNotNull(PlainHttpService.api_GET(url, true));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (HttpException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void eventRead(){
        try {
            URL url = new URL(PublicURLS.Event.eventRead().set("companyId", CompanyId).expand());
            assertNotNull(PlainHttpService.api_GET(url, true));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (HttpException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void eventChainList(){
        try {
            URL url = new URL(PublicURLS.EventChain.eventChainList().set("companyId", CompanyId).expand());
            assertNotNull(PlainHttpService.api_GET(url, true));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (HttpException e) {
            e.printStackTrace();
        }
    }
}