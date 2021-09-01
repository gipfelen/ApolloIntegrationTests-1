package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class SixAtomics extends Experiment {

    public SixAtomics() {
        super(ConstantsExperiments.workflowPathSixAtomics,
                ConstantsExperiments.mappingPathSixAtomics,
                ConstantsExperiments.configPathSixAtomics,
                ConstantsExperiments.expectedResultsSixAtomics);
    }

    public static void main(String[] args) throws InterruptedException {
        SixAtomics experiment = new SixAtomics();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathSixAtomics);
    }
}
