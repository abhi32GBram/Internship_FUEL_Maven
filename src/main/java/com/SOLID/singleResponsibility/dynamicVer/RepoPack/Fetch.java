package com.SOLID.singleResponsibility.dynamicVer.RepoPack;

import java.io.IOException;
import java.sql.SQLException;

public interface Fetch {
    public void fetch() throws ClassNotFoundException, SQLException, IOException;

}