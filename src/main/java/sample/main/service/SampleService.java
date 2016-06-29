package sample.main.service;

import sample.main.jdbc.JdbcManager;

/**
 * Created by SS on 2016/06/30.
 */
public class SampleService {

    public int getSampleCount() {
        JdbcManager m = new JdbcManager();
        return m.execQuery("aaa/bbb.sql");
    }

}
