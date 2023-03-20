package factory;

public class Ship extends Transport{

    public Ship(Document document) {
        super(document);
    }

    @Override
    public void loadCargo() throws Exception {
        System.out.println("Loading ship cargo...");
        if(getDocument().getTransportType().equals("SHIP")){
            Thread.sleep(1000);
            System.out.println("Ship cargo loaded");
        }
        else {throw new Exception("Document not valid!");}
    }

    @Override
    public void unloadCargo() throws Exception {
        System.out.println("Unloading ship cargo...");
        if(getDocument().getTransportType().equals("SHIP")){
            Thread.sleep(1000);
            System.out.println("Ship cargo unloaded");
        }
        else {throw new Exception("Document not valid!");}
    }
}
