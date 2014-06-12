'use strict'

searchController = angular.module 'soundTasticApp'

searchController.controller 'SearchCtrl', [
  '$scope', '$routeParams', 'Music'
  ($scope, $routeParams, Music) ->
    query = $routeParams.query

    Music.get q: query,
      (result) ->
        $scope.albums = result.result.albums
        $scope.artists = result.result.artists
        $scope.tracks = result.result.tracks
        return

    return
  ]
