package sample.main.logic;

import sample.main.ano.Resources;
import sample.main.service.SampleService;

/**
 * Created by SS on 2016/06/30.
 */
public class SampleLogic {

    @Resources
    protected SampleService sampleService;

    public int logic() {

        return sampleService.getSampleCount();
    }

}
