package com.lunarclient.apollo.module;

import com.lunarclient.apollo.ApolloPlatform;
import com.lunarclient.apollo.event.ApolloListener;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.util.ConfigTarget;
import io.leangen.geantyref.TypeToken;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import lombok.Generated;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public abstract class ApolloModule implements ApolloListener {
   private static final SimpleOption.SimpleOptionBuilder<Boolean> ENABLE_OPTION_BUILDER = (SimpleOption.SimpleOptionBuilder<Boolean>)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
            .comment("Set to 'true' to enable this module, otherwise set 'false'."))
         .node("enable"))
      .type(TypeToken.get(Boolean.class));
   public static final SimpleOption<Boolean> ENABLE_OPTION_OFF = ENABLE_OPTION_BUILDER.defaultValue(false).build();
   public static final SimpleOption<Boolean> ENABLE_OPTION_ON = ENABLE_OPTION_BUILDER.defaultValue(true).build();
   private final List<Option<?, ?, ?>> optionKeys = new LinkedList<>();
   private boolean enabled;
   private Options options = Options.empty();
   private String id;
   private String name;
   private ConfigTarget configTarget;

   protected ApolloModule() {
      this.registerOptions(ENABLE_OPTION_ON);
   }

   protected void registerOptions(Option<?, ?, ?>... var1) {
      this.registerOptions(Arrays.asList(var1));
   }

   protected void registerOptions(Collection<Option<?, ?, ?>> var1) {
      this.optionKeys.addAll(var1);
   }

   public String getId() {
      return this.id != null ? this.id : (this.id = this.definition().id());
   }

   public String getName() {
      return this.name != null ? this.name : (this.name = this.definition().name());
   }

   public ConfigTarget getConfigTarget() {
      return this.configTarget != null ? this.configTarget : (this.configTarget = this.definition().configTarget());
   }

   public Collection<ApolloPlatform.Kind> getSupportedPlatforms() {
      return Collections.singletonList(ApolloPlatform.Kind.SERVER);
   }

   public boolean isClientNotify() {
      return false;
   }

   public void enable() {
      if (!this.enabled) {
         this.enabled = true;
         this.onEnable();
      }
   }

   public void disable() {
      if (this.enabled) {
         this.enabled = false;
         this.onDisable();
      }
   }

   protected void onEnable() {
   }

   private void onDisable() {
   }

   private ModuleDefinition definition() {
      Class var1 = this.getClass();
      ModuleDefinition var2 = var1.getAnnotation(ModuleDefinition.class);
      if (var2 == null) {
         var1 = var1.getSuperclass();
         var2 = var1.getAnnotation(ModuleDefinition.class);
      }

      if (var2 == null) {
         throw new RuntimeException("Apollo module class " + var1.getSimpleName() + " must be decorated with a ModuleDefinition annotation");
      } else {
         return var2;
      }
   }

   @Generated
   List<Option<?, ?, ?>> getOptionKeys() {
      return this.optionKeys;
   }

   @Generated
   public boolean isEnabled() {
      return this.enabled;
   }

   @Generated
   public Options getOptions() {
      return this.options;
   }

   @Generated
   void setOptions(Options var1) {
      this.options = var1;
   }
}
