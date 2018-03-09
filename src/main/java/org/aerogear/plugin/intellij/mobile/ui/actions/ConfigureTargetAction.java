package org.aerogear.plugin.intellij.mobile.ui.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.aerogear.plugin.intellij.mobile.services.AeroGearMobileConfiguration;
import org.aerogear.plugin.intellij.mobile.ui.configuretarget.ConfigureTargetDialog;
import org.aerogear.plugin.intellij.mobile.ui.configuretarget.TargetConfig;

import java.util.Objects;

public class ConfigureTargetAction extends AnAction {
  private AeroGearMobileConfiguration config;

  @Override
  public void actionPerformed(AnActionEvent e) {
    Project project = Objects.requireNonNull(e.getProject());
    config = AeroGearMobileConfiguration.getInstance(project);
    showConfigTargetForm(project);
  }

  public void showConfigTargetForm(Project project) {
    ConfigureTargetDialog configureTargetDialog = new ConfigureTargetDialog(project, config);
    configureTargetDialog.show();

    if (configureTargetDialog.OK_EXIT_CODE == configureTargetDialog.getExitCode()) {
      TargetConfig targetConfig = configureTargetDialog.getTargetConfig();
      config.setFromTargetConfig(targetConfig);
    }
  }
}