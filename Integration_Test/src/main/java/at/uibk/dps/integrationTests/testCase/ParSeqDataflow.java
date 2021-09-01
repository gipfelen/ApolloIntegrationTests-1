package at.uibk.dps.integrationTests.testCase;

import at.uibk.dps.integrationTests.Experiment;
import at.uibk.dps.integrationTests.constants.ConstantsExperiments;

public class ParSeqDataflow extends Experiment {

    public ParSeqDataflow() {
        super(ConstantsExperiments.workflowPathParSeqDataflow,
                ConstantsExperiments.mappingPathParSeqDataflow,
                ConstantsExperiments.configPathParSeqDataflow,
                ConstantsExperiments.expectedResultsParSeqDataflow);
    }

    public static void main(String[] args) throws InterruptedException {
        ParSeqDataflow experiment = new ParSeqDataflow();
        experiment.runExperiment();
    }

    @Override
    protected void actualRun() {
        implementWithInput(ConstantsExperiments.inputPathParSeqDataflow);
    }
}
