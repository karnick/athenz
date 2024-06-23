//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yahoo.rdl.*;

//
// PrincipalState - A principal state entry
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class PrincipalState {
    public boolean suspended;

    public PrincipalState setSuspended(boolean suspended) {
        this.suspended = suspended;
        return this;
    }
    public boolean getSuspended() {
        return suspended;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != PrincipalState.class) {
                return false;
            }
            PrincipalState a = (PrincipalState) another;
            if (suspended != a.suspended) {
                return false;
            }
        }
        return true;
    }
}