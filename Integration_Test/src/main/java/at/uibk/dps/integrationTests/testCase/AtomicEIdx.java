package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class AtomicEIdx extends Experiment {

    public AtomicEIdx() {
        super(ConstantsExperiments.workflowPathAtomicEIdx,
                ConstantsExperiments.mappingPathAtomicEIdx,
                ConstantsExperiments.configPathAtomicEIdx,
                ConstantsExperiments.expectedResultsAtomicEIdx);
    }

    public static void main(String[] args) throws InterruptedException {
        AtomicEIdx experiment = new AtomicEIdx();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathAtomicEIdx);
    }
}
