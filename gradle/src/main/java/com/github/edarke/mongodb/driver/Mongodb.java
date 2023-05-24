package com.github.edarke.mongodb.driver;


import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.search.SearchOperator;
import com.mongodb.client.model.search.SearchPath;
import java.util.Arrays;
import org.bson.conversions.Bson;

public class Mongodb {

  public static void main(String[] args) {
    Search searchSort = Search.newBuilder()
        .setText(Text.newBuilder()
            .addPath(FieldPath.newBuilder().setPath("title"))
            .addPath(FieldPath.newBuilder().setPath("foo"))
            .addQuery("Future"))
        .addSortBetaV1(SortField.newBuilder().setKey(FieldPath.newBuilder().setPath("title")).setValue(SortOrder.ASC))
        .addSortBetaV1(SortField.newBuilder().setKey(FieldPath.newBuilder().setPath("_id")).setValue(SortOrder.DESC))
        .build();
    System.out.println(Proto2Bson.toBson(searchSort));

    Search search = Search.newBuilder()
        .setText(Text.newBuilder()
            .addPath(FieldPath.newBuilder().setPath("title"))
            .addPath(FieldPath.newBuilder().setPath("foo"))
            .addQuery("Future"))
        .build();

    Bson textSearch = Aggregates.search(
        SearchOperator.text(Arrays.asList(SearchPath.fieldPath("title"), SearchPath.fieldPath("foo")), Arrays.asList("Future")));

    System.out.println(Proto2Bson.toBson(search));
    System.out.println(textSearch.toBsonDocument());
  }
}