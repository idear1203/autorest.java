package fixtures.requiredoptional.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IntOptionalWrapper model.
 */
@Fluent
public final class IntOptionalWrapper {
    /*
     * MISSING·SCHEMA-DESCRIPTION-INTEGER
     */
    @JsonProperty(value = "value")
    private Integer value;

    /**
     * Get the value property: MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * 
     * @return the value value.
     */
    public Integer getValue() {
        return this.value;
    }

    /**
     * Set the value property: MISSING·SCHEMA-DESCRIPTION-INTEGER.
     * 
     * @param value the value value to set.
     * @return the IntOptionalWrapper object itself.
     */
    public IntOptionalWrapper setValue(Integer value) {
        this.value = value;
        return this;
    }

    public void validate() {
    }
}