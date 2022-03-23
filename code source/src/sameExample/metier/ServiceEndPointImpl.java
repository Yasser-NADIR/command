package sameExample.metier;

public class ServiceEndPointImpl implements ServiceEndPoint {

    @Override
    public void traitementDonnée(String arg1, int arg2) {
        System.out.println("reçois des argument " + arg1 + " " + arg2);
    }

    @Override
    public String getInfo() {
        return "hello world form the business logic";
    }

}
