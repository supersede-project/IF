/*******************************************************************************
 * Copyright (c) 2016 ATOS Spain S.A.
 * All rights reserved. Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *     Yosu Gorroñogoitia (ATOS) - main development
 *
 * Initially developed in the context of SUPERSEDE EU project www.supersede.eu
 *******************************************************************************/
package eu.supersede.integration.api.adaptation.proxies.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

import eu.supersede.integration.api.adaptation.proxies.AdapterProxy;

public class AdapterProxyTest {
	// private static final Logger log =
	// LoggerFactory.getLogger(FeedbackOrchestratorProxyTest.class);
	private AdapterProxy<?, ?> proxy;

	@Before
	public void setup() throws Exception {
		proxy = new AdapterProxy<Object, Object>();
	}

	@Test
	public void testEnactAdaptationDecisionActions() throws Exception {
		String systemId = "atos";
		String featureConfigurationId = "1"; 
		List<String> adaptationDecisionActionIds = new ArrayList<>();
		adaptationDecisionActionIds.add("cms_optimal_configuration");
		adaptationDecisionActionIds.add("cms_standard_configuration");
		Boolean result = proxy.enactAdaptationDecisionActions(systemId, adaptationDecisionActionIds, featureConfigurationId);
		Assert.isTrue(result);
	}
	
}
