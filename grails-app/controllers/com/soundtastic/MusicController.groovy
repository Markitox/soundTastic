package com.soundtastic

import com.soundtastic.provider.lastfm.LastfmSearchTypeEnum

class MusicController {

  def lastfmProviderService

  def index() { }

  def search( SearchCommand searchCommand ) {
	def searchResult = lastfmProviderService.search( searchCommand )
    render view: '/index', model: [searchResult: searchResult]
  }

}


class SearchCommand {
  String q
  LastfmSearchTypeEnum type
}