package ir.digixo;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface HelloWorld {

    @WebMethod
    Human getHuman(@WebParam(header = true,partName = "myPartName") Human human);
}
