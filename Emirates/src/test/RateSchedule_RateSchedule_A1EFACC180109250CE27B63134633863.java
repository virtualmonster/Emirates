/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.IPacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KSyncPoint;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.PacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.RateGenerator;
import com.ibm.rational.test.lt.kernel.action.impl.RateRunner;
import com.ibm.rational.test.lt.kernel.action.impl.RateUserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class RateSchedule_RateSchedule_A1EFACC180109250CE27B63134633863
		extends com.ibm.rational.test.lt.kernel.action.impl.RateSchedule {

	public RateSchedule_RateSchedule_A1EFACC180109250CE27B63134633863(IContainer parent, String name) {
		super(parent, name, "A1EFACC180109250CE27B63134633863");
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(
				new RPTEventStructure(new HTTPPageTitleVPEvent(), null, 1, "Page title verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new HTTPResponseCodeVPEvent(), null, 1, "Response code verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new HTTPResponseSizeVPEvent(), null, 1, "Response size verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTTestVerdictFailedEvent(), null, 2, "Test verdict was set to fail"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTDroppedConnectionEvent(), null, 1, "Server dropped connection"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1, "Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));

		this.addUserGroup(new RateRunnerGroup_1(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class RateRunnerGroup_1 extends RateUserGroup {

		public RateRunnerGroup_1(IContainer parent) {
			super(parent, "Rate Runner Group 1", "A1EFACC18016FAFBCE27B63134633863");

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return createScenario(parent);
		}

		private IContainer createScenario(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EFACC18016FAFBCE27B63134633863") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					PacedLoop rategenLoop = createRateGenerator(this);
					this.add(rategenLoop);
					rategenLoop.addVarsToInit(null);
					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

		private RateGenerator createRateGenerator(IContainer parent) {
			RateGenerator rateGenerator = new RateRunner(parent, "Rate Runner Group 1",
					"A1EFACC18016FAFBCE27B63134633863", -1, 0, 0, 0, 1, true, false, 100, 1000, IPacedLoop.CONSTANT,
					false, true) {

				public void executeLoop() {
					this.add(new KSyncPoint(this, this.getName() + "SyncPoint", "A1EFACC18016FAFBCE27B63134633863",
							300000, true, 0, 0, 60000));
					this.add(new IterationDelay(this, "RateRunner PacedLoop Iteration Delay", //$NON-NLS-1$
							"A1EFACC18016FAFBCE27B63134633863"));

					this.add(new test.Invoke_Stub_Test_A1EFACC110C27620CE27B63134633863(this,
							"A1EFACC18427A130CE27B63134633863") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					super.executeLoop();
				}

			};
			return rateGenerator;
		}

	}

}