package com.lunarclient.apollo.stats;

import java.util.List;
import lombok.Generated;

public class ApolloPluginDescription {
   String name;
   String description;
   List<String> authors;
   String version;

   @Generated
   ApolloPluginDescription(String var1, String var2, List<String> var3, String var4) {
      this.name = var1;
      this.description = var2;
      this.authors = var3;
      this.version = var4;
   }

   @Generated
   public static ApolloPluginDescription.ApolloPluginDescriptionBuilder builder() {
      return new ApolloPluginDescription.ApolloPluginDescriptionBuilder();
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   public String getDescription() {
      return this.description;
   }

   @Generated
   public List<String> getAuthors() {
      return this.authors;
   }

   @Generated
   public String getVersion() {
      return this.version;
   }

   @Generated
   public static class ApolloPluginDescriptionBuilder {
      @Generated
      private String name;
      @Generated
      private String description;
      @Generated
      private List<String> authors;
      @Generated
      private String version;

      @Generated
      ApolloPluginDescriptionBuilder() {
      }

      @Generated
      public ApolloPluginDescription.ApolloPluginDescriptionBuilder name(String var1) {
         this.name = var1;
         return this;
      }

      @Generated
      public ApolloPluginDescription.ApolloPluginDescriptionBuilder description(String var1) {
         this.description = var1;
         return this;
      }

      @Generated
      public ApolloPluginDescription.ApolloPluginDescriptionBuilder authors(List<String> var1) {
         this.authors = var1;
         return this;
      }

      @Generated
      public ApolloPluginDescription.ApolloPluginDescriptionBuilder version(String var1) {
         this.version = var1;
         return this;
      }

      @Generated
      public ApolloPluginDescription build() {
         return new ApolloPluginDescription(this.name, this.description, this.authors, this.version);
      }

      @Generated
      @Override
      public String toString() {
         return "ApolloPluginDescription.ApolloPluginDescriptionBuilder(name="
            + this.name
            + ", description="
            + this.description
            + ", authors="
            + this.authors
            + ", version="
            + this.version
            + ")";
      }
   }
}
