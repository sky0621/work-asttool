package sample.main.service;

/**
 * Created by SS on 2016/07/11.
 */
public class AbstractSampleService implements IfSampleService {
    @Override
    public void commonProcess(int id) {
        System.out.println("commonProcess");
    }
}
