package factory;

public abstract class Transport {
    private Document document;

    public abstract void loadCargo() throws Exception;

    public abstract void unloadCargo() throws Exception;

    public Transport(Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
