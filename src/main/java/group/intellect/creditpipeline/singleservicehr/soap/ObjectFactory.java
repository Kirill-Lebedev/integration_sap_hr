
package group.intellect.creditpipeline.singleservicehr.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the group.intellect.creditpipeline.singleservicehr.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateEmployee_QNAME = new QName("http://soap.singleservicehr.creditpipeline.intellect.group/", "createEmployee");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://soap.singleservicehr.creditpipeline.intellect.group/", "createEmployeeResponse");
    private final static QName _CreateSubdivision_QNAME = new QName("http://soap.singleservicehr.creditpipeline.intellect.group/", "createSubdivision");
    private final static QName _CreateSubdivisionResponse_QNAME = new QName("http://soap.singleservicehr.creditpipeline.intellect.group/", "createSubdivisionResponse");
    private final static QName _CreateUser_QNAME = new QName("http://soap.singleservicehr.creditpipeline.intellect.group/", "createUser");
    private final static QName _CreateUserResponse_QNAME = new QName("http://soap.singleservicehr.creditpipeline.intellect.group/", "createUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: group.intellect.creditpipeline.singleservicehr.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateEmployee }
     * 
     */
    public CreateEmployee createCreateEmployee() {
        return new CreateEmployee();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link CreateSubdivision }
     * 
     */
    public CreateSubdivision createCreateSubdivision() {
        return new CreateSubdivision();
    }

    /**
     * Create an instance of {@link CreateSubdivisionResponse }
     * 
     */
    public CreateSubdivisionResponse createCreateSubdivisionResponse() {
        return new CreateSubdivisionResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link EmployeeCreationRequest }
     * 
     */
    public EmployeeCreationRequest createEmployeeCreationRequest() {
        return new EmployeeCreationRequest();
    }

    /**
     * Create an instance of {@link EmployeeCreationResponce }
     * 
     */
    public EmployeeCreationResponce createEmployeeCreationResponce() {
        return new EmployeeCreationResponce();
    }

    /**
     * Create an instance of {@link SubdivisionCreationRequest }
     * 
     */
    public SubdivisionCreationRequest createSubdivisionCreationRequest() {
        return new SubdivisionCreationRequest();
    }

    /**
     * Create an instance of {@link SubdivisionCreationResponce }
     * 
     */
    public SubdivisionCreationResponce createSubdivisionCreationResponce() {
        return new SubdivisionCreationResponce();
    }

    /**
     * Create an instance of {@link UserCreationRequest }
     * 
     */
    public UserCreationRequest createUserCreationRequest() {
        return new UserCreationRequest();
    }

    /**
     * Create an instance of {@link UserCreationResponce }
     * 
     */
    public UserCreationResponce createUserCreationResponce() {
        return new UserCreationResponce();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.singleservicehr.creditpipeline.intellect.group/", name = "createEmployee")
    public JAXBElement<CreateEmployee> createCreateEmployee(CreateEmployee value) {
        return new JAXBElement<CreateEmployee>(_CreateEmployee_QNAME, CreateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.singleservicehr.creditpipeline.intellect.group/", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSubdivision }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSubdivision }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.singleservicehr.creditpipeline.intellect.group/", name = "createSubdivision")
    public JAXBElement<CreateSubdivision> createCreateSubdivision(CreateSubdivision value) {
        return new JAXBElement<CreateSubdivision>(_CreateSubdivision_QNAME, CreateSubdivision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSubdivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSubdivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.singleservicehr.creditpipeline.intellect.group/", name = "createSubdivisionResponse")
    public JAXBElement<CreateSubdivisionResponse> createCreateSubdivisionResponse(CreateSubdivisionResponse value) {
        return new JAXBElement<CreateSubdivisionResponse>(_CreateSubdivisionResponse_QNAME, CreateSubdivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.singleservicehr.creditpipeline.intellect.group/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.singleservicehr.creditpipeline.intellect.group/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

}
