'use strict'

homeController = angular.module 'soundTasticApp'

homeController.controller 'HomeCtrl', [
  '$scope', 'Music'
  ($scope, Music) ->

    $scope.searchType = [
      {key: 'ALL', value: 'Todo', selected: true},
      {key: 'ARTIST', value: 'Artista'},
      {key: 'ALBUM', value: 'Album'},
      {key: 'TRACK', value: 'Pista'},
      {key: 'TAG', value: 'Etiqueta'},
      {key: 'VENUE', value: 'Locacion'},
      {key: 'RADIO', value: 'Radio'}
    ]

    $scope.selectOption = (type) ->
      $node = $('#type-'+type)
      $checkbox = $('#check-type-'+type)
      $node.toggleClass 'text-warning'
      $checkbox.prop('checked', not $checkbox.is ':checked')
      return

    $scope.checkboxChanged = ->
      $checkboxSelected = $('input:checked[value!=ALL].check-type')

    $scope.search = (query) ->
      console.log "===> Search for: #{query}"

      Music.get q: query,
          (result) ->
            console.log result
            return

      return

    return
  ]
