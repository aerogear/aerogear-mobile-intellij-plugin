package org.aerogear.plugin.intellij.mobile.services.configuration;

import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;

import java.util.Objects;


public class ProjectConfiguration {

    private ProjectConfiguration() {}

    public String getAppId(Project project) {
        String appId = new AndroidManifest().getBundleId(project);
        if (appId == null) {
            appId = new CordovaConfig().getBundleId(project);
        }
        // not supported project, preffil with empty string rather than crash
        if (appId == null){
            appId = ""; 
        }
        return appId;
    }

    public static ProjectConfiguration getInstance(Project project) {
        return ServiceManager.getService(project, ProjectConfiguration.class);
    }
}
