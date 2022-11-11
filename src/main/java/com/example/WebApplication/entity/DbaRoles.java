package com.example.WebApplication.entity;

import com.example.WebApplication.DbaRolePK;
import javax.persistence.*;

@Entity
@Table(schema = "sys", name = "dba_role_privs")
public class DbaRoles {

    @EmbeddedId
    private DbaRolePK id;

    @Column
    private String default_role;

    @Column
    private String admin_option;

    @Column
    private String delegate_option;

    @Column
    private String common;

    @Column
    private String inherited;

    //############################## constructor

    public DbaRoles(){

    }

    public DbaRoles(DbaRolePK id, String default_role, String admin_option, String delegate_option, String common, String inherited) {
        this.id = id;
        this.default_role = default_role;
        this.admin_option = admin_option;
        this.delegate_option = delegate_option;
        this.common = common;
        this.inherited = inherited;
    }

    //#################################### getter setter


    public DbaRolePK getId() {
        return id;
    }

    public void setId(DbaRolePK id) {
        this.id = id;
    }

    public String getDefault_role() {
        return default_role;
    }

    public void setDefault_role(String default_role) {
        this.default_role = default_role;
    }

    public String getAdmin_option() {
        return admin_option;
    }

    public void setAdmin_option(String admin_option) {
        this.admin_option = admin_option;
    }

    public String getDelegate_option() {
        return delegate_option;
    }

    public void setDelegate_option(String delegate_option) {
        this.delegate_option = delegate_option;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getInherited() {
        return inherited;
    }

    public void setInherited(String inherited) {
        this.inherited = inherited;
    }
}
