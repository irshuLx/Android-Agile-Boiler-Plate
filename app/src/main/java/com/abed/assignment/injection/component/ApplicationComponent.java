package com.abed.assignment.injection.component;

import android.app.Application;
import android.content.Context;

import com.abed.assignment.controller.AnalyticsHelper;
import com.abed.assignment.controller.DataManager;
import com.abed.assignment.injection.ApplicationContext;
import com.abed.assignment.injection.module.ApplicationModule;
import com.abed.assignment.injection.module.BaseModule;

import javax.inject.Singleton;

import dagger.Component;
import timber.log.Timber;

@Singleton
@Component(modules = {ApplicationModule.class, BaseModule.class})
public interface ApplicationComponent {


    @ApplicationContext
    Context context();

    Application application();

    DataManager dataManager();

    AnalyticsHelper analyticsHelper();

    Timber.Tree loggingTree();


}
