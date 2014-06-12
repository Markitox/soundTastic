'use strict'

angular.module('soundTasticApp', [
  'ngCookies',
  'ngResource',
  'ngSanitize',
  'ngRoute',
  'soundTasticModels'
]).config ($routeProvider, $locationProvider) ->

  $routeProvider
  .when('/', {
    templateUrl: 'views/home.html'
    controller: 'HomeCtrl'})
  .when('/search/:query'
    templateUrl: 'views/music/results/main.html',
    controller: 'SearchCtrl'
  )
  .when('/about', {
    templateUrl: 'views/about.html'
  })
  .when('/contact', {
    templateUrl: 'views/contact.html'
  })
  .otherwise redirectTo: '/'

#  $locationProvider.html5Mode true

  return
