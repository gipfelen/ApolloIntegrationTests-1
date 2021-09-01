package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class SingleAtomic extends Experiment {

    public SingleAtomic() {
        super(ConstantsExperiments.workflowPathSingleAtomic,
                ConstantsExperiments.mappingPathSingleAtomic,
                ConstantsExperiments.configPathSingleAtomic,
                ConstantsExperiments.expectedResultsSingleAtomic);
    }

    public static void main(String[] args) throws InterruptedException {
        SingleAtomic experiment = new SingleAtomic();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathSingleAtomic);
    }
}
