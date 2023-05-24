package com.github.edarke.mongodb.driver;


import com.github.edarke.mongodb.driver.Count.Type;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.search.FuzzySearchOptions;
import com.mongodb.client.model.search.SearchCount;
import com.mongodb.client.model.search.SearchOperator;
import com.mongodb.client.model.search.SearchOptions;
import com.mongodb.client.model.search.SearchPath;
import com.mongodb.client.model.search.SearchScore;
import com.mongodb.client.model.search.SearchScoreExpression;
import java.util.Arrays;
import java.util.List;
import org.bson.conversions.Bson;

public class Mongodb {

  public static void main(String[] args) {
    Search searchSort = Search.newBuilder()
        .setText(Text.newBuilder()
            .addPath(FieldPath.newBuilder().setPath("title"))
            .addPath(FieldPath.newBuilder().setPath("foo"))
            .addQuery("Future"))
        .addSortBetaV1(SortField.newBuilder().setKey(FieldPath.newBuilder().setPath("title"))
            .setValue(SortOrder.ASC))
        .addSortBetaV1(SortField.newBuilder().setKey(FieldPath.newBuilder().setPath("_id"))
            .setValue(SortOrder.DESC))
        .build();
    System.out.println(Proto2Bson.toBson(searchSort));

    Search search = Search.newBuilder()
        .setText(Text.newBuilder()
            .addPath(FieldPath.newBuilder().setPath("title"))
            .addPath(FieldPath.newBuilder().setPath("foo"))
            .addQuery("Future")
            .setFuzzy(FuzzyOption.newBuilder().setMaxEdits(2).setPrefixLength(3))
            .setScore(Score.newBuilder()
                .setFunction(FunctionScore.newBuilder()
                    .setAdd(AddExpression.newBuilder()
                        .addValues(FunctionScore.newBuilder().setConstant(1f))
                        .addValues(FunctionScore.newBuilder().setConstant(2f))
                    ))))
        .setCount(Count.newBuilder().setType(Type.LOWER_BOUND).setThreshold(42).build())
        .build();


    Bson textSearch = Aggregates.search(
        SearchOperator.text(
                Arrays.asList(SearchPath.fieldPath("title"), SearchPath.fieldPath("foo")),
                List.of("Future"))
            .fuzzy(FuzzySearchOptions.fuzzySearchOptions().maxEdits(2).prefixLength(3))
            .score(SearchScore.function(SearchScoreExpression.addExpression(
                Arrays.asList(SearchScoreExpression.constantExpression(1f),
                    SearchScoreExpression.constantExpression(2f))))),
        SearchOptions.searchOptions().count(SearchCount.lowerBound().threshold(42)));

    System.out.println(Proto2Bson.toBson(search));
    System.out.println(textSearch.toBsonDocument());
  }
}
