package factory;

public class TransportCreator {

    //Factory method
    public Transport getTransport(int distanceKm) {
        if(distanceKm < 1000) {
            return new Truck(new Document("TRUCK"));
        } else if (distanceKm < 6000) {
            return new Plane(new Document("PLANE"));
        } else {return new Ship(new Document("SHIP"));}

    }

}
