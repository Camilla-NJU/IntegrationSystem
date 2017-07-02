
package bank;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BankPort", targetNamespace = "http://bank/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankPort {


    /**
     * 
     * @param amount
     * @param target
     * @param account
     * @param password
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "transfer", targetNamespace = "http://bank/", className = "retail.bank.Transfer")
    @ResponseWrapper(localName = "transferResponse", targetNamespace = "http://bank/", className = "retail.bank.TransferResponse")
    @Action(input = "http://bank/BankPort/transferRequest", output = "http://bank/BankPort/transferResponse")
    public boolean transfer(
            @WebParam(name = "account", targetNamespace = "")
                    String account,
            @WebParam(name = "password", targetNamespace = "")
                    String password,
            @WebParam(name = "target", targetNamespace = "")
                    String target,
            @WebParam(name = "amount", targetNamespace = "")
                    double amount);

    /**
     * 
     * @param account
     * @param password
     * @return
     *     returns java.util.List<retail.bank.Record>
     */
    @WebMethod
    @WebResult(name = "recordList", targetNamespace = "")
    @RequestWrapper(localName = "listHistory", targetNamespace = "http://bank/", className = "retail.bank.ListHistory")
    @ResponseWrapper(localName = "listHistoryResponse", targetNamespace = "http://bank/", className = "retail.bank.ListHistoryResponse")
    @Action(input = "http://bank/BankPort/listHistoryRequest", output = "http://bank/BankPort/listHistoryResponse")
    public List<Record> listHistory(
            @WebParam(name = "account", targetNamespace = "")
                    String account,
            @WebParam(name = "password", targetNamespace = "")
                    String password);

}