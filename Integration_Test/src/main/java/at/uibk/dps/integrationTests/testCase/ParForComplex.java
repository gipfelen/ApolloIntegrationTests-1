package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class ParForComplex extends Experiment {

    public ParForComplex() {
        super(ConstantsExperiments.workflowPathParForComplex,
                ConstantsExperiments.mappingPathParForComplex,
                ConstantsExperiments.configPathParForComplex,
                ConstantsExperiments.expectedResultsParForComplex);
    }

    public static void main(String[] args) throws InterruptedException {
        ParForComplex experiment = new ParForComplex();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathParForComplex);
    }
}
