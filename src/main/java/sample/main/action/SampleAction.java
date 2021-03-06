package sample.main.action;

import sample.main.ano.Execute;
import sample.main.ano.Resources;
import sample.main.service.SampleService;
import sample.main.service.SampleService2;

import java.util.Arrays;

/**
 * Created by SS on 2016/06/30.
 */
public class SampleAction {

    @Resources
    protected SampleService sampleService;

    @Resources
    protected SampleService2 sampleService2;

    @Execute(validator = false)
    public String index() {
        int c = sampleService.getSampleCount();
        String somes = sampleService2.getSampleString("tekito");
        return "index.jsp";
    }

    @Execute(validator = false)
    public String confirm() {
        String s = sampleService2.getSampleString();
        Arrays.asList(new String[]{});
        return "confirm.jsp";
    }

    protected boolean needSession() {
        return true;
    }

}
