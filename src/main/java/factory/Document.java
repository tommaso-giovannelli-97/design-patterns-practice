package factory;

import java.util.UUID;

public class Document {
    private String id;
    private String transportType;

    public Document(String transportType) {
        this.id = UUID.randomUUID().toString();
        this.transportType = transportType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }
}
