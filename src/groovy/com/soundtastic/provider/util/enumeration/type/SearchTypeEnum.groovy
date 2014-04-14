package com.soundtastic.provider.util.enumeration.type

public enum SearchTypeEnum {
  ARTIST  ('soundTastic.search.type.artist'),
  ALBUM   ('soundTastic.search.type.album'),
  TRACK   ('soundTastic.search.type.track'),
  USER    ('soundTastic.search.type.user'),
  TAG     ('soundTastic.search.type.tag'),
  VENUE   ('soundTastic.search.type.venue'),
  RADIO   ('soundTastic.search.type.radio'),
  ALL     ('soundTastic.search.type.all')

  private final String codeMessage

  SearchTypeEnum(String codeMessage){
    this.codeMessage = codeMessage
  }

  String getCodeMessage(){ codeMessage }

  static List<String> getCodeMessages(){
    SearchTypeEnum.values()*.getCodeMessage()
  }
}
