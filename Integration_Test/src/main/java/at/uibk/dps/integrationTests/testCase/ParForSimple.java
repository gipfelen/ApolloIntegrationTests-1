package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class ParForSimple extends Experiment {

    public ParForSimple() {
        super(ConstantsExperiments.workflowPathParForSimple,
                ConstantsExperiments.mappingPathParForSimple,
                ConstantsExperiments.configPathParForSimple,
                ConstantsExperiments.expectedResultsParForSimple);
    }

    public static void main(String[] args) throws InterruptedException {
        ParForSimple experiment = new ParForSimple();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathParForSimple);
    }
}
