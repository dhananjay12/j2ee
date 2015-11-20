package mynotes.jsf.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class LifeCycleListener implements PhaseListener{

	private static final long serialVersionUID = 1L;

	public void afterPhase(PhaseEvent pe) {
		System.out.println("After Phase: " + pe.getPhaseId().toString() + " invoked.");
	}

	public void beforePhase(PhaseEvent pe) {
		System.out.println("Before Phase: " + pe.getPhaseId().toString() + " invoked.");
	}

	
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
