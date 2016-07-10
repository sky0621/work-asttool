package sample.main.service;

import sample.main.jdbc.JdbcManager;

/**
 * Created by SS on 2016/06/30.
 */
public class SampleService2 extends AbstractSampleService {

    public String getSampleString() {
        JdbcManager m = new JdbcManager();
        return m.execQuery("aaa/bbb.sql");
    }

    public String getSampleString(String prm) {
        JdbcManager m = new JdbcManager();
        prm.toString();
        return m.execQuery("aaa/bbb.sql");
    }

}
