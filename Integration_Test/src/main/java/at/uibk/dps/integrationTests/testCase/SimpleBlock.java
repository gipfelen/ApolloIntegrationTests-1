package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class SimpleBlock extends Experiment {

    public SimpleBlock() {
        super(ConstantsExperiments.workflowPathSimpleBlock,
                ConstantsExperiments.mappingPathSimpleBlock,
                ConstantsExperiments.configPathSimpleBlock,
                ConstantsExperiments.expectedResultsSimpleBlock);
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleBlock experiment = new SimpleBlock();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathSimpleBlock);
    }
}
