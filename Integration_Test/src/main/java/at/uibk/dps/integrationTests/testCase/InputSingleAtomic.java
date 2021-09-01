package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class InputSingleAtomic extends Experiment {

    public InputSingleAtomic() {
        super(ConstantsExperiments.workflowPathInputSingleAtomic,
                ConstantsExperiments.mappingPathInputSingleAtomic,
                ConstantsExperiments.configPathInputSingleAtomic,
                ConstantsExperiments.expectedResultsInputSingleAtomic);
    }

    public static void main(String[] args) throws InterruptedException {
        InputSingleAtomic experiment = new InputSingleAtomic();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathInputSingleAtomic);
    }
}
