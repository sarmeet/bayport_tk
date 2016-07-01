package org.bayport.database;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 * Created by sarmeetsingh on 6/26/16.
 */
public class Manager {


    private final Morphia morphia = new Morphia();

    private Datastore datastore;

    public Manager() {
        System.out.println("Database has been initialized");
        morphia.mapPackage("org.bayport.entity");
        // we use MongoClient to connect the local host (127.0.0.1)
        // (assuming this is where your mongodb instance is running)
        // on port 27017 (the default port)

        MongoClient mongoClient = new MongoClient("127.0.0.1:27017");

        //create a new morphia instance
        String databaseName = "Bayport";
        datastore = morphia.createDatastore(mongoClient, databaseName);
        datastore.ensureIndexes();
    }

    public Morphia getMorphia() {
        return morphia;
    }

    public Datastore getDatastore() {
        return datastore;
    }

    public void setDatastore(Datastore datastore) {
        this.datastore = datastore;
    }

}
