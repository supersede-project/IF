package eu.supersede.integration.api.feedback.orchestrator.types;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiUser implements UserDetails {

    
    private long id;
    private String name;
    private String password;

    @JsonIgnore
    private List<ApiUserApiUserRole> apiUserApiUserRoles;

    private List<ApiUserPermission> apiUserPermissions;

    
    private List<ApiUserRole> authorities;
    
    private Boolean accountNonExpired = true;
    
    private Boolean accountNonLocked = true;
    
    private Boolean credentialsNonExpired = true;
    
    private Boolean enabled = true;
    
    private String username;

    public ApiUser() {
    }

    public ApiUser(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public ApiUser(String name, String password, List<ApiUserApiUserRole> apiUserApiUserRoles, List<ApiUserPermission> apiUserPermissions) {
        this.name = name;
        this.password = password;
        this.apiUserApiUserRoles = apiUserApiUserRoles;
        this.apiUserPermissions = apiUserPermissions;
    }

    @Override
    public String toString() {
        return String.format(
                "ApiUser[id=%d, name='%s', apiUserApiUserRoles='%s', authorities='%s']",
                id,
                name,
                this.apiUserApiUserRoles != null ? this.apiUserApiUserRoles.stream().map(Object::toString).collect(Collectors.joining(", ")): "null",
                this.authorities != null ? this.authorities.stream().map(Object::toString).collect(Collectors.joining(", ")): "null");
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.apiUserApiUserRoles == null) {
            return null;
        }
        List<GrantedAuthority> apiUserRoles = new ArrayList<>();
        for(ApiUserApiUserRole apiUserApiUserRole : this.apiUserApiUserRoles) {
            apiUserRoles.add(apiUserApiUserRole.getApiUserRole());
        }
        return apiUserRoles;
    }

    public void setAuthorities(List<ApiUserRole> authorities) {
        this.authorities = authorities;

        if(this.apiUserApiUserRoles == null) {
            this.apiUserApiUserRoles = new ArrayList<>();
        }
        for(ApiUserRole apiUserRole : this.authorities) {
            this.apiUserApiUserRoles.add(new ApiUserApiUserRole(this, apiUserRole));
        }
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }

    public Boolean getAccountNonExpired() {
        return accountNonExpired;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return accountNonLocked;
    }

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }

    public Boolean getCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ApiUserApiUserRole> getApiUserApiUserRoles() {
        return apiUserApiUserRoles;
    }

    public void setApiUserApiUserRoles(List<ApiUserApiUserRole> apiUserApiUserRoles) {
        this.apiUserApiUserRoles = apiUserApiUserRoles;
    }

    public List<ApiUserPermission> getApiUserPermissions() {
        return apiUserPermissions;
    }

    public void setApiUserPermissions(List<ApiUserPermission> apiUserPermissions) {
        this.apiUserPermissions = apiUserPermissions;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
