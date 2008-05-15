package org.erlide.wranglerrefactoring.core.tupletorecord;

import org.erlide.wranglerrefactoring.core.WranglerRefactoring;
import org.erlide.wranglerrefactoring.ui.WranglerRefactoringAction;
import org.erlide.wranglerrefactoring.ui.WranglerRefactoringWizard;

public class TupleToRecordAction extends WranglerRefactoringAction {

	@Override
	protected String initRefactoringName() {
		return "Tuple to record";
	}

	@Override
	protected WranglerRefactoring initWranglerRefactoring() {
		return new TupleToRecordRefactoring(parameters);
	}

	@Override
	protected WranglerRefactoringWizard initWranglerRefactoringWizard() {
		return new TupleToRecordWizard(refactoring,
				WranglerRefactoringWizard.DIALOG_BASED_USER_INTERFACE);
	}

}