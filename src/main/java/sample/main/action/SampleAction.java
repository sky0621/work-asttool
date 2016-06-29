package sample.main.action;

import sample.main.ano.Execute;
import sample.main.ano.Resources;
import sample.main.service.SampleService;

/**
 * Created by SS on 2016/06/30.
 */
public class SampleAction {

    @Resources
    protected SampleService sampleService;

    @Execute(validator = false)
    public String index() {
        int c = sampleService.getSampleCount();
        return "index.jsp";
    }

}
