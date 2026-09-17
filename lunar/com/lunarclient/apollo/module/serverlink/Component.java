package com.lunarclient.apollo.module.serverlink;

import com.moonsworth.lunar.lib.adventure.text.Component;
import lombok.Generated;

public final class ServerLink {
   String id;
   Component displayName;
   String url;

   @Generated
   ServerLink(String var1, Component var2, String var3) {
      this.id = var1;
      this.displayName = var2;
      this.url = var3;
   }

   @Generated
   public static ServerLink.ServerLinkBuilder builder() {
      return new ServerLink.ServerLinkBuilder();
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public Component getDisplayName() {
      return this.displayName;
   }

   @Generated
   public String getUrl() {
      return this.url;
   }

   @Generated
   public static class ServerLinkBuilder {
      @Generated
      private String id;
      @Generated
      private Component displayName;
      @Generated
      private String url;

      @Generated
      ServerLinkBuilder() {
      }

      @Generated
      public ServerLink.ServerLinkBuilder id(String var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public ServerLink.ServerLinkBuilder displayName(Component var1) {
         this.displayName = var1;
         return this;
      }

      @Generated
      public ServerLink.ServerLinkBuilder url(String var1) {
         this.url = var1;
         return this;
      }

      @Generated
      public ServerLink build() {
         return new ServerLink(this.id, this.displayName, this.url);
      }

      @Generated
      @Override
      public String toString() {
         return "ServerLink.ServerLinkBuilder(id=" + this.id + ", displayName=" + this.displayName + ", url=" + this.url + ")";
      }
   }
}
