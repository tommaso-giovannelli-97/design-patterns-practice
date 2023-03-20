package factory;

public class Plane extends Transport{

    public Plane(Document document) {
        super(document);
    }

    @Override
    public void loadCargo() throws Exception {
        System.out.println("Loading plane cargo...");
        if(getDocument().getTransportType().equals("PLANE")){
            Thread.sleep(1000);
            System.out.println("Plane cargo loaded");
        }
        else {throw new Exception("Document not valid!");}
    }

    @Override
    public void unloadCargo() throws Exception {
        System.out.println("Unloading plane cargo...");
        if(getDocument().getTransportType().equals("PLANE")){
            Thread.sleep(1000);
            System.out.println("Plane cargo unloaded");
        }
        else {throw new Exception("Document not valid!");}
    }
}
