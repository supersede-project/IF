package eu.supersede.integration.api.feedback.repository.types;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import eu.supersede.integration.api.feedback.orchestrator.types.Mechanism;


@JsonIgnoreProperties(ignoreUnknown = true)
public class AttachmentFeedback implements FileFeedback, MechanismFeedback {

    protected long id;
    private long mechanismId;
    private String path;
    private int size;
    private String part;
    private String fileExtension;

    @JsonIgnore
    private Mechanism mechanism;

    @Override
    public String toString() {
        return String.format(
                "AttachmentFeedback[id=%d, feedbackId='%d', mechanismId='%d', path='%s']",
                id, mechanismId, path);
    }

    public AttachmentFeedback() {
    }

    public AttachmentFeedback(long mechanismId) {
        this.mechanismId = mechanismId;
    }

    public AttachmentFeedback(String part, long mechanismId) {
        this.part = part;
        this.mechanismId = mechanismId;
    }

    public AttachmentFeedback(String path, int size, String part, String fileExtension, long mechanismId) {
        this.path = path;
        this.size = size;
        this.part = part;
        this.fileExtension = fileExtension;
        this.mechanismId = mechanismId;
    }

    public long getMechanismId() {
        return mechanismId;
    }

    public void setMechanismId(long mechanismId) {
        this.mechanismId = mechanismId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    @Override
    public void setPath(String path) {
        this.path = path;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Mechanism getMechanism() {
        return mechanism;
    }

    public void setMechanism(Mechanism mechanism) {
        this.mechanism = mechanism;
    }
}
