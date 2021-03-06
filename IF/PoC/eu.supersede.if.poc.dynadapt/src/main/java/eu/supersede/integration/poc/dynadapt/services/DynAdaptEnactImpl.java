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
package eu.supersede.integration.poc.dynadapt.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import eu.supersede.integration.poc.dynadapt.types.AdaptationDecision;
import eu.supersede.integration.poc.dynadapt.types.AdaptationEnactment;
import eu.supersede.integration.poc.dynadapt.types.TopRankedAdaptationDecision;

@RestController
@RequestMapping(value="/enactment")
public class DynAdaptEnactImpl implements iDynAdaptEnact {
	private static final Logger log = LoggerFactory.getLogger(DynAdaptEnactImpl.class);
	private static List<String> failureReasons = new ArrayList<>();
	private static Random random = new Random();
	
	static{
		//Populating failure reasons
		failureReasons.add("Component not re-configurable");
		failureReasons.add("Component not available");
		failureReasons.add("Component not running");
	}
	
	@Override
	@RequestMapping(value="/triggerAdaptationDecision/{decisionId}/{systemId}", method=RequestMethod.POST)
	public ResponseEntity<AdaptationEnactment> triggerEnactmentForAdaptationDecision(@PathVariable UUID decisionId, @PathVariable UUID systemId) {
		// Acknowledge triggering of enactment decision, returning random triggering result (success, failure)
		log.info("Enactment of decision: " + decisionId + " for system: " + systemId);
		
		// Simulating adaptation enactment process
		try {
			log.info("Processing Enactment ...");
			Thread.sleep(10000);
			log.info("Enactment finalised");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Computing enactment result
		boolean successfulEnactment = new Random().nextBoolean();
		AdaptationEnactment ae = new AdaptationEnactment();
		ae.setDecisionId(decisionId);
		ae.setEnactmentResult(successfulEnactment);
		ae.setEnactmentTimestamp(Calendar.getInstance().getTime());
		if (!successfulEnactment)
			ae.setFailureReason(failureReasons.get(random.nextInt(failureReasons.size())));
		
		log.info("Enactment of decision: " + decisionId + " was: " + (successfulEnactment?"successful":"failed"));
		return new ResponseEntity<AdaptationEnactment>(ae, HttpStatus.CREATED);
	}


	//This method receives a JSON AdaptationDecision payload (not explicit) and produces a JSON response
	@Override
	@RequestMapping(value="/triggerTopRankedAdaptationDecision/{systemId}", method=RequestMethod.POST)
	public AdaptationEnactment triggerTopRankedEnactmentForAdaptationDecision(
			@RequestBody TopRankedAdaptationDecision decision, @PathVariable UUID systemId) {
		// Acknowledge triggering of enactment decision, returning random triggering result (success, failure)
			log.info("Enactment of top ranked decision: " + decision.getUuid() + " for system: " + systemId);
			
			//Computing enactment result
			boolean successfulEnactment = new Random().nextBoolean();
			AdaptationEnactment ae = new AdaptationEnactment();
			ae.setDecisionId(decision.getUuid());
			ae.setEnactmentResult(successfulEnactment);
			ae.setEnactmentTimestamp(Calendar.getInstance().getTime());
			if (!successfulEnactment)
				ae.setFailureReason(failureReasons.get(random.nextInt(failureReasons.size())));
			
			log.info("Enactment of top ranked decision: " + decision.getUuid() + " was: " + (successfulEnactment?"successful":"failed"));
			return ae;
	}
	
	//This method receives a JSON AdaptationDecision payload (explicit) and produces a JSON response
	@Override
	@RequestMapping(value="/triggerTopRankedAdaptationDecisionAsJSON/{systemId}", method=RequestMethod.POST,
			headers="Accept=application/json", produces="application/json")
	public AdaptationEnactment triggerTopRankedEnactmentForAdaptationDecisionAsJSON(
			@RequestBody AdaptationDecision decision, @PathVariable UUID systemId) {
		// Acknowledge triggering of enactment decision, returning random triggering result (success, failure)
			log.info("Enactment of top ranked decision: " + decision.getId() + " for system: " + systemId);
			
			//Computing enactment result
			boolean successfulEnactment = new Random().nextBoolean();
			AdaptationEnactment ae = new AdaptationEnactment();
			ae.setDecisionId(decision.getId());
			ae.setEnactmentResult(successfulEnactment);
			ae.setEnactmentTimestamp(Calendar.getInstance().getTime());
			if (!successfulEnactment)
				ae.setFailureReason(failureReasons.get(random.nextInt(failureReasons.size())));
			
			log.info("Enactment of top ranked decision: " + decision.getId() + " was: " + (successfulEnactment?"successful":"failed"));
			return ae;
	}
	
	//This method receives a XML AdaptationDecision payload (explicit) and produces a XML response
	@Override
	@RequestMapping(value="/triggerTopRankedAdaptationDecisionAsXML/{systemId}", method=RequestMethod.POST,
			headers="Accept=application/xml", produces="application/xml")
	public AdaptationEnactment triggerTopRankedEnactmentForAdaptationDecisionAsXML(
			@RequestBody AdaptationDecision decision, @PathVariable UUID systemId) {
		// Acknowledge triggering of enactment decision, returning random triggering result (success, failure)
			log.info("Enactment of top ranked decision: " + decision.getId() + " for system: " + systemId);
			
			//Computing enactment result
			boolean successfulEnactment = new Random().nextBoolean();
			AdaptationEnactment ae = new AdaptationEnactment();
			ae.setDecisionId(decision.getId());
			ae.setEnactmentResult(successfulEnactment);
			ae.setEnactmentTimestamp(Calendar.getInstance().getTime());
			if (!successfulEnactment)
				ae.setFailureReason(failureReasons.get(random.nextInt(failureReasons.size())));
			
			log.info("Enactment of top ranked decision: " + decision.getId() + " was: " + (successfulEnactment?"successful":"failed"));
			return ae;
	}
}
