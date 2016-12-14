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
package eu.supersede.integration.api.monitoring.orchestrator.proxies;

import java.net.URI;
import java.util.List;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;

import eu.supersede.integration.api.feedback.orchestrator.types.Application;
import eu.supersede.integration.api.feedback.orchestrator.types.Configuration;
import eu.supersede.integration.api.feedback.orchestrator.types.FeedbackMechanism;
import eu.supersede.integration.api.feedback.orchestrator.types.FeedbackParameter;
import eu.supersede.integration.api.feedback.orchestrator.types.GeneralConfiguration;
import eu.supersede.integration.api.feedback.orchestrator.types.User;
import eu.supersede.integration.api.feedback.orchestrator.types.UserGroup;
import eu.supersede.integration.api.monitoring.orchestrator.types.MonitorConfiguration;
import eu.supersede.integration.api.monitoring.orchestrator.types.MonitorTool;
import eu.supersede.integration.api.monitoring.orchestrator.types.MonitorType;
import eu.supersede.integration.api.proxy.IFServiceProxy;
//import eu.supersede.integration.api.security.types.AuthorizationToken;
import eu.supersede.integration.properties.IntegrationProperty;

public class MonitoringOrchestratorProxy<T, S> extends IFServiceProxy<T, S> implements IMonitoringOrchestrator {
	private final static String SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT = IntegrationProperty
			.getProperty("monitoring.orchestrator.endpoint");

	@Override
	public List<MonitorType> listAllMonitorTypes() throws Exception {
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes");
		return getJSONObjectsListForType(MonitorType[].class, uri, HttpStatus.OK);
	}

	@Override
	public MonitorType createMonitorType(MonitorType monitorType) throws Exception {
		Assert.notNull(monitorType, "Provide a valid monitor type");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes");
		return insertandReturnJSONObject(monitorType, uri, HttpStatus.CREATED);
	}

	@Override
	public MonitorType getMonitorType(String monitorTypeName) throws Exception {
		Assert.notNull(monitorTypeName, "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorTypeName);
		return getJSONObjectForType(MonitorType.class, uri, HttpStatus.OK);
	}

	@Override
	public void deleteMonitorType(MonitorType monitorType) throws Exception {
		Assert.notNull(monitorType.getName(), "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorType.getName());
		deleteUriResource(uri, HttpStatus.OK);
	}

	@Override
	public MonitorTool createMonitorToolForMonitorType(MonitorTool monitorTool, String monitorTypeName)
			throws Exception {
		Assert.notNull(monitorTool, "Provide a valid monitor tool");
		Assert.notNull(monitorTypeName, "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorTypeName + "/Tools");
		return insertandReturnJSONObject(monitorTool, uri, HttpStatus.CREATED);
	}

	@Override
	public MonitorTool getMonitorToolForMonitorType(String monitorToolName, String monitorTypeName) throws Exception {
		Assert.notNull(monitorToolName, "Provide a valid monitor tool name");
		Assert.notNull(monitorTypeName, "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorTypeName + "/Tools/"
				+ monitorToolName);
		return getJSONObjectForType(MonitorTool.class, uri, HttpStatus.OK);
	}

	@Override
	public void deleteMonitorToolForMonitorType(MonitorTool monitorTool, String monitorTypeName) throws Exception {
		Assert.notNull(monitorTool.getName(), "Provide a valid monitor tool name");
		Assert.notNull(monitorTypeName, "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorTypeName + "/Tools/"
				+ monitorTool.getName());
		deleteUriResource(uri, HttpStatus.OK);
	}

	@Override
	public MonitorConfiguration createMonitorConfigurationForMonitorToolAndMonitorType(
			MonitorConfiguration monitorConfiguration, String monitorToolName, String monitorTypeName)
			throws Exception {
		Assert.notNull(monitorConfiguration, "Provide a valid monitor configuration");
		Assert.notNull(monitorToolName, "Provide a valid monitor tool name");
		Assert.notNull(monitorTypeName, "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorTypeName + "/Tools/"
				+ monitorToolName + "/ToolConfigurations");
		return insertandReturnJSONObject(monitorConfiguration, uri, HttpStatus.CREATED);
	}

	@Override
	public MonitorConfiguration getMonitorConfigurationForMonitorToolAndMonitorType(Integer configurationId,
			String monitorToolName, String monitorTypeName) throws Exception {
		Assert.notNull(configurationId, "Provide a valid monitor configuration id");
		Assert.notNull(monitorToolName, "Provide a valid monitor tool name");
		Assert.notNull(monitorTypeName, "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorTypeName + "/Tools/"
				+ monitorToolName + "/ToolConfigurations/" + configurationId);
		return getJSONObjectForType(MonitorConfiguration.class, uri, HttpStatus.OK);
	}

	@Override
	public MonitorConfiguration updateMonitorConfigurationForMonitorToolAndMonitorType(
			MonitorConfiguration monitorConfiguration, String monitorToolName, String monitorTypeName)
			throws Exception {
		Assert.notNull(monitorConfiguration.getId(), "Provide a valid monitor configuration id");
		Assert.notNull(monitorToolName, "Provide a valid monitor tool name");
		Assert.notNull(monitorTypeName, "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorTypeName + "/Tools/"
				+ monitorToolName + "/ToolConfigurations/" + monitorConfiguration.getId());
		return updateJSONObject(monitorConfiguration, uri, HttpStatus.OK);
	}

	@Override
	public void deleteMonitorConfigurationForMonitorToolAndMonitorType(MonitorConfiguration monitorConfiguration,
			String monitorToolName, String monitorTypeName) throws Exception {
		Assert.notNull(monitorConfiguration.getId(), "Provide a valid monitor configuration id");
		Assert.notNull(monitorToolName, "Provide a valid monitor tool name");
		Assert.notNull(monitorTypeName, "Provide a valid monitor type name");
		URI uri = new URI(SUPERSEDE_MONITORING_ORCHESTRATOR_ENDPOINT + "MonitorTypes/" + monitorTypeName + "/Tools/"
				+ monitorToolName + "/ToolConfigurations/" + monitorConfiguration.getId());
		deleteUriResource(uri, HttpStatus.OK);
	}
}