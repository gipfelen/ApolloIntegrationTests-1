package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class SimpleIf extends Experiment {

    public SimpleIf() {
        super(ConstantsExperiments.workflowPathSimpleIf,
                ConstantsExperiments.mappingPathSimpleIf,
                ConstantsExperiments.configPathSimpleIf,
                ConstantsExperiments.expectedResultsSimpleIf);
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleIf experiment = new SimpleIf();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathSimpleIf);
    }
}
