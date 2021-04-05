package group.intellect.creditpipeline.singleservicehr.endpoint;

import group.intellect.creditpipeline.singleservicehr.soap.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;


@Endpoint
@Slf4j
public class Endpoints {
    private static final String NAMESPACE_URI = "http://soap.singleservicehr.creditpipeline.intellect.group";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createEmployee")
    @ResponsePayload
    public JAXBElement<CreateEmployeeResponse> createEmployee(@RequestPayload JAXBElement<CreateEmployee> createEmployee) {
        log.debug("Got createEmloyee request{}", createEmployee.getValue());

        return createJaxbElement(new CreateEmployeeResponse(), CreateEmployeeResponse.class);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createSubdivision")
    @ResponsePayload
    public JAXBElement<CreateSubdivisionResponse> createSubdivision(@RequestPayload JAXBElement<CreateSubdivision> createSubdivision) {
        log.debug("Got createSubdivision request{}", createSubdivision.getValue());
       /* CreateSubdivisionResponse createSubdivisionResponse = new CreateSubdivisionResponse();
        SubdivisionCreationResponce subdivisionCreationResponce = new SubdivisionCreationResponce();
        subdivisionCreationResponce.setResult(Result.SUCCESS);
        createSubdivisionResponse.setReturn(subdivisionCreationResponce);*/

        return createJaxbElement(new CreateSubdivisionResponse(), CreateSubdivisionResponse.class);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createUser")
    @ResponsePayload
    public JAXBElement<CreateUserResponse> createUser(@RequestPayload JAXBElement<CreateUser> createUser) {
        log.debug("Got createUser request{}", createUser.getValue());

        return createJaxbElement(new CreateUserResponse(), CreateUserResponse.class);
    }

    private <T> JAXBElement<T> createJaxbElement(T object, Class<T> clazz) {
        return new JAXBElement<>(new QName(clazz.getSimpleName()), clazz, object);
    }

}
