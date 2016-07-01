package org.bayport.service; /**
 * Created by sarmeetsingh on 6/26/16.
 */

import org.bayport.database.Manager;
import org.mongodb.morphia.Datastore;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener()
public class Services implements ServletContextListener {

    public static Manager db;


    // Public constructor is required by servlet spec
    public Services() {
    }

    public static Manager getDb() {
        return db;
    }

    public static void setDb(Manager db) {
        Services.db = db;
    }

    public static Datastore getDataStore(){
        return db.getDatastore();
    }
    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
        db = new Manager();
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context
         (the Web application) is undeployed or
         Application Server shuts down.
      */
    }
}
