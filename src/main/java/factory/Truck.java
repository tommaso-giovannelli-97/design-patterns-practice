package factory;

public class Truck extends Transport{

    public Truck(Document document) {
        super(document);
    }

    @Override
    public void loadCargo() throws Exception {
        System.out.println("Loading truck cargo...");
        if(getDocument().getTransportType().equals("TRUCK")){
            Thread.sleep(1000);
            System.out.println("Truck cargo loaded");
        }
        else {throw new Exception("Document not valid!");}
    }

    @Override
    public void unloadCargo() throws Exception {
        System.out.println("Unloading truck cargo...");
        if(getDocument().getTransportType().equals("TRUCK")){
            Thread.sleep(1000);
            System.out.println("Truck cargo unloaded");
        }
        else {throw new Exception("Document not valid!");}
    }
}
