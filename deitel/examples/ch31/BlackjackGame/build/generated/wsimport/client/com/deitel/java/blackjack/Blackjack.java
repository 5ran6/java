
package com.deitel.java.blackjack;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Blackjack", targetNamespace = "http://blackjack.java.deitel.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Blackjack {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "shuffle", targetNamespace = "http://blackjack.java.deitel.com/", className = "com.deitel.java.blackjack.Shuffle")
    @ResponseWrapper(localName = "shuffleResponse", targetNamespace = "http://blackjack.java.deitel.com/", className = "com.deitel.java.blackjack.ShuffleResponse")
    public void shuffle();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "dealCard", targetNamespace = "http://blackjack.java.deitel.com/", className = "com.deitel.java.blackjack.DealCard")
    @ResponseWrapper(localName = "dealCardResponse", targetNamespace = "http://blackjack.java.deitel.com/", className = "com.deitel.java.blackjack.DealCardResponse")
    public String dealCard();

    /**
     * 
     * @param hand
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getHandValue", targetNamespace = "http://blackjack.java.deitel.com/", className = "com.deitel.java.blackjack.GetHandValue")
    @ResponseWrapper(localName = "getHandValueResponse", targetNamespace = "http://blackjack.java.deitel.com/", className = "com.deitel.java.blackjack.GetHandValueResponse")
    public int getHandValue(
        @WebParam(name = "hand", targetNamespace = "")
        String hand);

}
