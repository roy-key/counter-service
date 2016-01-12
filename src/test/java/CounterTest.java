import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.roykey.app.CounterApp;
import org.apache.http.HttpStatus;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Created by roykey on 11/01/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CounterApp.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebIntegrationTest("server.port:0")
public class CounterTest {

    @Value("${local.server.port}")
    private int serverPort;

    private static String id;

    @Before
    public void setUp() {
        RestAssured.port = serverPort;
    }

    @Test
    public void a_create_counter(){

        Response response =
                expect().
                        body("responseStatus", equalTo((0))).
                        body("responseObject.id", notNullValue()).
                        body("responseObject.counterValue", equalTo(0)).
                        statusCode(HttpStatus.SC_OK).
                when().
                        post("counters");

        extractIdFromResponse(response);

    }

    @Test
    public void b_add_to_counter(){

        Response response =
                expect().
                        body("responseStatus", equalTo((0))).
                        body("responseObject.id", equalTo(id)).
                        body("responseObject.counterValue", equalTo(1)).
                        statusCode(HttpStatus.SC_OK).
                 when().
                        post("counters/" + id + "/add");

    }

    @Test
    public void c_subtract_from_counter(){

        Response response =
                expect().
                        body("responseStatus", equalTo((0))).
                        body("responseObject.id", equalTo(id)).
                        body("responseObject.counterValue", equalTo(0)).
                        statusCode(HttpStatus.SC_OK).
                        when().
                        post("counters/" + id + "/subtract");
    }

    @Test
    public void d_get_counter_details() {

        Response response =
                expect().
                        body("responseStatus", equalTo((0))).
                        body("responseObject.id", equalTo(id)).
                        body("responseObject.counterValue", equalTo(0)).
                        statusCode(HttpStatus.SC_OK).
                        when().
                        get("counters/" + id);
    }

    @Test
    public void e_get_counter_details_of_unknown_id() {

        Response response =
                expect().
                        body("responseStatus", equalTo((1001))).
                        body("responseObject.errorMessage", equalTo("counterId: abc wasn't found, please check your id and try again")).
                        statusCode(HttpStatus.SC_NOT_FOUND).
                        when().
                        get("counters/" + "abc");
    }

    @Test
    public void f_get_all_counters_details() {

        Response response =
                expect().
                        body("responseStatus", equalTo((0))).
                        body("responseObject.counterResponseList", notNullValue()).
                        statusCode(HttpStatus.SC_OK).
                        log().body().
                        when().
                        get("counters");
    }



    private void extractIdFromResponse(Response response) {
        JsonPath jsonPath = new JsonPath(response.getBody().asString());
        HashMap<String, String> responseObject = jsonPath.get("responseObject");
        id = responseObject.get("id");
    }


}
