package factory;


public class FactoryMain {
    public static void main(String[] args) throws Exception {
        int distanceKm = 11000;
        TransportCreator transportCreator = new TransportCreator();
        Transport transport = transportCreator.getTransport(distanceKm);
        transport.loadCargo();
        transport.unloadCargo();
    }

}
