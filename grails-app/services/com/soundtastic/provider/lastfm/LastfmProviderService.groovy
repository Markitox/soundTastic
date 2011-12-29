package com.soundtastic.provider.lastfm

import com.soundtastic.SearchCommand
import static com.soundtastic.provider.lastfm.LastfmSearchTypeEnum.*
import de.umass.lastfm.Artist

class LastfmProviderService {

  def grailsApplication

  Artist search( SearchCommand searchCommand  ) {

    switch( searchCommand.type ){
      case ARTIST:
        return Artist.getInfo( searchCommand.q, grailsApplication.config.last.fm.account.api.key )
    }

  }
}
