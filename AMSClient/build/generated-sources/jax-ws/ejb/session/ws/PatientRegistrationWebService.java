
package ejb.session.ws;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PatientRegistrationWebService", targetNamespace = "http://ws.session.ejb/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PatientRegistrationWebService {


    /**
     * 
     * @param newPatientEntity
     * @return
     *     returns ejb.session.ws.PatientEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createNewPatient", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.CreateNewPatient")
    @ResponseWrapper(localName = "createNewPatientResponse", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.CreateNewPatientResponse")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/createNewPatientRequest", output = "http://ws.session.ejb/PatientRegistrationWebService/createNewPatientResponse")
    public PatientEntity createNewPatient(
        @WebParam(name = "newPatientEntity", targetNamespace = "")
        PatientEntity newPatientEntity);

    /**
     * 
     * @param identityNumber
     * @param securityCode
     * @return
     *     returns ejb.session.ws.PatientEntity
     * @throws InvalidLoginException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "patientLogin", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.PatientLogin")
    @ResponseWrapper(localName = "patientLoginResponse", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.PatientLoginResponse")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/patientLoginRequest", output = "http://ws.session.ejb/PatientRegistrationWebService/patientLoginResponse", fault = {
        @FaultAction(className = InvalidLoginException_Exception.class, value = "http://ws.session.ejb/PatientRegistrationWebService/patientLogin/Fault/InvalidLoginException")
    })
    public PatientEntity patientLogin(
        @WebParam(name = "identityNumber", targetNamespace = "")
        String identityNumber,
        @WebParam(name = "securityCode", targetNamespace = "")
        String securityCode)
        throws InvalidLoginException_Exception
    ;

    /**
     * 
     * @param patientId
     * @throws PatientNotFoundException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deletePatient", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.DeletePatient")
    @ResponseWrapper(localName = "deletePatientResponse", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.DeletePatientResponse")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/deletePatientRequest", output = "http://ws.session.ejb/PatientRegistrationWebService/deletePatientResponse", fault = {
        @FaultAction(className = PatientNotFoundException_Exception.class, value = "http://ws.session.ejb/PatientRegistrationWebService/deletePatient/Fault/PatientNotFoundException")
    })
    public void deletePatient(
        @WebParam(name = "patientId", targetNamespace = "")
        Long patientId)
        throws PatientNotFoundException_Exception
    ;

    /**
     * 
     * @param patientEntity
     * @throws PatientNotFoundException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updatePatient", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.UpdatePatient")
    @ResponseWrapper(localName = "updatePatientResponse", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.UpdatePatientResponse")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/updatePatientRequest", output = "http://ws.session.ejb/PatientRegistrationWebService/updatePatientResponse", fault = {
        @FaultAction(className = PatientNotFoundException_Exception.class, value = "http://ws.session.ejb/PatientRegistrationWebService/updatePatient/Fault/PatientNotFoundException")
    })
    public void updatePatient(
        @WebParam(name = "patientEntity", targetNamespace = "")
        PatientEntity patientEntity)
        throws PatientNotFoundException_Exception
    ;

    /**
     * 
     * @param identityNumber
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "patientExistsByIdentityNumber", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.PatientExistsByIdentityNumber")
    @ResponseWrapper(localName = "patientExistsByIdentityNumberResponse", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.PatientExistsByIdentityNumberResponse")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/patientExistsByIdentityNumberRequest", output = "http://ws.session.ejb/PatientRegistrationWebService/patientExistsByIdentityNumberResponse")
    public boolean patientExistsByIdentityNumber(
        @WebParam(name = "identityNumber", targetNamespace = "")
        String identityNumber);

    /**
     * 
     * @return
     *     returns java.util.List<ejb.session.ws.PatientEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrieveAllPatients", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.RetrieveAllPatients")
    @ResponseWrapper(localName = "retrieveAllPatientsResponse", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.RetrieveAllPatientsResponse")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/retrieveAllPatientsRequest", output = "http://ws.session.ejb/PatientRegistrationWebService/retrieveAllPatientsResponse")
    public List<PatientEntity> retrieveAllPatients();

    /**
     * 
     * @param patientId
     * @return
     *     returns ejb.session.ws.PatientEntity
     * @throws PatientNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrievePatientByPatientId", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.RetrievePatientByPatientId")
    @ResponseWrapper(localName = "retrievePatientByPatientIdResponse", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.RetrievePatientByPatientIdResponse")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/retrievePatientByPatientIdRequest", output = "http://ws.session.ejb/PatientRegistrationWebService/retrievePatientByPatientIdResponse", fault = {
        @FaultAction(className = PatientNotFoundException_Exception.class, value = "http://ws.session.ejb/PatientRegistrationWebService/retrievePatientByPatientId/Fault/PatientNotFoundException")
    })
    public PatientEntity retrievePatientByPatientId(
        @WebParam(name = "patientId", targetNamespace = "")
        Long patientId)
        throws PatientNotFoundException_Exception
    ;

    /**
     * 
     * @param identityNumber
     * @return
     *     returns ejb.session.ws.PatientEntity
     * @throws PatientNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "retrievePatientByIdentityNumber", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.RetrievePatientByIdentityNumber")
    @ResponseWrapper(localName = "retrievePatientByIdentityNumberResponse", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.RetrievePatientByIdentityNumberResponse")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/retrievePatientByIdentityNumberRequest", output = "http://ws.session.ejb/PatientRegistrationWebService/retrievePatientByIdentityNumberResponse", fault = {
        @FaultAction(className = PatientNotFoundException_Exception.class, value = "http://ws.session.ejb/PatientRegistrationWebService/retrievePatientByIdentityNumber/Fault/PatientNotFoundException")
    })
    public PatientEntity retrievePatientByIdentityNumber(
        @WebParam(name = "identityNumber", targetNamespace = "")
        String identityNumber)
        throws PatientNotFoundException_Exception
    ;

    /**
     * 
     * @param patientId
     * @param doctorId
     * @param appointmentId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "deleteAppointment", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.DeleteAppointment")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/deleteAppointment")
    public void deleteAppointment(
        @WebParam(name = "appointmentId", targetNamespace = "")
        Long appointmentId,
        @WebParam(name = "patientId", targetNamespace = "")
        Long patientId,
        @WebParam(name = "doctorId", targetNamespace = "")
        Long doctorId);

    /**
     * 
     * @param patientId
     * @param appointmentId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addAppointmentToPatient", targetNamespace = "http://ws.session.ejb/", className = "ejb.session.ws.AddAppointmentToPatient")
    @Action(input = "http://ws.session.ejb/PatientRegistrationWebService/addAppointmentToPatient")
    public void addAppointmentToPatient(
        @WebParam(name = "patientId", targetNamespace = "")
        Long patientId,
        @WebParam(name = "appointmentId", targetNamespace = "")
        Long appointmentId);

}