package com.soundtastic

import com.soundtastic.provider.lastfm.LastfmSearchTypeEnum

class MusicController {

  def index() { }

  def search( SearchCommand searchCommand ) {
println "Search: ${searchCommand.dump()}"
    render view: '/index'
  }

}


class SearchCommand {
  String q
  LastfmSearchTypeEnum type
}