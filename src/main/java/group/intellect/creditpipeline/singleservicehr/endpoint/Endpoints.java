package group.intellect.creditpipeline.singleservicehr.endpoint;

import group.intellect.creditpipeline.singleservicehr.soap.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
@Slf4j
public class Endpoints {
    private static final  String NAMESPACE_URI = "http://soap.singleservicehr.creditpipeline.intellect.group/";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createEmployee")
    @ResponsePayload
    public CreateEmployeeResponse createEmployee(@RequestPayload CreateEmployee createEmployee) {
        log.debug("Got createEmloyee request{}", createEmployee);
        CreateEmployeeResponse createEmployeeResponse = new CreateEmployeeResponse();

        return createEmployeeResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createSubdivision")
    @ResponsePayload
    public CreateSubdivisionResponse createSubdivisionResponse(@RequestPayload CreateSubdivision createSubdivision) {
        log.debug("Got createSubdivision request{}", createSubdivision);
        CreateSubdivisionResponse createSubdivisionResponse = new CreateSubdivisionResponse();

        return createSubdivisionResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUser")
    @ResponsePayload
    public CreateUserResponse createUserResponse(@RequestPayload CreateUser createUser) {
        log.debug("Got createUser request{}", createUser);
        CreateUserResponse createUserResponse = new CreateUserResponse();

        return createUserResponse;
    }



}
