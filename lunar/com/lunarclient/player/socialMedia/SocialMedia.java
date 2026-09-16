package com.lunarclient.player.socialMedia;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record SocialMedia() {
   @SerializedName("links")
   private final Map<String, String> links;
   @SerializedName("prompt")
   private final boolean prompt;
   @SerializedName("YOUTUBE")
   private final String youtube;
   @SerializedName("TWITTER")
   private final String twitter;
   @SerializedName("TWITCH")
   private final String twitch;
   @SerializedName("DISCORD")
   private final String discord;
   @SerializedName("BEAM")
   private final String beam;
   @SerializedName("INSTAGRAM")
   private final String instagram;

   public SocialMedia(Map<String, String> var1, boolean var2, String var3, String var4, String var5, String var6, String var7, String var8) {
      this.links = var1;
      this.prompt = var2;
      this.youtube = var3;
      this.twitter = var4;
      this.twitch = var5;
      this.discord = var6;
      this.beam = var7;
      this.instagram = var8;
   }
}
