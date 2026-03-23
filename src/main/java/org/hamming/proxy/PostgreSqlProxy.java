package org.hamming.proxy;

public class PostgreSqlProxy implements DataBase{
    private PostgreSQL postgreSQL;
    private String dbName;
    private static final String HOST = "localhost";
    private static final int PORT = 5432;

    @Override
    public void connect() {
        if (postgreSQL == null) {
            String fullUrl = HOST + ":" + PORT + "/" + dbName;
            postgreSQL = new PostgreSQL(dbName, fullUrl);
        }
        postgreSQL.connect();
    }

    @Override
    public String getConnectionUrl() {
        if (postgreSQL == null) {
            return HOST + ":" + PORT + "/" + dbName;
        }
        return postgreSQL.getConnectionUrl();
    }
}
