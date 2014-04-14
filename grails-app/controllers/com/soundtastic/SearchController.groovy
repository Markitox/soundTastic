package com.soundtastic

import com.soundtastic.service.SearchCommand
import com.soundtastic.service.SearchService
import grails.converters.JSON

class SearchController {

  SearchService searchService

  def index(SearchCommand searchCommand) {
    Map resp = [status: 'Oki', type: request.method]
    resp.result = searchService.search(searchCommand)

    render (resp as JSON)
  }
}
