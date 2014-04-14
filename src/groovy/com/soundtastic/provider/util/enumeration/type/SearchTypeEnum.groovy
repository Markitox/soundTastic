package com.soundtastic.provider.util.enumeration.type

public enum SearchTypeEnum {
  ARTIST  ('sf.lastfm.search.type.artist'),
  ALBUM   ('sf.lastfm.search.type.album'),
  EVENT   ('sf.lastfm.search.type.event'),
  TRACK   ('sf.lastfm.search.type.track')

  private final String codeMessage

  SearchTypeEnum(String codeMessage){
    this.codeMessage = codeMessage
  }

  String getCodeMessage(){ codeMessage }

  static List<String> getCodeMessages(){
    SearchTypeEnum.values()*.getCodeMessage()
  }
}