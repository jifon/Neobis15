package net.proselyte.springsecuritydemo.entity.constants;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {USER(Set.of( Permission.PRODUCTS_READ, Permission.ORDERS_READ, Permission.CATEGORIES_READ)),
    ADMIN(Set.of(
            Permission.PRODUCTS_READ, Permission.PRODUCTS_WRITE,
            Permission.USERS_READ, Permission.USERS_WRITE, Permission.ORDERS_READ, Permission.ORDERS_WRITE, Permission.CATEGORIES_WRITE));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities() {
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }
}
