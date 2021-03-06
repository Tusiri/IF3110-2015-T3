
package org.tusiri.ws.answer;

import java.util.List;
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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Answer", targetNamespace = "http://answer.ws.tusiri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Answer {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<org.tusiri.ws.answer.AnswerItem>
     * @throws IOException_Exception
     * @throws ClientProtocolException_Exception
     * @throws ParseException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAnswerList", targetNamespace = "http://answer.ws.tusiri.org/", className = "org.tusiri.ws.answer.GetAnswerList")
    @ResponseWrapper(localName = "getAnswerListResponse", targetNamespace = "http://answer.ws.tusiri.org/", className = "org.tusiri.ws.answer.GetAnswerListResponse")
    @Action(input = "http://answer.ws.tusiri.org/Answer/getAnswerListRequest", output = "http://answer.ws.tusiri.org/Answer/getAnswerListResponse", fault = {
        @FaultAction(className = ClientProtocolException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/getAnswerList/Fault/ClientProtocolException"),
        @FaultAction(className = IOException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/getAnswerList/Fault/IOException"),
        @FaultAction(className = ParseException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/getAnswerList/Fault/ParseException")
    })
    public List<AnswerItem> getAnswerList(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1)
        throws ClientProtocolException_Exception, IOException_Exception, ParseException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws ClientProtocolException_Exception
     * @throws IOException_Exception
     * @throws ParseException_Exception
     */
    @WebMethod(operationName = "AnswerVoteDown")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AnswerVoteDown", targetNamespace = "http://answer.ws.tusiri.org/", className = "org.tusiri.ws.answer.AnswerVoteDown")
    @ResponseWrapper(localName = "AnswerVoteDownResponse", targetNamespace = "http://answer.ws.tusiri.org/", className = "org.tusiri.ws.answer.AnswerVoteDownResponse")
    @Action(input = "http://answer.ws.tusiri.org/Answer/AnswerVoteDownRequest", output = "http://answer.ws.tusiri.org/Answer/AnswerVoteDownResponse", fault = {
        @FaultAction(className = ClientProtocolException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/AnswerVoteDown/Fault/ClientProtocolException"),
        @FaultAction(className = IOException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/AnswerVoteDown/Fault/IOException"),
        @FaultAction(className = ParseException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/AnswerVoteDown/Fault/ParseException")
    })
    public int answerVoteDown(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws ClientProtocolException_Exception, IOException_Exception, ParseException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws ClientProtocolException_Exception
     * @throws IOException_Exception
     * @throws ParseException_Exception
     */
    @WebMethod(operationName = "AnswerVoteUp")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AnswerVoteUp", targetNamespace = "http://answer.ws.tusiri.org/", className = "org.tusiri.ws.answer.AnswerVoteUp")
    @ResponseWrapper(localName = "AnswerVoteUpResponse", targetNamespace = "http://answer.ws.tusiri.org/", className = "org.tusiri.ws.answer.AnswerVoteUpResponse")
    @Action(input = "http://answer.ws.tusiri.org/Answer/AnswerVoteUpRequest", output = "http://answer.ws.tusiri.org/Answer/AnswerVoteUpResponse", fault = {
        @FaultAction(className = ClientProtocolException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/AnswerVoteUp/Fault/ClientProtocolException"),
        @FaultAction(className = IOException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/AnswerVoteUp/Fault/IOException"),
        @FaultAction(className = ParseException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/AnswerVoteUp/Fault/ParseException")
    })
    public int answerVoteUp(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1)
        throws ClientProtocolException_Exception, IOException_Exception, ParseException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     * @throws IOException_Exception
     * @throws ClientProtocolException_Exception
     * @throws ParseException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createAnswer", targetNamespace = "http://answer.ws.tusiri.org/", className = "org.tusiri.ws.answer.CreateAnswer")
    @ResponseWrapper(localName = "createAnswerResponse", targetNamespace = "http://answer.ws.tusiri.org/", className = "org.tusiri.ws.answer.CreateAnswerResponse")
    @Action(input = "http://answer.ws.tusiri.org/Answer/createAnswerRequest", output = "http://answer.ws.tusiri.org/Answer/createAnswerResponse", fault = {
        @FaultAction(className = ClientProtocolException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/createAnswer/Fault/ClientProtocolException"),
        @FaultAction(className = IOException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/createAnswer/Fault/IOException"),
        @FaultAction(className = ParseException_Exception.class, value = "http://answer.ws.tusiri.org/Answer/createAnswer/Fault/ParseException")
    })
    public int createAnswer(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2)
        throws ClientProtocolException_Exception, IOException_Exception, ParseException_Exception
    ;

}
