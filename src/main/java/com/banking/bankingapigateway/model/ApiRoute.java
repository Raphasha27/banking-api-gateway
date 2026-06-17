package com.banking.bankingapigateway.model;

import jakarta.persistence.*;

@Entity @Table(name = "api_routes")
public class ApiRoute {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String path;
    private String method;
    private String targetUrl;
    private boolean requiresAuth = true;
    private boolean rateLimited = true;
    private int rateLimitPerMinute = 60;
    private boolean active = true;

    public ApiRoute() {}
    public ApiRoute(String path, String method, String targetUrl) {
        this.path = path; this.method = method; this.targetUrl = targetUrl;
    }
    public String getId() { return id; }
    public String getPath() { return path; }
    public String getMethod() { return method; }
    public String getTargetUrl() { return targetUrl; }
    public boolean isRequiresAuth() { return requiresAuth; }
    public boolean isRateLimited() { return rateLimited; }
    public int getRateLimitPerMinute() { return rateLimitPerMinute; }
    public boolean isActive() { return active; }
    public void setRequiresAuth(boolean a) { this.requiresAuth = a; }
    public void setRateLimitPerMinute(int r) { this.rateLimitPerMinute = r; }
}
