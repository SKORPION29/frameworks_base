package com.pixys.android.systemui.dagger;

import android.content.Context;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;
import com.android.systemui.dagger.WMModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        GlobalModule.class,
        PixysSysUISubcomponentModule.class,
        WMModule.class})
public interface PixysGlobalRootComponent extends GlobalRootComponent {

    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        PixysGlobalRootComponent build();
    }

    @Override
    PixysSysUIComponent.Builder getSysUIComponent();
}
