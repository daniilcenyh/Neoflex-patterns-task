package org.hamming.proxy;

public class PostgreSQL implements DataBase{
    private String dbName;
    private String connectionUrl;

    public PostgreSQL(String dbName, String connectionUrl) {
        this.dbName = dbName;
        this.connectionUrl = connectionUrl;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to database: " + dbName);
        System.out.println("Connection URL: " + connectionUrl);
        System.out.println("✓ Connected successfully!");
    }

    @Override
    public String getConnectionUrl() {
        return connectionUrl;
    }
}
