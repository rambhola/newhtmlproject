public class MySQLconnection {
    interface Connecting {

        void connect();

        void disconnect();

    }
    
    interface Configuration {
        String getconnection();

        int getDefaultport();

    }

    public class MySQLconnection implements Connecting, Configuration {
      public   String dbname = "mysql database";

    }
    System.out.println(x:"Connecting to mysqldb ")
}
