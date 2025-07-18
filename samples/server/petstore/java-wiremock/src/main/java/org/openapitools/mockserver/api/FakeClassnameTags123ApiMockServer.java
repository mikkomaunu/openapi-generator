/*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.15.0-SNAPSHOT).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.mockserver.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.http.Fault;

public class FakeClassnameTags123ApiMockServer {

    public static MappingBuilder stubTestClassname200(@javax.annotation.Nonnull String body, String response) {
        MappingBuilder stub = patch(urlPathEqualTo("/fake_classname_test"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withStatus(200)
                .withHeader("Content-Type", "application/json")
                .withBody(response)
            );


        return stub;
    }

    public static MappingBuilder stubTestClassnameFault(@javax.annotation.Nonnull String body, Fault fault) {
        MappingBuilder stub = patch(urlPathEqualTo("/fake_classname_test"))
            .withHeader("Accept", havingExactly("application/json"))
            .withHeader("Content-Type", havingExactly("application/json"))
            .withHeader("Authorization", matching(".*"))
            .withRequestBody(equalToJson(body))
            .willReturn(aResponse()
                .withFault(fault)
            );


        return stub;
    }

    public static String testClassname200ResponseSample1() {
        return "{ \"client\" : \"client\" }";
    }

    public static String testClassnameRequestSample1() {
        return "{ \"client\" : \"client\" }";
    }


}
