package com.soundtastic.service

import com.soundtastic.provider.lastfm.LastFmProviderService
import com.soundtastic.provider.util.enumeration.type.SearchTypeEnum
import org.grails.databinding.BindUsing

import static com.soundtastic.provider.util.enumeration.type.SearchTypeEnum.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SearchService {

  LastFmProviderService lastFmProviderService

  Map search(SearchCommand searchCommand) {
    def responseMap = [:]

    if (searchCommand.type.contains(ALL)) {
      responseMap << lastFmProviderService.searchByArtist(searchCommand.q)
      responseMap << lastFmProviderService.searchByAlbum(searchCommand.q)
      responseMap << lastFmProviderService.searchByTrack(searchCommand.q)
      responseMap << lastFmProviderService.searchByTag(searchCommand.q)
      responseMap << lastFmProviderService.searchByVenue(searchCommand.q)
      responseMap << lastFmProviderService.searchByRadio(searchCommand.q)

      return responseMap
    }

    for (SearchTypeEnum type : searchCommand.type) {
      switch (type) {
        case ARTIST:
          responseMap << lastFmProviderService.searchByArtist(searchCommand.q)
          break
        case ALBUM:
          responseMap << lastFmProviderService.searchByAlbum(searchCommand.q)
          break
        case TRACK:
          responseMap << lastFmProviderService.searchByTrack(searchCommand.q)
          break
        case TAG:
          responseMap << lastFmProviderService.searchByTag(searchCommand.q)
          break
        case VENUE:
          responseMap << lastFmProviderService.searchByVenue(searchCommand.q)
          break
        case RADIO:
          responseMap << lastFmProviderService.searchByRadio(searchCommand.q)
      }
    }

    responseMap
  }
}

@grails.validation.Validateable
class SearchCommand {
  String q
  @BindUsing({ object, source ->
    source['type'].toString().toUpperCase().split(',')
  })
  List<SearchTypeEnum> type = [SearchTypeEnum.ALL]
}