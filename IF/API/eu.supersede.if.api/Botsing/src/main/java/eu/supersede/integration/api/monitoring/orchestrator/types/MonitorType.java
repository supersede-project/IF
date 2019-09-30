/*******************************************************************************
 * Copyright (c) 2016 Universitat Politécnica de Catalunya (UPC)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
 * 	Quim Motger (UPC) - main development
 * 	
 * Initially developed in the context of SUPERSEDE EU project
 * www.supersede.eu
 *******************************************************************************/
package eu.supersede.integration.api.monitoring.orchestrator.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import eu.supersede.integration.api.feedback.orchestrator.types.OrchestratorItem;

//@Validate(MonitorTypeValidator.class)
//@Serialize(MonitorTypeSerializationService.class)
@JsonInclude(Include.NON_NULL)
public class MonitorType extends OrchestratorItem<MonitorType> {
	
	private Integer id;
	private String name;
	List<MonitorTool> monitorTools;
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MonitorTool> getMonitorTools() {
		return monitorTools;
	}

	public void setMonitorTools(List<MonitorTool> monitorTools) {
		this.monitorTools = monitorTools;
	}

}
