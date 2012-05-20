package com.techthinker.CAAndroid.Util;


public class XMLParser {

	// parse the resource XML file in the server and get it's info
//	public List<Dictionary> ParseResXML(String resPath) throws Exception {
//		List<Dictionary> allDics = null;
//		Dictionary dic = null;
//		String elementName = null;
//
//		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
//		XmlPullParser xpp = factory.newPullParser();
//		xpp.setInput(
//				new HttpHelper().getInputStreamFromUrl(resPath), "UTF-8");
//		int eventType = xpp.getEventType();
//		// parse dictionary
//		while (eventType != XmlPullParser.END_DOCUMENT) {
//			if (eventType == XmlPullParser.START_DOCUMENT) {
//				allDics = new ArrayList<Dictionary>();
//			} else if (eventType == XmlPullParser.START_TAG) {
//				elementName = xpp.getName();
//				if ("dictionary".equals(elementName)) {
//					dic = new Dictionary();
//					elementName = null;
//				}
//			} else if (eventType == XmlPullParser.END_TAG) {
//				elementName = xpp.getName();
//				if ("dictionary".equals(elementName)) {
//					allDics.add(dic);
//					dic = null;
//				}
//				elementName=null;
//			} else if (eventType == XmlPullParser.TEXT) {
//				if ("name".equals(elementName)) {
//					dic.setName(xpp.getText());
//				} else if ("version".equals(elementName)) {
//					dic.setVersion(xpp.getText());
//				} else if ("description".equals(elementName)) {
//					dic.setDescription(xpp.getText());
//				} else if ("size".equals(elementName)) {
//					dic.setSize(Float.parseFloat(xpp.getText().trim()));
//				} else if ("listsNum".equals(elementName)) {
//					dic.setListsNum(Integer.parseInt(xpp.getText()));
//				} else if ("wordsNum".equals(elementName)) {
//					dic.setWordsNum(Integer.parseInt(xpp.getText()));
//				}
//			}
//			eventType = xpp.next();
//		}
//		return allDics;
//	}
//
//	// parse the dictionary XML file and get it's simple info
//	public Dictionary simpleParseDicXML(InputStream input) throws Exception {
//		Dictionary dictionary = null;
//		String elementName = null;
//
//		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
//		XmlPullParser xpp = factory.newPullParser();
//		xpp.setInput(input, "UTF-8");
//		int eventType = xpp.getEventType();
//		// parse dictionary
//		while (eventType != XmlPullParser.END_DOCUMENT) {
//			if (eventType == XmlPullParser.START_DOCUMENT) {
//				dictionary = new Dictionary();
//			} else if (eventType == XmlPullParser.START_TAG) {
//				elementName = xpp.getName();
//			} else if (eventType == XmlPullParser.END_TAG) {
//				elementName = null;
//			} else if (eventType == XmlPullParser.TEXT) {
//				if ("name".equals(elementName)) {
//					dictionary.setName(xpp.getText());
//				} else if ("version".equals(elementName)) {
//					dictionary.setVersion(xpp.getText());
//				} else if ("description".equals(elementName)) {
//					dictionary.setDescription(xpp.getText());
//				} else if ("size".equals(elementName)) {
//					dictionary.setSize(Float.parseFloat(xpp.getText().trim()));
//				} else if ("listsNum".equals(elementName)) {
//					dictionary.setListsNum(Integer.parseInt(xpp.getText()));
//				} else if ("wordsNum".equals(elementName)) {
//					dictionary.setWordsNum(Integer.parseInt(xpp.getText()));
//					break;
//				}
//			}
//			eventType = xpp.next();
//		}
//		return dictionary;
//	}
//
//	// parse the dictionary XML file and get all it's info to a Dictionary
//	// Object
//	public Dictionary parseXMLToDictionary(InputStream input) throws Exception {
//
//		Dictionary dictionary = null;
//		Lists tempList = null;
//		Word tempWord = null;
//		String elementName = null;
//
//		XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
//		XmlPullParser xpp = factory.newPullParser();
//		xpp.setInput(input, "UTF-8");
//		int eventType = xpp.getEventType();
//		// parse dictionary
//		while (eventType != XmlPullParser.END_DOCUMENT) {
//			if (eventType == XmlPullParser.START_DOCUMENT) {
//				dictionary = new Dictionary();
//				dictionary.setAllLists(new ArrayList<Lists>());
//			} else if (eventType == XmlPullParser.START_TAG) {
//				elementName = xpp.getName();
//				// parse lists
//				if ("list".equals(elementName)) {
//					tempList = new Lists();
//					tempList.setAllWords(new ArrayList<Word>());
//					eventType = xpp.next();
//					while (true) {
//						if (eventType == XmlPullParser.START_TAG) {
//							// parse words
//							elementName = xpp.getName();
//							if ("word".equals(elementName)) {
//								tempWord = new Word();
//								eventType = xpp.next();
//								while (true) {
//									if (eventType == XmlPullParser.START_TAG) {
//										elementName = xpp.getName();
//									} else if (eventType == XmlPullParser.END_TAG) {
//										elementName = xpp.getName();
//										if ("word".equals(elementName)) {
//											tempList.getAllWords()
//													.add(tempWord);
//											tempWord = null;
//											break;
//										}
//										elementName = null;
//									} else if (eventType == XmlPullParser.TEXT) {
//										if ("spell".equals(elementName)) {
//											tempWord.setSpell(xpp.getText());
//										} else if ("pronunciation"
//												.equals(elementName)) {
//											tempWord.setPronunciation(xpp
//													.getText());
//										} else if ("enExplain"
//												.equals(elementName)) {
//											tempWord.setEnExplain(xpp.getText());
//										} else if ("zhExplain"
//												.equals(elementName)) {
//											tempWord.setZhExplain(xpp.getText());
//										} else if ("detail".equals(elementName)) {
//											tempWord.setDetail(xpp.getText());
//										} else if ("rate".equals(elementName)) {
//											tempWord.setRate(Integer
//													.parseInt(xpp.getText()));
//										}
//									}
//									eventType = xpp.next();
//								}
//							}
//						} else if (eventType == XmlPullParser.END_TAG) {
//							elementName = xpp.getName();
//							if ("list".equals(elementName)) {
//								dictionary.getAllLists().add(tempList);
//								tempList = null;
//								break;
//							}
//							elementName = null;
//						} else if (eventType == XmlPullParser.TEXT) {
//
//							if ("list_num".equals(elementName)) {
//								tempList.setList_num(Integer.parseInt(xpp
//										.getText()));
//							} else if ("name".equals(elementName)) {
//								tempList.setName(xpp.getText());
//							} else if ("wordsNum".equals(elementName)) {
//								tempList.setWordsNum(Integer.parseInt(xpp
//										.getText()));
//							}
//						}
//						eventType = xpp.next();
//					}
//				}
//			} else if (eventType == XmlPullParser.END_TAG) {
//				elementName = null;
//			} else if (eventType == XmlPullParser.TEXT) {
//				if ("name".equals(elementName)) {
//					dictionary.setName(xpp.getText());
//				} else if ("version".equals(elementName)) {
//					dictionary.setVersion(xpp.getText());
//				} else if ("description".equals(elementName)) {
//					dictionary.setDescription(xpp.getText());
//				} else if ("size".equals(elementName)) {
//					dictionary.setSize(Float.parseFloat(xpp.getText().trim()));
//				} else if ("listsNum".equals(elementName)) {
//					dictionary.setListsNum(Integer.parseInt(xpp.getText()));
//				} else if ("wordsNum".equals(elementName)) {
//					dictionary.setWordsNum(Integer.parseInt(xpp.getText()));
//				}
//			}
//			eventType = xpp.next();
//		}
//		return dictionary;
//	}
}
