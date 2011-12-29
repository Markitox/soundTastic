package com.soundtastic.provider.lastfm

public enum LastfmSearchTypeEnum {
  ARTIST  ('sf.lastfm.search.type.artist'),
  ALBUM   ('sf.lastfm.search.type.album'),
  EVENT   ('sf.lastfm.search.type.event'),
  TRACK   ('sf.lastfm.search.type.track')

  private final String codeMessage

  LastfmSearchTypeEnum(String codeMessage){
    this.codeMessage = codeMessage
  }

  String getCodeMessage(){ codeMessage }

  static List<String> getCodeMessages(){
    LastfmSearchTypeEnum.values()*.getCodeMessage()
  }
}