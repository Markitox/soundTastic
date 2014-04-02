'use strict'

mainController = angular.module 'soundTasticApp'

mainController.controller 'MainCtrl', [
  '$scope',
  ($scope) ->
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma']

    $scope.search = (query) ->
      console.log "===> #{query}"
      return

    return
  ]
