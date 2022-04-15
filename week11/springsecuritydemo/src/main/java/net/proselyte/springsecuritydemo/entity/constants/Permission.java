package net.proselyte.springsecuritydemo.entity.constants;

public enum Permission {
    PRODUCTS_READ("products:read"),
    PRODUCTS_WRITE("products:write"),
    USERS_READ("users:read"),
    USERS_WRITE("users:write"),
    ORDERS_READ("orders:read"),
    ORDERS_WRITE("orders:write"),
    CATEGORIES_READ("categories:read"),
    CATEGORIES_WRITE("categories:write");


    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
