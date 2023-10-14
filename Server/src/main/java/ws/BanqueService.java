package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "ConvertMadtoEuro")
    public double convertion(@WebParam(name = "montant") double mt){
        return mt*10.54;
    }
    @WebMethod(operationName = "getCompte")
    public Compte getCompte(int code){
         return new Compte(code,Math.random()*4343,new Date());
    }

    @WebMethod(operationName = "getListComptes")
    public List<Compte> getComptes(){
        return List.of(
                new Compte(1,Math.random()*4343,new Date()),
                new Compte(2,Math.random()*4343,new Date()),
                new Compte(3,Math.random()*4343,new Date())
        );
    }
}
