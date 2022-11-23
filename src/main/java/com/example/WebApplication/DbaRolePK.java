package com.example.WebApplication;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DbaRolePK implements Serializable {

    @Column
    private String grantee;
    @Column(name = "granted_role")
    private String grantedrole;

    //###################### constructor

    public DbaRolePK(){

    }

    public DbaRolePK(String grantee, String grantedrole) {
        this.grantee = grantee;
        this.grantedrole = grantedrole;
    }


    //################################### Getter Setter


    public String getGrantee() {
        return grantee;
    }

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    public String getGrantedrole() {
        return grantedrole;
    }

    public void setGrantedrole(String granted_role) {
        this.grantedrole = granted_role;
    }

    //########################################## hash equal


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DbaRolePK dbaRolePK = (DbaRolePK) o;
        return Objects.equals(grantee, dbaRolePK.grantee) && Objects.equals(grantedrole, dbaRolePK.grantedrole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grantee, grantedrole);
    }
}
