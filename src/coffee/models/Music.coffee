'use strict'

Music = angular.module 'soundTasticModels', ['ngResource']

Music.factory 'Music', [
  '$resource'
  ($resource) ->
    $resource 'music/search', {},
      {
         search: method: 'GET'
      }
  ]
