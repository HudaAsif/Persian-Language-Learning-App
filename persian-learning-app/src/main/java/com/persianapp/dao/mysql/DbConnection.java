package com.persianapp.dao.mysql;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Gives out MySQL connections using src/main/resources/db.properties.
 * OWNER: Member 1
 */
public class DbConnection {

    public DbConnection() {
        // TODO load db.properties (UTF-8)
    }

    public Connection getConnection() throws SQLException { throw new UnsupportedOperationException("TODO"); }
}
