package com.example.WebApplication;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DbaRolePK implements Serializable {

    @Column
    private String grantee;
    @Column
    private String granted_role;

    //###################### constructor

    public DbaRolePK(){

    }

    public DbaRolePK(String grantee, String granted_role) {
        this.grantee = grantee;
        this.granted_role = granted_role;
    }


    //################################### Getter Setter


    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    public String getGranted_role() {
        return granted_role;
    }

    public void setGranted_role(String granted_role) {
        this.granted_role = granted_role;
    }

    //########################################## hash equal


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DbaRolePK dbaRolePK = (DbaRolePK) o;
        return Objects.equals(grantee, dbaRolePK.grantee) && Objects.equals(granted_role, dbaRolePK.granted_role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantee, granted_role);
    }
}
