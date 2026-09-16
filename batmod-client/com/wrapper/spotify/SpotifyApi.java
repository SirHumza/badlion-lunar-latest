package com.wrapper.spotify;

import com.google.gson.JsonArray;
import com.neovisionaries.i18n.CountryCode;
import com.wrapper.spotify.enums.ModelObjectType;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRefreshRequest;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeRequest;
import com.wrapper.spotify.requests.authorization.authorization_code.AuthorizationCodeUriRequest;
import com.wrapper.spotify.requests.authorization.client_credentials.ClientCredentialsRequest;
import com.wrapper.spotify.requests.data.albums.GetAlbumRequest;
import com.wrapper.spotify.requests.data.albums.GetAlbumsTracksRequest;
import com.wrapper.spotify.requests.data.albums.GetSeveralAlbumsRequest;
import com.wrapper.spotify.requests.data.artists.GetArtistRequest;
import com.wrapper.spotify.requests.data.artists.GetArtistsAlbumsRequest;
import com.wrapper.spotify.requests.data.artists.GetArtistsRelatedArtistsRequest;
import com.wrapper.spotify.requests.data.artists.GetArtistsTopTracksRequest;
import com.wrapper.spotify.requests.data.artists.GetSeveralArtistsRequest;
import com.wrapper.spotify.requests.data.browse.GetCategoryRequest;
import com.wrapper.spotify.requests.data.browse.GetCategorysPlaylistsRequest;
import com.wrapper.spotify.requests.data.browse.GetListOfCategoriesRequest;
import com.wrapper.spotify.requests.data.browse.GetListOfFeaturedPlaylistsRequest;
import com.wrapper.spotify.requests.data.browse.GetListOfNewReleasesRequest;
import com.wrapper.spotify.requests.data.browse.GetRecommendationsRequest;
import com.wrapper.spotify.requests.data.browse.miscellaneous.GetAvailableGenreSeedsRequest;
import com.wrapper.spotify.requests.data.follow.CheckCurrentUserFollowsArtistsOrUsersRequest;
import com.wrapper.spotify.requests.data.follow.CheckUsersFollowPlaylistRequest;
import com.wrapper.spotify.requests.data.follow.FollowArtistsOrUsersRequest;
import com.wrapper.spotify.requests.data.follow.FollowPlaylistRequest;
import com.wrapper.spotify.requests.data.follow.GetUsersFollowedArtistsRequest;
import com.wrapper.spotify.requests.data.follow.UnfollowArtistsOrUsersRequest;
import com.wrapper.spotify.requests.data.follow.UnfollowPlaylistRequest;
import com.wrapper.spotify.requests.data.library.CheckUsersSavedAlbumsRequest;
import com.wrapper.spotify.requests.data.library.CheckUsersSavedTracksRequest;
import com.wrapper.spotify.requests.data.library.GetCurrentUsersSavedAlbumsRequest;
import com.wrapper.spotify.requests.data.library.GetUsersSavedTracksRequest;
import com.wrapper.spotify.requests.data.library.RemoveAlbumsForCurrentUserRequest;
import com.wrapper.spotify.requests.data.library.RemoveUsersSavedTracksRequest;
import com.wrapper.spotify.requests.data.library.SaveAlbumsForCurrentUserRequest;
import com.wrapper.spotify.requests.data.library.SaveTracksForUserRequest;
import com.wrapper.spotify.requests.data.personalization.GetUsersTopArtistsAndTracksRequest;
import com.wrapper.spotify.requests.data.personalization.interfaces.IArtistTrackModelObject;
import com.wrapper.spotify.requests.data.personalization.simplified.GetUsersTopArtistsRequest;
import com.wrapper.spotify.requests.data.personalization.simplified.GetUsersTopTracksRequest;
import com.wrapper.spotify.requests.data.player.GetCurrentUsersRecentlyPlayedTracksRequest;
import com.wrapper.spotify.requests.data.player.GetInformationAboutUsersCurrentPlaybackRequest;
import com.wrapper.spotify.requests.data.player.GetUsersAvailableDevicesRequest;
import com.wrapper.spotify.requests.data.player.GetUsersCurrentlyPlayingTrackRequest;
import com.wrapper.spotify.requests.data.player.PauseUsersPlaybackRequest;
import com.wrapper.spotify.requests.data.player.SeekToPositionInCurrentlyPlayingTrackRequest;
import com.wrapper.spotify.requests.data.player.SetRepeatModeOnUsersPlaybackRequest;
import com.wrapper.spotify.requests.data.player.SetVolumeForUsersPlaybackRequest;
import com.wrapper.spotify.requests.data.player.SkipUsersPlaybackToNextTrackRequest;
import com.wrapper.spotify.requests.data.player.SkipUsersPlaybackToPreviousTrackRequest;
import com.wrapper.spotify.requests.data.player.StartResumeUsersPlaybackRequest;
import com.wrapper.spotify.requests.data.player.ToggleShuffleForUsersPlaybackRequest;
import com.wrapper.spotify.requests.data.player.TransferUsersPlaybackRequest;
import com.wrapper.spotify.requests.data.playlists.AddTracksToPlaylistRequest;
import com.wrapper.spotify.requests.data.playlists.ChangePlaylistsDetailsRequest;
import com.wrapper.spotify.requests.data.playlists.CreatePlaylistRequest;
import com.wrapper.spotify.requests.data.playlists.GetListOfCurrentUsersPlaylistsRequest;
import com.wrapper.spotify.requests.data.playlists.GetListOfUsersPlaylistsRequest;
import com.wrapper.spotify.requests.data.playlists.GetPlaylistCoverImageRequest;
import com.wrapper.spotify.requests.data.playlists.GetPlaylistRequest;
import com.wrapper.spotify.requests.data.playlists.GetPlaylistsTracksRequest;
import com.wrapper.spotify.requests.data.playlists.RemoveTracksFromPlaylistRequest;
import com.wrapper.spotify.requests.data.playlists.ReorderPlaylistsTracksRequest;
import com.wrapper.spotify.requests.data.playlists.ReplacePlaylistsTracksRequest;
import com.wrapper.spotify.requests.data.playlists.UploadCustomPlaylistCoverImageRequest;
import com.wrapper.spotify.requests.data.search.SearchItemRequest;
import com.wrapper.spotify.requests.data.search.simplified.SearchAlbumsRequest;
import com.wrapper.spotify.requests.data.search.simplified.SearchArtistsRequest;
import com.wrapper.spotify.requests.data.search.simplified.SearchPlaylistsRequest;
import com.wrapper.spotify.requests.data.search.simplified.SearchTracksRequest;
import com.wrapper.spotify.requests.data.tracks.GetAudioAnalysisForTrackRequest;
import com.wrapper.spotify.requests.data.tracks.GetAudioFeaturesForSeveralTracksRequest;
import com.wrapper.spotify.requests.data.tracks.GetAudioFeaturesForTrackRequest;
import com.wrapper.spotify.requests.data.tracks.GetSeveralTracksRequest;
import com.wrapper.spotify.requests.data.tracks.GetTrackRequest;
import com.wrapper.spotify.requests.data.users_profile.GetCurrentUsersProfileRequest;
import com.wrapper.spotify.requests.data.users_profile.GetUsersProfileRequest;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

public class SpotifyApi {
   public static final String DEFAULT_AUTHENTICATION_HOST = "accounts.spotify.com";
   public static final int DEFAULT_AUTHENTICATION_PORT = 443;
   public static final String DEFAULT_AUTHENTICATION_SCHEME = "https";
   public static final String DEFAULT_HOST = "api.spotify.com";
   public static final IHttpManager DEFAULT_HTTP_MANAGER = new SpotifyHttpManager.Builder().build();
   public static final int DEFAULT_PORT = 443;
   public static final String DEFAULT_SCHEME = "https";
   public static final Logger LOGGER = Logger.getLogger(SpotifyApi.class.getName());
   private static final ThreadLocal<SimpleDateFormat> SIMPLE_DATE_FORMAT = new ThreadLocal<SimpleDateFormat>() {
      protected SimpleDateFormat initialValue() {
         return SpotifyApi.makeSimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", "GMT");
      }
   };
   private final IHttpManager httpManager;
   private final String scheme;
   private final String host;
   private final Integer port;
   private final String proxyUrl;
   private final Integer proxyPort;
   private final Integer proxyUsername;
   private final Integer proxyPassword;
   private final String clientId;
   private final String clientSecret;
   private final URI redirectUri;
   private String accessToken;
   private String refreshToken;

   private SpotifyApi(SpotifyApi.Builder builder) {
      assert builder.httpManager != null;
      this.httpManager = builder.httpManager;
      this.scheme = builder.scheme;
      this.host = builder.host;
      this.port = builder.port;
      this.proxyUrl = builder.proxyUrl;
      this.proxyPort = builder.proxyPort;
      this.proxyUsername = builder.proxyUsername;
      this.proxyPassword = builder.proxyPassword;
      this.clientId = builder.clientId;
      this.clientSecret = builder.clientSecret;
      this.redirectUri = builder.redirectUri;
      this.accessToken = builder.accessToken;
      this.refreshToken = builder.refreshToken;
   }

   public static SpotifyApi.Builder builder() {
      return new SpotifyApi.Builder();
   }

   public static String concat(String[] parts, char character) {
      StringBuilder stringBuilder = new StringBuilder();

      for (String part : parts) {
         stringBuilder.append(part).append(character);
      }

      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      return stringBuilder.toString();
   }

   public static Date parseDefaultDate(String date) throws ParseException {
      return SIMPLE_DATE_FORMAT.get().parse(date);
   }

   public static String formatDefaultDate(Date date) {
      return SIMPLE_DATE_FORMAT.get().format(date);
   }

   public static SimpleDateFormat makeSimpleDateFormat(String pattern, String id) {
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
      simpleDateFormat.setTimeZone(TimeZone.getTimeZone(id));
      return simpleDateFormat;
   }

   public IHttpManager getHttpManager() {
      return this.httpManager;
   }

   public String getScheme() {
      return this.scheme;
   }

   public String getHost() {
      return this.host;
   }

   public Integer getPort() {
      return this.port;
   }

   public String getProxyUrl() {
      return this.proxyUrl;
   }

   public Integer getProxyPort() {
      return this.proxyPort;
   }

   public Integer getProxyUsername() {
      return this.proxyUsername;
   }

   public Integer getProxyPassword() {
      return this.proxyPassword;
   }

   public String getClientId() {
      return this.clientId;
   }

   public String getClientSecret() {
      return this.clientSecret;
   }

   public URI getRedirectURI() {
      return this.redirectUri;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
   }

   public String getRefreshToken() {
      return this.refreshToken;
   }

   public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
   }

   public AuthorizationCodeRefreshRequest.Builder authorizationCodeRefresh(String client_id, String client_secret, String refresh_token) {
      return new AuthorizationCodeRefreshRequest.Builder(client_id, client_secret)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .grant_type("refresh_token")
         .refresh_token(refresh_token);
   }

   public AuthorizationCodeRefreshRequest.Builder authorizationCodeRefresh() {
      return new AuthorizationCodeRefreshRequest.Builder(this.clientId, this.clientSecret)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .grant_type("refresh_token")
         .refresh_token(this.refreshToken);
   }

   public AuthorizationCodeRequest.Builder authorizationCode(String client_id, String client_secret, String code, URI redirect_uri) {
      return new AuthorizationCodeRequest.Builder(this.clientId, this.clientSecret)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .grant_type("authorization_code")
         .code(code)
         .redirect_uri(redirect_uri);
   }

   public AuthorizationCodeRequest.Builder authorizationCode(String code) {
      return new AuthorizationCodeRequest.Builder(this.clientId, this.clientSecret)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .grant_type("authorization_code")
         .code(code)
         .redirect_uri(this.redirectUri);
   }

   public AuthorizationCodeUriRequest.Builder authorizationCodeUri(String client_id, URI redirect_uri) {
      return new AuthorizationCodeUriRequest.Builder()
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .client_id(client_id)
         .response_type("code")
         .redirect_uri(redirect_uri);
   }

   public AuthorizationCodeUriRequest.Builder authorizationCodeUri() {
      return new AuthorizationCodeUriRequest.Builder()
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .client_id(this.clientId)
         .response_type("code")
         .redirect_uri(this.redirectUri);
   }

   public ClientCredentialsRequest.Builder clientCredentials() {
      return new ClientCredentialsRequest.Builder(this.clientId, this.clientSecret)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .grant_type("client_credentials");
   }

   public GetAlbumRequest.Builder getAlbum(String id) {
      return new GetAlbumRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id);
   }

   public GetAlbumsTracksRequest.Builder getAlbumsTracks(String id) {
      return new GetAlbumsTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id);
   }

   public GetSeveralAlbumsRequest.Builder getSeveralAlbums(String... ids) {
      return new GetSeveralAlbumsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(concat(ids, ','));
   }

   public GetArtistRequest.Builder getArtist(String id) {
      return new GetArtistRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id);
   }

   public GetArtistsAlbumsRequest.Builder getArtistsAlbums(String id) {
      return new GetArtistsAlbumsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id);
   }

   public GetArtistsTopTracksRequest.Builder getArtistsTopTracks(String id, CountryCode country) {
      return new GetArtistsTopTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id).country(country);
   }

   public GetArtistsRelatedArtistsRequest.Builder getArtistsRelatedArtists(String id) {
      return new GetArtistsRelatedArtistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id);
   }

   public GetSeveralArtistsRequest.Builder getSeveralArtists(String... ids) {
      return new GetSeveralArtistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(concat(ids, ','));
   }

   public GetCategoryRequest.Builder getCategory(String category_id) {
      return new GetCategoryRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).category_id(category_id);
   }

   public GetCategorysPlaylistsRequest.Builder getCategorysPlaylists(String category_id) {
      return new GetCategorysPlaylistsRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .category_id(category_id);
   }

   public GetListOfCategoriesRequest.Builder getListOfCategories() {
      return new GetListOfCategoriesRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetListOfFeaturedPlaylistsRequest.Builder getListOfFeaturedPlaylists() {
      return new GetListOfFeaturedPlaylistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetListOfNewReleasesRequest.Builder getListOfNewReleases() {
      return new GetListOfNewReleasesRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetRecommendationsRequest.Builder getRecommendations() {
      return new GetRecommendationsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetAvailableGenreSeedsRequest.Builder getAvailableGenreSeeds() {
      return new GetAvailableGenreSeedsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public CheckCurrentUserFollowsArtistsOrUsersRequest.Builder checkCurrentUserFollowsArtistsOrUsers(ModelObjectType type, String[] ids) {
      return new CheckCurrentUserFollowsArtistsOrUsersRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .type(type)
         .ids(concat(ids, ','));
   }

   public CheckUsersFollowPlaylistRequest.Builder checkUsersFollowPlaylist(String owner_id, String playlist_id, String[] ids) {
      return new CheckUsersFollowPlaylistRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .owner_id(owner_id)
         .playlist_id(playlist_id)
         .ids(concat(ids, ','));
   }

   public FollowArtistsOrUsersRequest.Builder followArtistsOrUsers(ModelObjectType type, String[] ids) {
      return new FollowArtistsOrUsersRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .type(type)
         .ids(concat(ids, ','));
   }

   public FollowArtistsOrUsersRequest.Builder followArtistsOrUsers(ModelObjectType type, JsonArray ids) {
      return new FollowArtistsOrUsersRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).type(type).ids(ids);
   }

   public FollowPlaylistRequest.Builder followPlaylist(String owner_id, String playlist_id, boolean public_) {
      return new FollowPlaylistRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .owner_id(owner_id)
         .playlist_id(playlist_id)
         .public_(public_);
   }

   public GetUsersFollowedArtistsRequest.Builder getUsersFollowedArtists(ModelObjectType type) {
      return new GetUsersFollowedArtistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).type(type);
   }

   public UnfollowArtistsOrUsersRequest.Builder unfollowArtistsOrUsers(ModelObjectType type, String[] ids) {
      return new UnfollowArtistsOrUsersRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .type(type)
         .ids(concat(ids, ','));
   }

   public UnfollowPlaylistRequest.Builder unfollowPlaylist(String owner_id, String playlist_id) {
      return new UnfollowPlaylistRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .owner_id(owner_id)
         .playlist_id(playlist_id);
   }

   public CheckUsersSavedAlbumsRequest.Builder checkUsersSavedAlbums(String... ids) {
      return new CheckUsersSavedAlbumsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(concat(ids, ','));
   }

   public CheckUsersSavedTracksRequest.Builder checkUsersSavedTracks(String... ids) {
      return new CheckUsersSavedTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(concat(ids, ','));
   }

   public GetCurrentUsersSavedAlbumsRequest.Builder getCurrentUsersSavedAlbums() {
      return new GetCurrentUsersSavedAlbumsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetUsersSavedTracksRequest.Builder getUsersSavedTracks() {
      return new GetUsersSavedTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public RemoveAlbumsForCurrentUserRequest.Builder removeAlbumsForCurrentUser(String... ids) {
      return new RemoveAlbumsForCurrentUserRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .ids(concat(ids, ','));
   }

   public RemoveUsersSavedTracksRequest.Builder removeUsersSavedTracks(String... ids) {
      return new RemoveUsersSavedTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(concat(ids, ','));
   }

   public SaveAlbumsForCurrentUserRequest.Builder saveAlbumsForCurrentUser(String... ids) {
      return new SaveAlbumsForCurrentUserRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .ids(concat(ids, ','));
   }

   public SaveAlbumsForCurrentUserRequest.Builder saveAlbumsForCurrentUser(JsonArray ids) {
      return new SaveAlbumsForCurrentUserRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(ids);
   }

   public SaveTracksForUserRequest.Builder saveTracksForUser(String... ids) {
      return new SaveTracksForUserRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(concat(ids, ','));
   }

   public SaveTracksForUserRequest.Builder saveTracksForUser(JsonArray ids) {
      return new SaveTracksForUserRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(ids);
   }

   public <T extends IArtistTrackModelObject> GetUsersTopArtistsAndTracksRequest.Builder<T> getUsersTopArtistsAndTracks(ModelObjectType type) {
      return ((GetUsersTopArtistsAndTracksRequest.Builder)new GetUsersTopArtistsAndTracksRequest.Builder(this.accessToken)
            .setDefaults(this.httpManager, this.scheme, this.host, this.port))
         .type(type);
   }

   public GetUsersTopArtistsRequest.Builder getUsersTopArtists() {
      return new GetUsersTopArtistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetUsersTopTracksRequest.Builder getUsersTopTracks() {
      return new GetUsersTopTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetInformationAboutUsersCurrentPlaybackRequest.Builder getInformationAboutUsersCurrentPlayback() {
      return new GetInformationAboutUsersCurrentPlaybackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetCurrentUsersRecentlyPlayedTracksRequest.Builder getCurrentUsersRecentlyPlayedTracks() {
      return new GetCurrentUsersRecentlyPlayedTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetUsersAvailableDevicesRequest.Builder getUsersAvailableDevices() {
      return new GetUsersAvailableDevicesRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetUsersCurrentlyPlayingTrackRequest.Builder getUsersCurrentlyPlayingTrack() {
      return new GetUsersCurrentlyPlayingTrackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public PauseUsersPlaybackRequest.Builder pauseUsersPlayback() {
      return new PauseUsersPlaybackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public SeekToPositionInCurrentlyPlayingTrackRequest.Builder seekToPositionInCurrentlyPlayingTrack(int position_ms) {
      return new SeekToPositionInCurrentlyPlayingTrackRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .position_ms(position_ms);
   }

   public SetRepeatModeOnUsersPlaybackRequest.Builder setRepeatModeOnUsersPlayback(String state) {
      return new SetRepeatModeOnUsersPlaybackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).state(state);
   }

   public SetVolumeForUsersPlaybackRequest.Builder setVolumeForUsersPlayback(int volume_percent) {
      return new SetVolumeForUsersPlaybackRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .volume_percent(volume_percent);
   }

   public SkipUsersPlaybackToNextTrackRequest.Builder skipUsersPlaybackToNextTrack() {
      return new SkipUsersPlaybackToNextTrackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public SkipUsersPlaybackToPreviousTrackRequest.Builder skipUsersPlaybackToPreviousTrack() {
      return new SkipUsersPlaybackToPreviousTrackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public StartResumeUsersPlaybackRequest.Builder startResumeUsersPlayback() {
      return new StartResumeUsersPlaybackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public ToggleShuffleForUsersPlaybackRequest.Builder toggleShuffleForUsersPlayback(boolean state) {
      return new ToggleShuffleForUsersPlaybackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).state(state);
   }

   public TransferUsersPlaybackRequest.Builder transferUsersPlayback(JsonArray device_ids) {
      return new TransferUsersPlaybackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).device_ids(device_ids);
   }

   public AddTracksToPlaylistRequest.Builder addTracksToPlaylist(String user_id, String playlist_id, String[] uris) {
      return new AddTracksToPlaylistRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id)
         .uris(concat(uris, ','));
   }

   public AddTracksToPlaylistRequest.Builder addTracksToPlaylist(String user_id, String playlist_id, JsonArray uris) {
      return new AddTracksToPlaylistRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id)
         .uris(uris);
   }

   public ChangePlaylistsDetailsRequest.Builder changePlaylistsDetails(String user_id, String playlist_id) {
      return new ChangePlaylistsDetailsRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id);
   }

   public CreatePlaylistRequest.Builder createPlaylist(String user_id, String name) {
      return new CreatePlaylistRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).user_id(user_id).name(name);
   }

   public GetListOfCurrentUsersPlaylistsRequest.Builder getListOfCurrentUsersPlaylists() {
      return new GetListOfCurrentUsersPlaylistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetListOfUsersPlaylistsRequest.Builder getListOfUsersPlaylists(String user_id) {
      return new GetListOfUsersPlaylistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).user_id(user_id);
   }

   public GetPlaylistRequest.Builder getPlaylist(String user_id, String playlist_id) {
      return new GetPlaylistRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id);
   }

   public GetPlaylistCoverImageRequest.Builder getPlaylistCoverImage(String user_id, String playlist_id) {
      return new GetPlaylistCoverImageRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id);
   }

   public GetPlaylistsTracksRequest.Builder getPlaylistsTracks(String user_id, String playlist_id) {
      return new GetPlaylistsTracksRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id);
   }

   public RemoveTracksFromPlaylistRequest.Builder removeTracksFromPlaylist(String user_id, String playlist_id, JsonArray tracks) {
      return new RemoveTracksFromPlaylistRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id)
         .tracks(tracks);
   }

   public ReorderPlaylistsTracksRequest.Builder reorderPlaylistsTracks(String user_id, String playlist_id, int range_start, int insert_before) {
      return new ReorderPlaylistsTracksRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id)
         .range_start(range_start)
         .insert_before(insert_before);
   }

   public ReplacePlaylistsTracksRequest.Builder replacePlaylistsTracks(String user_id, String playlist_id, String[] uris) {
      return new ReplacePlaylistsTracksRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id)
         .uris(concat(uris, ','));
   }

   public ReplacePlaylistsTracksRequest.Builder replacePlaylistsTracks(String user_id, String playlist_id, JsonArray uris) {
      return new ReplacePlaylistsTracksRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id)
         .uris(uris);
   }

   public UploadCustomPlaylistCoverImageRequest.Builder uploadCustomPlaylistCoverImage(String user_id, String playlist_id) {
      return new UploadCustomPlaylistCoverImageRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .user_id(user_id)
         .playlist_id(playlist_id);
   }

   public SearchItemRequest.Builder searchItem(String q, String type) {
      return new SearchItemRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).q(q).type(type);
   }

   public SearchAlbumsRequest.Builder searchAlbums(String q) {
      return new SearchAlbumsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).q(q);
   }

   public SearchArtistsRequest.Builder searchArtists(String q) {
      return new SearchArtistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).q(q);
   }

   public SearchPlaylistsRequest.Builder searchPlaylists(String q) {
      return new SearchPlaylistsRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).q(q);
   }

   public SearchTracksRequest.Builder searchTracks(String q) {
      return new SearchTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).q(q);
   }

   public GetAudioAnalysisForTrackRequest.Builder getAudioAnalysisForTrack(String id) {
      return new GetAudioAnalysisForTrackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id);
   }

   public GetAudioFeaturesForTrackRequest.Builder getAudioFeaturesForTrack(String id) {
      return new GetAudioFeaturesForTrackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id);
   }

   public GetAudioFeaturesForSeveralTracksRequest.Builder getAudioFeaturesForSeveralTracks(String... ids) {
      return new GetAudioFeaturesForSeveralTracksRequest.Builder(this.accessToken)
         .setDefaults(this.httpManager, this.scheme, this.host, this.port)
         .ids(concat(ids, ','));
   }

   public GetSeveralTracksRequest.Builder getSeveralTracks(String... ids) {
      return new GetSeveralTracksRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).ids(concat(ids, ','));
   }

   public GetTrackRequest.Builder getTrack(String id) {
      return new GetTrackRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).id(id);
   }

   public GetCurrentUsersProfileRequest.Builder getCurrentUsersProfile() {
      return new GetCurrentUsersProfileRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port);
   }

   public GetUsersProfileRequest.Builder getUsersProfile(String user_id) {
      return new GetUsersProfileRequest.Builder(this.accessToken).setDefaults(this.httpManager, this.scheme, this.host, this.port).user_id(user_id);
   }

   public static class Builder {
      private IHttpManager httpManager = SpotifyApi.DEFAULT_HTTP_MANAGER;
      private String scheme = "https";
      private String host = "api.spotify.com";
      private Integer port = 443;
      private String proxyUrl;
      private Integer proxyPort;
      private Integer proxyUsername;
      private Integer proxyPassword;
      private String clientId;
      private String clientSecret;
      private URI redirectUri;
      private String accessToken;
      private String refreshToken;

      public SpotifyApi.Builder setHttpManager(IHttpManager httpManager) {
         this.httpManager = httpManager;
         return this;
      }

      public SpotifyApi.Builder setScheme(String scheme) {
         this.scheme = scheme;
         return this;
      }

      public SpotifyApi.Builder setHost(String host) {
         this.host = host;
         return this;
      }

      public SpotifyApi.Builder setPort(Integer port) {
         this.port = port;
         return this;
      }

      public SpotifyApi.Builder setProxyUrl(String proxyUrl) {
         this.proxyUrl = proxyUrl;
         return this;
      }

      public SpotifyApi.Builder setProxyPort(Integer proxyPort) {
         this.proxyPort = proxyPort;
         return this;
      }

      public SpotifyApi.Builder setProxyUsername(Integer proxyUsername) {
         this.proxyUsername = proxyUsername;
         return this;
      }

      public SpotifyApi.Builder setProxyPassword(Integer proxyPassword) {
         this.proxyPassword = proxyPassword;
         return this;
      }

      public SpotifyApi.Builder setClientId(String clientId) {
         this.clientId = clientId;
         return this;
      }

      public SpotifyApi.Builder setClientSecret(String clientSecret) {
         this.clientSecret = clientSecret;
         return this;
      }

      public SpotifyApi.Builder setRedirectUri(URI redirectUri) {
         this.redirectUri = redirectUri;
         return this;
      }

      public SpotifyApi.Builder setAccessToken(String accessToken) {
         this.accessToken = accessToken;
         return this;
      }

      public SpotifyApi.Builder setRefreshToken(String refreshToken) {
         this.refreshToken = refreshToken;
         return this;
      }

      public SpotifyApi build() {
         return new SpotifyApi(this);
      }
   }
}
