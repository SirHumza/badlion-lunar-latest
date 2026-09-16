package com.lunarclient.apollo.module;

import com.lunarclient.apollo.util.ConfigTarget;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ModuleDefinition {
   String id();

   String name();

   ConfigTarget configTarget() default ConfigTarget.GENERAL_SETTINGS;
}
