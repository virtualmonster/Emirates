/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.IPacedLoop;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.PacedLoop;
import com.ibm.rational.test.lt.kernel.dc.IKDCCoreVar;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class Invoke_Stub_TestHub_Test_A1EFAD6A8D11D811CF10B46263663836 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	
	private DataVar[] vars = new DataVar[2];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public Invoke_Stub_TestHub_Test_A1EFAD6A8D11D811CF10B46263663836(IContainer container, String invocationId) {
		super(container, "Invoke Stub TestHub", invocationId, "A1EFAD6A8D11D811CF10B46263663836", "/Emirates/Invoke Stub TestHub.testsuite", "C:/Users/stuart.walker/HCL/devopstest/workspace/Emirates/Invoke Stub TestHub.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	              this.add(varAction_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(confCon_1(this)); /* GENERIC CREATE TEMPLATE */

      this.add(confCon_2(this)); /* GENERIC CREATE TEMPLATE */

		PacedLoop loopNm_1 = pacedLoop_1(this);
		this.add(loopNm_1);
		loopNm_1.addVarsToInit(Arrays.asList((IKDCCoreVar)vars[1],(IKDCCoreVar)vars[0]));
		
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: Invoke_Stub_TestHub_Test_A1EFAD6A8D11D811CF10B46263663836 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EFACC110FC71E0CE27B63134633863");	
			vars[0] = new DataVar("Invoke Stub TestHub_Host", "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("Invoke Stub TestHub_Host_Port", "80", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"localhost",
					(String)("localhost"),  // host name
					Integer.parseInt((String)("1177")), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"localhost",  // unsubstituted host name
					Integer.parseInt((String)("1177")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private IKAction confCon_2(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = null;
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"C",
					(String)("master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com"),  // host name
					Integer.parseInt((String)("443")), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}


	private PacedLoop pacedLoop_1(IContainer parent) {
		PacedLoop pacedLoop = new PacedLoop(parent,
				 "Loop1",
				 "A1EFACD714AA0E90CE27B63134633863",
				 -1,
				 0,
				 0,
				 0,
				 1,
				 true,
				 false,
				 100,
				 1000,
				 IPacedLoop.RANDOM,
				 false, null) {
		
		    public void executeLoop() {                
			this.add(new IterationDelay(this, "PacedLoop Iteration Delay", "A1EFACD714AA0E90CE27B63134633863")); //$NON-NLS-1$
			      this.add(page_1(this)); /* GENERIC CREATE TEMPLATE */

			super.executeLoop();
		    }
		
     		};
		return pacedLoop;
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1EFACC110FC71EACE27B63134633863");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "SimpleService", "A1EFACC110FC71EACE27B63134633863") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1EFAD6E154A8DB0CF10B46263663836", true, true,
						"C", "1",	"/", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EFACC110FEE2F4CE27B63134633863", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(0);
		

		reqAction.setTimeoutDuration(4, 60000);		
			
					
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "localhost", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
		ISubRule sub_1 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN", null, 0, false);
	subContainer_1.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com", null, 0, false);
	subContainer_1.addSubInstruction(sub_2);
		ISubRule sub_3 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com_2", null, 0, false);
	subContainer_1.addSubInstruction(sub_4);
		ISubRule sub_5 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN_3", null, 0, false);
	subContainer_1.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com_3", null, 0, false);
	subContainer_1.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN_4", null, 0, false);
	subContainer_1.addSubInstruction(sub_7);
		ISubRule sub_8 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com_4", null, 0, false);
	subContainer_1.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN_5", null, 0, false);
	subContainer_1.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com_5", null, 0, false);
	subContainer_1.addSubInstruction(sub_10);
		ISubRule sub_11 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN_6", null, 0, false);
	subContainer_1.addSubInstruction(sub_11);
		ISubRule sub_12 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com_6", null, 0, false);
	subContainer_1.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN_7", null, 0, false);
	subContainer_1.addSubInstruction(sub_13);
		ISubRule sub_14 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com_7", null, 0, false);
	subContainer_1.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN_8", null, 0, false);
	subContainer_1.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("sc_host", 0, 69, true, (IDCCoreVar)vars[0], false, "master-hcl-02e7330b939e4c8da7330b939e7c8d66.tp-k8s.nonprod.hclpnp.com_8", null, 0, false);
	subContainer_1.addSubInstruction(sub_16);
		ISubRule sub_17 = new SubRule("sc_port", 0, 2, true, (IDCCoreVar)vars[1], false, "UN_9", null, 0, false);
	subContainer_1.addSubInstruction(sub_17);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"http",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"windows-1252",
			"windows-1252",
			"A1EFACC1110153E9CE27B63134633863",
			false,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
		

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("http://");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
}
