package sample.main.action;

import sample.main.ano.Execute;
import sample.main.ano.Resources;
import sample.main.logic.SampleLogic;

/**
 * Created by SS on 2016/06/30.
 */
public abstract class AbstractSampleAction {

    @Resources
    protected SampleLogic sampleLogic;

    protected abstract void forExt(String s);

    @Execute(validator = false)
    public String useLogic() {
        int c = sampleLogic.logic();
        System.out.println("useLogic");
        return "useLogic.jsp";
    }

}
