package com.soundtastic.provider.lastfm

import de.umass.lastfm.*

class LastFmProviderService {

  def grailsApplication

  def search = { Class typeObject, String q ->
    def response = typeObject.invokeMethod('search', [q, key].toArray())
    [("${typeObject.simpleName.toLowerCase()}s"): response]
  }

  def searchByArtist = this.search.curry(Artist.class)

  def searchByAlbum  = this.search.curry(Album.class)

  def searchByTrack  = this.search.curry(Track.class)

  def searchByTag    = this.search.curry(Tag.class)

  def searchByVenue  = this.search.curry(Venue.class)

  def searchByRadio  = this.search.curry(Radio.class)

  private String getKey() {
    grailsApplication.config.last.fm.account.api.key
  }

}
