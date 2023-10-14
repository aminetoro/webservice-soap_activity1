import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

import java.util.List;

public class main {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convertMadtoEuro(200));
        Compte cp = stub.getCompte(1);
        System.out.println(cp.getCode());
        System.out.println(cp.getDate());
        System.out.println(cp.getSolde());
        List<Compte> listCp = stub.getListComptes();
        listCp.forEach(e->{
            System.out.println("===================");
            System.out.println(e.getCode());
            System.out.println(e.getDate());
            System.out.println(e.getSolde());
        });
    }
}
