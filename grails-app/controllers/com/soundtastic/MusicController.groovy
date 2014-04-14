package com.soundtastic

import grails.converters.JSON

class MusicController {

  def index() {
    render (['result': 'Ok', 'type': request.method] as JSON)
  }

  def save() {
    render (['result': 'Ok', 'type': request.method] as JSON)
  }

  def show() {
    render (['result': 'Ok', 'type': request.method, 'id': params.id] as JSON)
  }

  def update() {
    render (['result': 'Ok', 'type': request.method, 'id': params.id] as JSON)
  }

}

