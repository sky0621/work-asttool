package sample.main.service;

import sample.main.jdbc.JdbcManager;

/**
 * Created by SS on 2016/06/30.
 */
public class SampleService2 {

    public String getSampleString() {
        JdbcManager m = new JdbcManager();
        return m.execQuery("aaa/bbb.sql");
    }

}
