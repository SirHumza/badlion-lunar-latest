package com.lunarclient.player;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.lunarclient.player.achievementTotem.AchievementTotem;
import com.lunarclient.player.compassStats.CompassStats;
import com.lunarclient.player.cooldowns.Cooldowns;
import com.lunarclient.player.eugene.Eugene;
import com.lunarclient.player.fireworkStorage.FireworkStorage;
import com.lunarclient.player.giftingMeta.GiftingMeta;
import com.lunarclient.player.leveling.Leveling;
import com.lunarclient.player.parkourCheckpointBests.ParkourCheckpointBests;
import com.lunarclient.player.parkourCompletions.ParkourCompletions;
import com.lunarclient.player.petConsumables.PetConsumables;
import com.lunarclient.player.petStats.Pet;
import com.lunarclient.player.questSettings.QuestSettings;
import com.lunarclient.player.skyblock_extra.SkyBlockExtra;
import com.lunarclient.player.socialMedia.SocialMedia;
import com.lunarclient.player.stats.Stats;
import com.lunarclient.player.vanityMeta.VanityMeta;
import java.util.Map;

public record Player() {
   @SerializedName("_id")
   private final String id;
   @SerializedName("achievementsOneTime")
   private final String[] achievementsOneTime;
   @SerializedName("displayname")
   private final String displayName;
   @SerializedName("firstLogin")
   private final long firstLogin;
   @SerializedName("lastLogin")
   private final long lastLogin;
   @SerializedName("playername")
   private final String playerName;
   @SerializedName("timePlaying")
   private final int timePlaying;
   @SerializedName("uuid")
   private final String uuid;
   @SerializedName("stats")
   private final Stats stats;
   @SerializedName("achievements")
   private final Map<String, Integer> achievements;
   @SerializedName("networkExp")
   private final double networkExp;
   @SerializedName("karma")
   private final long karma;
   @SerializedName("petConsumables")
   private final PetConsumables petConsumables;
   @SerializedName("vanityMeta")
   private final VanityMeta vanityMeta;
   @SerializedName("housingMeta")
   private final JsonObject housingMeta;
   @SerializedName("eugene")
   private final Eugene eugene;
   @SerializedName("quests")
   private final JsonObject quests;
   @SerializedName("parkourCompletions")
   private final ParkourCompletions parkourCompletions;
   @SerializedName("channel")
   private final String channel;
   @SerializedName("rewardConsumed")
   private final boolean rewardConsumed;
   @SerializedName("lastAdsenseGenerateTime")
   private final long lastAdsenseGenerateTime;
   @SerializedName("lastClaimedReward")
   private final long lastClaimedReward;
   @SerializedName("totalRewards")
   private final int totalRewards;
   @SerializedName("totalDailyRewards")
   private final int totalDailyRewards;
   @SerializedName("rewardStreak")
   private final int rewardStreak;
   @SerializedName("rewardScore")
   private final int rewardScore;
   @SerializedName("rewardHighScore")
   private final int rewardHighScore;
   @SerializedName("voting")
   private final JsonObject voting;
   @SerializedName("adsense_tokens")
   private final int adsenseTokens;
   @SerializedName("petStats")
   private final Map<String, Pet> petStats;
   @SerializedName("flashingSalePopup")
   private final long flashingSalePopup;
   @SerializedName("flashingSalePoppedUp")
   private final int flashingSalePoppedUp;
   @SerializedName("flashingSaleOpens")
   private final int flashingSaleOpens;
   @SerializedName("flashingSaleClicks")
   private final int flashingSaleClicks;
   @SerializedName("newPackageRank")
   private final String newPackageRank;
   @SerializedName("levelUp_MVP")
   private final long levelUpMVP;
   @SerializedName("specialtyCooldowns")
   private final Map<String, Boolean> specialtyCooldowns;
   @SerializedName("petJourneyTimestamp")
   private final long petJourneyTimestamp;
   @SerializedName("language")
   private final String language;
   @SerializedName("halloween2016Cooldowns")
   private final Map<String, Boolean> halloween2016Cooldowns;
   @SerializedName("levelUp_MVP_PLUS")
   private final long levelUpMVPPlus;
   @SerializedName("rankPlusColor")
   private final String rankPlusColor;
   @SerializedName("questSettings")
   private final QuestSettings questSettings;
   @SerializedName("giftingMeta")
   private final GiftingMeta giftingMeta;
   @SerializedName("fortuneBuff")
   private final int fortuneBuff;
   @SerializedName("SANTA_QUEST_STARTED")
   private final boolean santaQuestStarted;
   @SerializedName("holiday2016Cooldowns")
   private final Map<String, Boolean> holiday2016Cooldowns;
   @SerializedName("SANTA_FINISHED")
   private final boolean santaFinished;
   @SerializedName("userLanguage")
   private final String userLanguage;
   @SerializedName("compassStats")
   private final CompassStats compassStats;
   @SerializedName("lastLogout")
   private final long lastLogout;
   @SerializedName("socialMedia")
   private final SocialMedia socialMedia;
   @SerializedName("network_update_book")
   private final String networkUpdateBook;
   @SerializedName("achievementTracking")
   private final String[] achievementTracking;
   @SerializedName("achievementRewardsNew")
   private final Map<String, Long> achievementRewardsNew;
   @SerializedName("achievementTotem")
   private final AchievementTotem achievementTotem;
   @SerializedName("onetime_achievement_menu_sort")
   private final String oneTimeAchievementMenuSort;
   @SerializedName("onetime_achievement_menu_sort_completion_sort")
   private final String oneTimeAchievementMenuSortCompletionSort;
   @SerializedName("tiered_achievement_menu_sort")
   private final String tieredAchievementMenuSort;
   @SerializedName("achievementSync")
   private final Map<String, Integer> achievementSync;
   @SerializedName("monthlyPackageRank")
   private final String monthlyPackageRank;
   @SerializedName("mostRecentMonthlyPackageRank")
   private final String mostRecentMonthlyPackageRank;
   @SerializedName("adventRewards2018")
   private final Map<String, Long> adventRewards2018;
   @SerializedName("challenges")
   private final JsonObject challenges;
   @SerializedName("parkourCheckpointBests")
   private final ParkourCheckpointBests parkourCheckpointBests;
   @SerializedName("achievementPoints")
   private final int achievementPoints;
   @SerializedName("tourney")
   private final JsonObject tourney;
   @SerializedName("monthlyRankColor")
   private final String monthlyRankColor;
   @SerializedName("battlePassGlowStatus")
   private final boolean battlePassGlowStatus;
   @SerializedName("dmcrates-10-2019")
   private final Map<String, Boolean> dmCrates_10_2019;
   @SerializedName("halloween2019Cooldowns")
   private final Map<String, Boolean> halloween2019Cooldowns;
   @SerializedName("monthlycrates")
   private final JsonObject monthlycrates;
   @SerializedName("main2017Tutorial")
   private final boolean main2017Tutorial;
   @SerializedName("adventRewards2019")
   private final Map<String, Long> adventRewards2019;
   @SerializedName("adventRewards_v2_2019")
   private final Map<String, Long> adventRewards_v2_2019;
   @SerializedName("christmas2019Cooldowns")
   private final Map<String, Boolean> christmas2019Cooldowns;
   @SerializedName("gifts_grinch")
   private final int giftsGrinch;
   @SerializedName("adventRewards2017")
   private final Map<String, Long> adventRewards2017;
   @SerializedName("adventRewards_v2_2018")
   private final Map<String, Long> adventRewards_v2_2018;
   @SerializedName("currentClickEffect")
   private final String currentClickEffect;
   @SerializedName("easter2020Cooldowns2")
   private final Map<String, Boolean> easter2020Cooldowns2;
   @SerializedName("collectibles_menu_sort")
   private final String collectiblesMenuSort;
   @SerializedName("claimed_potato_talisman")
   private final long claimedPotatoTalisman;
   @SerializedName("summer2020Cooldowns")
   private final Map<String, Boolean> summer2020Cooldowns;
   @SerializedName("vanityFavorites")
   private final String vanityFavorites;
   @SerializedName("skyblock_free_cookie")
   private final long skyblock_free_cookie;
   @SerializedName("halloween2020Cooldowns")
   private final Map<String, Boolean> halloween2020Cooldowns;
   @SerializedName("claimed_century_cake")
   private final long claimedCenturyCake;
   @SerializedName("adventRewards2020")
   private final Map<String, Long> adventRewards2020;
   @SerializedName("christmas2020Cooldowns")
   private final Map<String, Boolean> christmas2020Cooldowns;
   @SerializedName("christmas2020Cooldowns2")
   private final Map<String, Boolean> christmas2020Cooldowns2;
   @SerializedName("currentGadget")
   private final String currentGadget;
   @SerializedName("easter2021Cooldowns2")
   private final Map<String, Boolean> easter2021Cooldowns2;
   @SerializedName("anniversaryNPCVisited2021")
   private final int[] anniversaryNPCVisited2021;
   @SerializedName("anniversaryNPCProgress2021")
   private final int anniversaryNPCProgress2021;
   @SerializedName("summer2021Cooldowns")
   private final Map<String, Boolean> summer2021Cooldowns;
   @SerializedName("halloween2021Cooldowns")
   private final Map<String, Boolean> halloween2021Cooldowns;
   @SerializedName("disabledProjectileTrails")
   private final boolean disabledProjectileTrails;
   @SerializedName("seasonal")
   private final JsonObject seasonal;
   @SerializedName("claimed_century_cake200")
   private final long claimedCenturyCake200;
   @SerializedName("easter2022Cooldowns2")
   private final Map<String, Boolean> easter2022Cooldowns2;
   @SerializedName("skyblock_extra")
   private final SkyBlockExtra skyBlockExtra;
   @SerializedName("leveling")
   private final Leveling leveling;
   @SerializedName("Rowone")
   private final String[] rowOne;
   @SerializedName("Rowtwo")
   private final String[] rowTwo;
   @SerializedName("Rowthree")
   private final String[] rowThree;
   @SerializedName("Rowfour")
   private final String[] rowFour;
   @SerializedName("Rowfive")
   private final String[] rowFive;
   @SerializedName("Columnone")
   private final String[] columnOne;
   @SerializedName("Columntwo")
   private final String[] columnTwo;
   @SerializedName("Columnthree")
   private final String[] columnThree;
   @SerializedName("Columnfour")
   private final String[] columnFour;
   @SerializedName("Columnfive")
   private final String[] columnFive;
   @SerializedName("Diagonalone")
   private final String[] diagonalOne;
   @SerializedName("Diagonaltwo")
   private final String[] diagonalTwo;
   @SerializedName("blackOut")
   private final String[] blackOut;
   @SerializedName("currentCloak")
   private final String currentCloak;
   @SerializedName("currentPet")
   private final String currentPet;
   @SerializedName("currentHat")
   private final String currentHat;
   @SerializedName("mostRecentGameType")
   private final String mostRecentGameType;
   @SerializedName("mostRecentlyTippedUuid")
   private final String mostRecentlyTippedUuid;
   @SerializedName("mostRecentMinecraftVersion")
   private final int mostRecentMinecraftVersion;
   @SerializedName("transformation")
   private final String transformation;
   @SerializedName("vanityFirstConvertedBox")
   private final long vanityFirstConvertedBox;
   @SerializedName("vanityConvertedBoxToday")
   private final long vanityConvertedBoxToday;
   @SerializedName("guildNotifications")
   private final boolean guildNotifications;
   @SerializedName("rank")
   private final String rank;
   @SerializedName("currentEmote")
   private final String currentEmote;
   @SerializedName("levelUp_VIP_PLUS")
   private final long levelUpVIPPlus;
   @SerializedName("outfit")
   private final JsonObject outfit;
   @SerializedName("levelUp_VIP")
   private final long levelUpVIP;
   @SerializedName("snowball_fight_intro_2019")
   private final boolean snowballFightIntro2019;
   @SerializedName("wardrobe")
   private final String wardrobe;
   @SerializedName("thanksReceived")
   private final int thanksReceived;
   @SerializedName("thanksSent")
   private final int thanksSent;
   @SerializedName("tournamentTokens")
   private final int tournamentTokens;
   @SerializedName("packageRank")
   private final String packageRank;
   @SerializedName("mostRecentlyThankedUuid")
   private final String mostRecentlyThankedUuid;
   @SerializedName("mostRecentlyThanked")
   private final String mostRecentlyThanked;
   @SerializedName("gadget")
   private final String gadget;
   @SerializedName("friendBlocksUuid")
   private final String[] friendBlocksUuid;
   @SerializedName("fireworkStorage")
   private final FireworkStorage[] fireworkStorage;
   @SerializedName("eulaCoins")
   private final int eulaCoins;
   @SerializedName("deaths")
   private final int deaths;
   @SerializedName("particlePack")
   private final String particlePack;
   @SerializedName("friendRequests")
   private final String[] friendRequests;
   @SerializedName("pp")
   private final String pp;
   @SerializedName("clock")
   private final boolean clock;
   @SerializedName("cooldowns")
   private final Cooldowns cooldowns;
   @SerializedName("testPass")
   private final boolean testPass;
   @SerializedName("spec_always_flying")
   private final boolean specAlwaysFlying;
   @SerializedName("claimed_year143_cake")
   private final long claimedYear143Cake;
   @SerializedName("scorpius_bribe_96")
   private final long scorpiusBribe96;
   @SerializedName("scorpius_bribe_120")
   private final long scorpiusBribe120;
   @SerializedName("scorpius_bribe_144")
   private final long scorpiusBribe144;
   @SerializedName("scorpius_bribe_168")
   private final long scorpiusBribe168;
   @SerializedName("scorpius_bribe_192")
   private final long scorpiusBribe192;
   @SerializedName("scorpius_bribe_216")
   private final long scorpiusBribe216;
   @SerializedName("scorpius_bribe_240")
   private final long scorpiusBribe240;
   @SerializedName("scorpius_bribe_264")
   private final long scorpiusBribe264;
   @SerializedName("scorpius_bribe_288")
   private final long scorpiusBribe288;
   @SerializedName("scorpius_bribe_312")
   private final long scorpiusBribe312;
   @SerializedName("scorpius_bribe_336")
   private final long scorpiusBribe336;
   @SerializedName("scorpius_bribe_360")
   private final long scorpiusBribe360;

   public Player(
      String var1,
      String[] var2,
      String var3,
      long var4,
      long var6,
      String var8,
      int var9,
      String var10,
      Stats var11,
      Map<String, Integer> var12,
      double var13,
      long var15,
      PetConsumables var17,
      VanityMeta var18,
      JsonObject var19,
      Eugene var20,
      JsonObject var21,
      ParkourCompletions var22,
      String var23,
      boolean var24,
      long var25,
      long var27,
      int var29,
      int var30,
      int var31,
      int var32,
      int var33,
      JsonObject var34,
      int var35,
      Map<String, Pet> var36,
      long var37,
      int var39,
      int var40,
      int var41,
      String var42,
      long var43,
      Map<String, Boolean> var45,
      long var46,
      String var48,
      Map<String, Boolean> var49,
      long var50,
      String var52,
      QuestSettings var53,
      GiftingMeta var54,
      int var55,
      boolean var56,
      Map<String, Boolean> var57,
      boolean var58,
      String var59,
      CompassStats var60,
      long var61,
      SocialMedia var63,
      String var64,
      String[] var65,
      Map<String, Long> var66,
      AchievementTotem var67,
      String var68,
      String var69,
      String var70,
      Map<String, Integer> var71,
      String var72,
      String var73,
      Map<String, Long> var74,
      JsonObject var75,
      ParkourCheckpointBests var76,
      int var77,
      JsonObject var78,
      String var79,
      boolean var80,
      Map<String, Boolean> var81,
      Map<String, Boolean> var82,
      JsonObject var83,
      boolean var84,
      Map<String, Long> var85,
      Map<String, Long> var86,
      Map<String, Boolean> var87,
      int var88,
      Map<String, Long> var89,
      Map<String, Long> var90,
      String var91,
      Map<String, Boolean> var92,
      String var93,
      long var94,
      Map<String, Boolean> var96,
      String var97,
      long var98,
      Map<String, Boolean> var100,
      long var101,
      Map<String, Long> var103,
      Map<String, Boolean> var104,
      Map<String, Boolean> var105,
      String var106,
      Map<String, Boolean> var107,
      int[] var108,
      int var109,
      Map<String, Boolean> var110,
      Map<String, Boolean> var111,
      boolean var112,
      JsonObject var113,
      long var114,
      Map<String, Boolean> var116,
      SkyBlockExtra var117,
      Leveling var118,
      String[] var119,
      String[] var120,
      String[] var121,
      String[] var122,
      String[] var123,
      String[] var124,
      String[] var125,
      String[] var126,
      String[] var127,
      String[] var128,
      String[] var129,
      String[] var130,
      String[] var131,
      String var132,
      String var133,
      String var134,
      String var135,
      String var136,
      int var137,
      String var138,
      long var139,
      long var141,
      boolean var143,
      String var144,
      String var145,
      long var146,
      JsonObject var148,
      long var149,
      boolean var151,
      String var152,
      int var153,
      int var154,
      int var155,
      String var156,
      String var157,
      String var158,
      String var159,
      String[] var160,
      FireworkStorage[] var161,
      int var162,
      int var163,
      String var164,
      String[] var165,
      String var166,
      boolean var167,
      Cooldowns var168,
      boolean var169,
      boolean var170,
      long var171,
      long var173,
      long var175,
      long var177,
      long var179,
      long var181,
      long var183,
      long var185,
      long var187,
      long var189,
      long var191,
      long var193,
      long var195
   ) {
      this.id = var1;
      this.achievementsOneTime = var2;
      this.displayName = var3;
      this.firstLogin = var4;
      this.lastLogin = var6;
      this.playerName = var8;
      this.timePlaying = var9;
      this.uuid = var10;
      this.stats = var11;
      this.achievements = var12;
      this.networkExp = var13;
      this.karma = var15;
      this.petConsumables = var17;
      this.vanityMeta = var18;
      this.housingMeta = var19;
      this.eugene = var20;
      this.quests = var21;
      this.parkourCompletions = var22;
      this.channel = var23;
      this.rewardConsumed = var24;
      this.lastAdsenseGenerateTime = var25;
      this.lastClaimedReward = var27;
      this.totalRewards = var29;
      this.totalDailyRewards = var30;
      this.rewardStreak = var31;
      this.rewardScore = var32;
      this.rewardHighScore = var33;
      this.voting = var34;
      this.adsenseTokens = var35;
      this.petStats = var36;
      this.flashingSalePopup = var37;
      this.flashingSalePoppedUp = var39;
      this.flashingSaleOpens = var40;
      this.flashingSaleClicks = var41;
      this.newPackageRank = var42;
      this.levelUpMVP = var43;
      this.specialtyCooldowns = var45;
      this.petJourneyTimestamp = var46;
      this.language = var48;
      this.halloween2016Cooldowns = var49;
      this.levelUpMVPPlus = var50;
      this.rankPlusColor = var52;
      this.questSettings = var53;
      this.giftingMeta = var54;
      this.fortuneBuff = var55;
      this.santaQuestStarted = var56;
      this.holiday2016Cooldowns = var57;
      this.santaFinished = var58;
      this.userLanguage = var59;
      this.compassStats = var60;
      this.lastLogout = var61;
      this.socialMedia = var63;
      this.networkUpdateBook = var64;
      this.achievementTracking = var65;
      this.achievementRewardsNew = var66;
      this.achievementTotem = var67;
      this.oneTimeAchievementMenuSort = var68;
      this.oneTimeAchievementMenuSortCompletionSort = var69;
      this.tieredAchievementMenuSort = var70;
      this.achievementSync = var71;
      this.monthlyPackageRank = var72;
      this.mostRecentMonthlyPackageRank = var73;
      this.adventRewards2018 = var74;
      this.challenges = var75;
      this.parkourCheckpointBests = var76;
      this.achievementPoints = var77;
      this.tourney = var78;
      this.monthlyRankColor = var79;
      this.battlePassGlowStatus = var80;
      this.dmCrates_10_2019 = var81;
      this.halloween2019Cooldowns = var82;
      this.monthlycrates = var83;
      this.main2017Tutorial = var84;
      this.adventRewards2019 = var85;
      this.adventRewards_v2_2019 = var86;
      this.christmas2019Cooldowns = var87;
      this.giftsGrinch = var88;
      this.adventRewards2017 = var89;
      this.adventRewards_v2_2018 = var90;
      this.currentClickEffect = var91;
      this.easter2020Cooldowns2 = var92;
      this.collectiblesMenuSort = var93;
      this.claimedPotatoTalisman = var94;
      this.summer2020Cooldowns = var96;
      this.vanityFavorites = var97;
      this.skyblock_free_cookie = var98;
      this.halloween2020Cooldowns = var100;
      this.claimedCenturyCake = var101;
      this.adventRewards2020 = var103;
      this.christmas2020Cooldowns = var104;
      this.christmas2020Cooldowns2 = var105;
      this.currentGadget = var106;
      this.easter2021Cooldowns2 = var107;
      this.anniversaryNPCVisited2021 = var108;
      this.anniversaryNPCProgress2021 = var109;
      this.summer2021Cooldowns = var110;
      this.halloween2021Cooldowns = var111;
      this.disabledProjectileTrails = var112;
      this.seasonal = var113;
      this.claimedCenturyCake200 = var114;
      this.easter2022Cooldowns2 = var116;
      this.skyBlockExtra = var117;
      this.leveling = var118;
      this.rowOne = var119;
      this.rowTwo = var120;
      this.rowThree = var121;
      this.rowFour = var122;
      this.rowFive = var123;
      this.columnOne = var124;
      this.columnTwo = var125;
      this.columnThree = var126;
      this.columnFour = var127;
      this.columnFive = var128;
      this.diagonalOne = var129;
      this.diagonalTwo = var130;
      this.blackOut = var131;
      this.currentCloak = var132;
      this.currentPet = var133;
      this.currentHat = var134;
      this.mostRecentGameType = var135;
      this.mostRecentlyTippedUuid = var136;
      this.mostRecentMinecraftVersion = var137;
      this.transformation = var138;
      this.vanityFirstConvertedBox = var139;
      this.vanityConvertedBoxToday = var141;
      this.guildNotifications = var143;
      this.rank = var144;
      this.currentEmote = var145;
      this.levelUpVIPPlus = var146;
      this.outfit = var148;
      this.levelUpVIP = var149;
      this.snowballFightIntro2019 = var151;
      this.wardrobe = var152;
      this.thanksReceived = var153;
      this.thanksSent = var154;
      this.tournamentTokens = var155;
      this.packageRank = var156;
      this.mostRecentlyThankedUuid = var157;
      this.mostRecentlyThanked = var158;
      this.gadget = var159;
      this.friendBlocksUuid = var160;
      this.fireworkStorage = var161;
      this.eulaCoins = var162;
      this.deaths = var163;
      this.particlePack = var164;
      this.friendRequests = var165;
      this.pp = var166;
      this.clock = var167;
      this.cooldowns = var168;
      this.testPass = var169;
      this.specAlwaysFlying = var170;
      this.claimedYear143Cake = var171;
      this.scorpiusBribe96 = var173;
      this.scorpiusBribe120 = var175;
      this.scorpiusBribe144 = var177;
      this.scorpiusBribe168 = var179;
      this.scorpiusBribe192 = var181;
      this.scorpiusBribe216 = var183;
      this.scorpiusBribe240 = var185;
      this.scorpiusBribe264 = var187;
      this.scorpiusBribe288 = var189;
      this.scorpiusBribe312 = var191;
      this.scorpiusBribe336 = var193;
      this.scorpiusBribe360 = var195;
   }
}
