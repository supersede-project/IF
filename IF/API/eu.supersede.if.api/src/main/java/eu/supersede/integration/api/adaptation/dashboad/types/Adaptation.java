package eu.supersede.integration.api.adaptation.dashboad.types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import eu.supersede.integration.api.json.CustomJsonDateDeserializer;
import eu.supersede.integration.api.adaptation.types.ModelSystem;
import eu.supersede.integration.api.json.AdaptationTimeJsonSerializer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Adaptation {

    private String fc_id;
	private String name;
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	@JsonSerialize(using = AdaptationTimeJsonSerializer.class)
    private Date computation_timestamp;
    private double rank;
    private ModelSystem model_system;
    private List<Action> actions;

	public Adaptation(){}
    
    public String getFc_id() {
		return fc_id;
	}

	public void setFc_id(String fc_id) {
		this.fc_id = fc_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getComputation_timestamp() {
		return this.computation_timestamp;
	}

	public void setComputation_timestamp(Date computation_timestamp) {
		this.computation_timestamp = computation_timestamp;
	}

	public double getRank() {
		return this.rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}
	
	public List<Action> getActions() {
		if (actions == null){
			actions = new ArrayList<>();
		}
		return actions;
	}

	public void setActions(List<Action> actions) {
		this.actions = actions;
	}
	
	public ModelSystem getModel_system() {
		return model_system;
	}
	
	public void setModel_system(ModelSystem modelSystem) {
		this.model_system = modelSystem;
	}
}
